<#
.SYNOPSIS
    Accenture Coding Practice - Test Runner
.DESCRIPTION
    Compiles and runs a Java question file against its test cases.
    Test cases are loaded from the corresponding .tests.json file.
.PARAMETER JavaFile
    Path to the Java question file to test.
.PARAMETER Visible
    Run only visible test cases (default).
.PARAMETER All
    Run all test cases (visible + hidden).
.PARAMETER Hidden
    Run only hidden test cases.
.PARAMETER Timeout
    Timeout in seconds for each test case (default: 5).
.EXAMPLE
    .\scripts\run-test.ps1 .\01-Arrays\14-Accenture-Previous-Questions\Q01-RatCountHouse.java
    .\scripts\run-test.ps1 .\01-Arrays\14-Accenture-Previous-Questions\Q01-RatCountHouse.java -All
    .\scripts\run-test.ps1 .\01-Arrays\14-Accenture-Previous-Questions\Q01-RatCountHouse.java -Visible
#>

param(
    [Parameter(Mandatory=$true, Position=0)]
    [string]$JavaFile,

    [switch]$Visible,
    [switch]$All,
    [switch]$Hidden,
    [int]$Timeout = 5
)

# ============================================================
# CONFIGURATION
# ============================================================

$ErrorActionPreference = "Stop"
$OutputEncoding = [System.Text.Encoding]::UTF8

# Colors
function Write-Header { param([string]$text) Write-Host $text -ForegroundColor Cyan }
function Write-Pass   { param([string]$text) Write-Host $text -ForegroundColor Green }
function Write-Fail   { param([string]$text) Write-Host $text -ForegroundColor Red }
function Write-Warn   { param([string]$text) Write-Host $text -ForegroundColor Yellow }
function Write-Info   { param([string]$text) Write-Host $text -ForegroundColor White }
function Write-Dim    { param([string]$text) Write-Host $text -ForegroundColor DarkGray }

$LINE = "=" * 60
$DASH = "-" * 60

# ============================================================
# RESOLVE FILE PATHS
# ============================================================

# Find repository root (where scripts/ lives)
$ScriptDir = Split-Path -Parent $MyInvocation.MyCommand.Path
$RepoRoot = Split-Path -Parent $ScriptDir

# Resolve Java file path
if ([System.IO.Path]::IsPathRooted($JavaFile)) {
    $JavaFilePath = $JavaFile
} else {
    $JavaFilePath = Join-Path (Get-Location) $JavaFile
}

$JavaFilePath = [System.IO.Path]::GetFullPath($JavaFilePath)

if (-not (Test-Path $JavaFilePath)) {
    Write-Fail "`n$LINE"
    Write-Fail "FILE NOT FOUND"
    Write-Fail $LINE
    Write-Fail "`nCannot find: $JavaFilePath"
    Write-Fail "`nMake sure you provide the correct path to a .java file."
    Write-Fail $LINE
    exit 1
}

$JavaDir = Split-Path -Parent $JavaFilePath
$JavaFileName = [System.IO.Path]::GetFileNameWithoutExtension($JavaFilePath)
$ClassName = $JavaFileName -replace '-', ''

# Detect the actual public class name from the file
$javaContent = Get-Content $JavaFilePath -Raw
if ($javaContent -match 'public\s+class\s+(\w+)') {
    $ClassName = $Matches[1]
}

# Find test file
$TestFile = Join-Path $JavaDir "$JavaFileName.tests.json"
if (-not (Test-Path $TestFile)) {
    # Match by ignoring hyphens in the filename
    $normalizedJavaName = $JavaFileName -replace '-', ''
    $AllTestFiles = Get-ChildItem -Path $JavaDir -Filter "*.tests.json"
    foreach ($tf in $AllTestFiles) {
        $tfBase = $tf.Name -replace '\.tests\.json$', ''
        $normalizedTf = $tfBase -replace '-', ''
        if ($normalizedTf -eq $normalizedJavaName -or $normalizedTf -eq $ClassName.ToLower()) {
            $TestFile = $tf.FullName
            break
        }
    }
}
# Also try matching by class name
if (-not (Test-Path $TestFile)) {
    $TestFile = Join-Path $JavaDir "$ClassName.tests.json"
}

if (-not (Test-Path $TestFile)) {
    Write-Fail "`n$LINE"
    Write-Fail "TEST FILE NOT FOUND"
    Write-Fail $LINE
    Write-Fail "`nExpected: $JavaFileName.tests.json"
    Write-Fail "In directory: $JavaDir"
    Write-Fail "`nCreate a .tests.json file for this question."
    Write-Fail $LINE
    exit 1
}

# Build directory
$BuildDir = Join-Path $RepoRoot ".build"
if (-not (Test-Path $BuildDir)) {
    New-Item -ItemType Directory -Path $BuildDir -Force | Out-Null
}

# ============================================================
# LOAD TEST CASES
# ============================================================

try {
    $TestData = Get-Content $TestFile -Raw | ConvertFrom-Json
} catch {
    Write-Fail "`n$LINE"
    Write-Fail "INVALID TEST FILE"
    Write-Fail $LINE
    Write-Fail "`nCannot parse: $TestFile"
    Write-Fail "Error: $_"
    Write-Fail $LINE
    exit 1
}

$QuestionId = if ($TestData.question_id) { $TestData.question_id } else { "UNKNOWN" }
$QuestionTitle = if ($TestData.title) { $TestData.title } else { $JavaFileName }

# Determine which tests to run
$VisibleTests = @()
$HiddenTests = @()

if ($TestData.visible) {
    $VisibleTests = @($TestData.visible)
}
if ($TestData.hidden) {
    $HiddenTests = @($TestData.hidden)
}

$TestsToRun = @()
$ShowHiddenDetails = $false

if ($All) {
    $TestsToRun = $VisibleTests + $HiddenTests
    $ShowHiddenDetails = $true
    $Mode = "ALL TESTS"
} elseif ($Hidden) {
    $TestsToRun = $HiddenTests
    $ShowHiddenDetails = $false
    $Mode = "HIDDEN TESTS"
} else {
    # Default: visible only
    $TestsToRun = $VisibleTests
    $Mode = "VISIBLE TESTS"
}

if ($TestsToRun.Count -eq 0) {
    Write-Warn "`n$LINE"
    Write-Warn "NO TEST CASES"
    Write-Warn $LINE
    Write-Warn "`nNo test cases found for mode: $Mode"
    Write-Warn $LINE
    exit 1
}

# ============================================================
# HEADER
# ============================================================

Write-Host ""
Write-Header $LINE
Write-Header "ACCENTURE TEST RUNNER"
Write-Header $LINE
Write-Host ""
Write-Info "Question:  $QuestionId"
Write-Info "Title:     $QuestionTitle"
Write-Info "Mode:      $Mode"
Write-Info "Tests:     $($TestsToRun.Count)"
Write-Info "Timeout:   ${Timeout}s per test"
Write-Host ""

# ============================================================
# COMPILATION
# ============================================================

Write-Info "Compiling..."

# Copy Java file to build directory for compilation
$BuildJavaFile = Join-Path $BuildDir "$ClassName.java"
Copy-Item $JavaFilePath $BuildJavaFile -Force

# Use Process to avoid PowerShell treating stderr as errors
$compilePsi = New-Object System.Diagnostics.ProcessStartInfo
$compilePsi.FileName = "javac"
$compilePsi.Arguments = "-encoding UTF-8 -d `"$BuildDir`" `"$BuildJavaFile`""
$compilePsi.UseShellExecute = $false
$compilePsi.RedirectStandardOutput = $true
$compilePsi.RedirectStandardError = $true
$compilePsi.CreateNoWindow = $true

$compileProcess = New-Object System.Diagnostics.Process
$compileProcess.StartInfo = $compilePsi

try {
    $compileProcess.Start() | Out-Null
    $compileStdout = $compileProcess.StandardOutput.ReadToEnd()
    $compileStderr = $compileProcess.StandardError.ReadToEnd()
    $compileProcess.WaitForExit()
    $compileExitCode = $compileProcess.ExitCode
} catch {
    $compileStderr = $_.Exception.Message
    $compileExitCode = 1
}

# Filter out JAVA_TOOL_OPTIONS info messages from error output
$compileErrors = ($compileStderr -split "`n" | Where-Object { $_ -notmatch "Picked up JAVA_TOOL_OPTIONS" }) -join "`n"
$compileErrors = $compileErrors.Trim()

if ($compileExitCode -ne 0) {
    Write-Host ""
    Write-Fail $LINE
    Write-Fail "COMPILATION ERROR"
    Write-Fail $LINE
    Write-Host ""
    
    $compileStr = $compileErrors
    # Replace build dir paths with original filename for clarity
    $compileStr = $compileStr -replace [regex]::Escape($BuildDir), $JavaDir
    Write-Fail $compileStr
    
    Write-Host ""
    Write-Dim $DASH
    Write-Dim "Fix the compilation error and run the tests again."
    Write-Fail $LINE
    exit 1
}

Write-Pass "[OK] Compilation successful"
Write-Host ""

# ============================================================
# RUN TESTS
# ============================================================

Write-Info "Running tests..."
Write-Host ""

$Passed = 0
$Failed = 0
$Errors = 0
$TotalTests = $TestsToRun.Count
$FailDetails = @()

for ($i = 0; $i -lt $TestsToRun.Count; $i++) {
    $test = $TestsToRun[$i]
    $testNum = $i + 1
    $testName = if ($test.name) { $test.name } else { "Test $testNum" }
    $testInput = $test.input
    $expectedOutput = $test.expected
    
    # Determine if this is a hidden test
    $isHidden = $false
    if (-not $All -and -not $Visible) {
        if ($HiddenTests -contains $test) {
            $isHidden = $true
        }
    }
    # In Hidden-only mode, treat all as hidden for display
    if ($Hidden -and -not $ShowHiddenDetails) {
        $isHidden = $true
    }
    
    # Create temp input file
    $inputFile = Join-Path $BuildDir "test_input_$testNum.txt"
    # Ensure proper newline handling and write without BOM
    $utf8NoBom = New-Object System.Text.UTF8Encoding $false
    [System.IO.File]::WriteAllText($inputFile, $testInput, $utf8NoBom)
    
    # Run Java program with timeout
    $outputFile = Join-Path $BuildDir "test_output_$testNum.txt"
    $errorFile = Join-Path $BuildDir "test_error_$testNum.txt"
    
    try {
        $psi = New-Object System.Diagnostics.ProcessStartInfo
        $psi.FileName = "cmd.exe"
        $psi.Arguments = "/c `"java -cp `"$BuildDir`" $ClassName < `"$inputFile`"`""
        $psi.UseShellExecute = $false
        $psi.RedirectStandardOutput = $true
        $psi.RedirectStandardError = $true
        $psi.CreateNoWindow = $true
        $psi.StandardOutputEncoding = [System.Text.Encoding]::UTF8
        $psi.StandardErrorEncoding = [System.Text.Encoding]::UTF8
        
        $process = New-Object System.Diagnostics.Process
        $process.StartInfo = $psi
        
        $process.Start() | Out-Null
        
        # Wait for exit with timeout
        $finished = $process.WaitForExit($Timeout * 1000)
        
        if (-not $finished) {
            # Timeout - kill the process
            try { $process.Kill() } catch {}
            try { $process.WaitForExit(1000) } catch {}
            
            Write-Fail "[TLE]  Test $testNum - $testName"
            $Failed++
            
            $detail = @{
                Num = $testNum
                Name = $testName
                Type = "TLE"
                Input = if ($isHidden) { "[hidden]" } else { $testInput }
                Expected = if ($isHidden) { "[hidden]" } else { $expectedOutput }
                Actual = "[Time Limit Exceeded - ${Timeout}s]"
                IsHidden = $isHidden
            }
            $FailDetails += $detail
            continue
        }
        
        $actualOutput = $process.StandardOutput.ReadToEnd()
        $errorOutput = $process.StandardError.ReadToEnd()
        $exitCode = $process.ExitCode
        
    } catch {
        Write-Fail "[ERR]  Test $testNum - $testName"
        $Errors++
        $Failed++
        
        $detail = @{
            Num = $testNum
            Name = $testName
            Type = "ERROR"
            Input = if ($isHidden) { "[hidden]" } else { $testInput }
            Expected = if ($isHidden) { "[hidden]" } else { $expectedOutput }
            Actual = "Process error: $_"
            IsHidden = $isHidden
        }
        $FailDetails += $detail
        continue
    }
    
    # Check for runtime error
    if ($exitCode -ne 0) {
        Write-Fail "[RTE]  Test $testNum - $testName"
        $Failed++
        
        # Extract exception info from stderr
        $errorStr = $errorOutput.Trim()
        $exceptionType = "Unknown"
        if ($errorStr -match '(\w+Exception)') {
            $exceptionType = $Matches[1]
        } elseif ($errorStr -match '(\w+Error)') {
            $exceptionType = $Matches[1]
        }
        
        $detail = @{
            Num = $testNum
            Name = $testName
            Type = "RTE"
            Input = if ($isHidden) { "[hidden]" } else { $testInput }
            Expected = if ($isHidden) { "[hidden]" } else { $expectedOutput }
            Actual = $errorStr
            Exception = $exceptionType
            IsHidden = $isHidden
        }
        $FailDetails += $detail
        continue
    }
    
    # Normalize and compare output
    # Trim trailing/leading whitespace and normalize line endings
    $normalizedActual = $actualOutput.Trim() -replace "`r`n", "`n" -replace "`r", "`n"
    $normalizedExpected = $expectedOutput.Trim() -replace "`r`n", "`n" -replace "`r", "`n"
    
    # Also normalize multiple trailing newlines
    $normalizedActual = $normalizedActual.TrimEnd("`n").TrimEnd()
    $normalizedExpected = $normalizedExpected.TrimEnd("`n").TrimEnd()
    
    if ($normalizedActual -ceq $normalizedExpected) {
        Write-Pass "[PASS] Test $testNum - $testName"
        $Passed++
    } else {
        Write-Fail "[FAIL] Test $testNum - $testName"
        $Failed++
        
        $detail = @{
            Num = $testNum
            Name = $testName
            Type = "WRONG"
            Input = if ($isHidden) { "[hidden]" } else { $testInput }
            Expected = if ($isHidden) { $expectedOutput } else { $expectedOutput }
            Actual = $actualOutput.Trim()
            IsHidden = $isHidden
        }
        $FailDetails += $detail
    }
}

# ============================================================
# RESULTS
# ============================================================

Write-Host ""
Write-Dim $DASH

# Show failure details
if ($FailDetails.Count -gt 0) {
    Write-Host ""
    foreach ($detail in $FailDetails) {
        if ($detail.Type -eq "TLE") {
            Write-Fail $LINE
            Write-Fail "TIME LIMIT EXCEEDED"
            Write-Fail $LINE
            Write-Host ""
            Write-Info "Test:      $($detail.Num) - $($detail.Name)"
            Write-Host ""
            Write-Warn "Your program did not finish within: ${Timeout} seconds"
            Write-Host ""
            Write-Dim  "Possible causes:"
            Write-Dim  "  - Infinite loop"
            Write-Dim  "  - Excessive complexity"
            Write-Dim  "  - Incorrect termination condition"
            if (-not $detail.IsHidden) {
                Write-Host ""
                Write-Info "Input:"
                Write-Dim  $detail.Input
            }
            Write-Host ""
            
        } elseif ($detail.Type -eq "RTE") {
            Write-Fail $LINE
            Write-Fail "RUNTIME ERROR"
            Write-Fail $LINE
            Write-Host ""
            Write-Info "Test:      $($detail.Num) - $($detail.Name)"
            Write-Warn "Exception: $($detail.Exception)"
            Write-Host ""
            if (-not $detail.IsHidden) {
                Write-Info "Input:"
                Write-Dim  $detail.Input
                Write-Host ""
            }
            Write-Info "Stack trace:"
            Write-Dim  $detail.Actual
            Write-Host ""
            
        } elseif ($detail.Type -eq "WRONG") {
            Write-Host ""
            if ($detail.IsHidden -and -not $ShowHiddenDetails) {
                Write-Warn "Hidden Test $($detail.Num) Failed"
                Write-Host ""
                Write-Info "Expected:"
                Write-Host $detail.Expected
                Write-Host ""
                Write-Info "Received:"
                Write-Host $detail.Actual
            } else {
                Write-Info "Test $($detail.Num) - $($detail.Name)"
                Write-Host ""
                if (-not $detail.IsHidden) {
                    Write-Info "Input:"
                    Write-Dim  $detail.Input
                    Write-Host ""
                }
                Write-Info "Expected:"
                Write-Host $detail.Expected
                Write-Host ""
                Write-Info "Received:"
                Write-Host $detail.Actual
            }
            Write-Host ""
        } else {
            Write-Fail "Test $($detail.Num): $($detail.Actual)"
            Write-Host ""
        }
    }
}

# Final summary
Write-Host ""
if ($Failed -eq 0) {
    Write-Pass $LINE
    Write-Pass "RESULT: ACCEPTED"
    Write-Pass $LINE
    Write-Host ""
    Write-Pass "Passed:   $Passed/$TotalTests"
    $accuracy = [math]::Round(($Passed / $TotalTests) * 100)
    Write-Pass "Accuracy: $accuracy%"
} else {
    Write-Fail $LINE
    Write-Fail "RESULT: FAILED"
    Write-Fail $LINE
    Write-Host ""
    Write-Pass "Passed:   $Passed/$TotalTests"
    Write-Fail "Failed:   $Failed/$TotalTests"
}

Write-Host ""
Write-Dim $LINE

# Cleanup temp files but keep .class for re-runs
Get-ChildItem $BuildDir -Filter "test_input_*" -ErrorAction SilentlyContinue | Remove-Item -Force
Get-ChildItem $BuildDir -Filter "test_output_*" -ErrorAction SilentlyContinue | Remove-Item -Force
Get-ChildItem $BuildDir -Filter "test_error_*" -ErrorAction SilentlyContinue | Remove-Item -Force

exit $Failed
