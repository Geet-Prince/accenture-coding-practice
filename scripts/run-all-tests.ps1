<#
.SYNOPSIS
    Accenture Coding Practice - Run All Tests
.DESCRIPTION
    Finds all .java question files with corresponding .tests.json files
    and runs tests against each one. Reports overall progress.
.PARAMETER Topic
    Optional. Filter by topic folder (e.g., "01-Arrays", "02-Strings")
.PARAMETER StopOnFail
    Stop execution on first failing question.
.PARAMETER All
    Include hidden tests in the run.
.EXAMPLE
    .\scripts\run-all-tests.ps1
    .\scripts\run-all-tests.ps1 -Topic "01-Arrays"
    .\scripts\run-all-tests.ps1 -All
#>

param(
    [string]$Topic = "",
    [switch]$StopOnFail,
    [switch]$All
)

$ErrorActionPreference = "Continue"
$ScriptDir = Split-Path -Parent $MyInvocation.MyCommand.Path
$RepoRoot = Split-Path -Parent $ScriptDir
$RunTestScript = Join-Path $ScriptDir "run-test.ps1"

$LINE = "=" * 60
$DASH = "-" * 60

function Write-Header { param([string]$text) Write-Host $text -ForegroundColor Cyan }
function Write-Pass   { param([string]$text) Write-Host $text -ForegroundColor Green }
function Write-Fail   { param([string]$text) Write-Host $text -ForegroundColor Red }
function Write-Warn   { param([string]$text) Write-Host $text -ForegroundColor Yellow }
function Write-Info   { param([string]$text) Write-Host $text -ForegroundColor White }
function Write-Dim    { param([string]$text) Write-Host $text -ForegroundColor DarkGray }

Write-Host ""
Write-Header $LINE
Write-Header "ACCENTURE - RUN ALL TESTS"
Write-Header $LINE
Write-Host ""

# Find all Java files that have corresponding test files
$SearchPath = $RepoRoot
if ($Topic) {
    $SearchPath = Join-Path $RepoRoot $Topic
    if (-not (Test-Path $SearchPath)) {
        Write-Fail "Topic folder not found: $Topic"
        exit 1
    }
}

# Find question java files (exclude solutions directory)
$javaFiles = Get-ChildItem -Path $SearchPath -Recurse -Filter "*.java" |
    Where-Object { 
        $_.FullName -notlike "*\solutions\*" -and
        $_.FullName -notlike "*\.build\*" -and
        $_.FullName -notlike "*Solution*"
    } |
    Sort-Object FullName

# Filter to only those with test files
$questionsWithTests = @()
foreach ($jf in $javaFiles) {
    $baseName = [System.IO.Path]::GetFileNameWithoutExtension($jf.Name)
    $testFile = Join-Path $jf.DirectoryName "$baseName.tests.json"
    
    # Also try class name variant
    if (-not (Test-Path $testFile)) {
        $className = $baseName -replace '-', ''
        $testFile = Join-Path $jf.DirectoryName "$className.tests.json"
    }
    
    if (Test-Path $testFile) {
        $questionsWithTests += $jf
    }
}

if ($questionsWithTests.Count -eq 0) {
    Write-Warn "No questions with test files found."
    Write-Warn "Make sure .tests.json files exist alongside .java files."
    exit 0
}

Write-Info "Found $($questionsWithTests.Count) questions with tests"
if ($Topic) { Write-Info "Topic filter: $Topic" }
Write-Host ""

$totalPassed = 0
$totalFailed = 0
$totalSkipped = 0
$results = @()

foreach ($jf in $questionsWithTests) {
    $relativePath = $jf.FullName.Substring($RepoRoot.Length + 1)
    Write-Dim $DASH
    Write-Info "Testing: $relativePath"
    
    $testArgs = @($jf.FullName)
    if ($All) {
        $testArgs += "-All"
    }
    
    try {
        & $RunTestScript @testArgs 2>&1 | Out-Null
        $exitCode = $LASTEXITCODE
        
        if ($exitCode -eq 0) {
            Write-Pass "  => ACCEPTED"
            $totalPassed++
            $results += @{ File = $relativePath; Status = "ACCEPTED" }
        } else {
            Write-Fail "  => FAILED"
            $totalFailed++
            $results += @{ File = $relativePath; Status = "FAILED" }
            
            if ($StopOnFail) {
                Write-Warn "`nStopping on first failure."
                break
            }
        }
    } catch {
        Write-Fail "  => ERROR: $_"
        $totalFailed++
        $results += @{ File = $relativePath; Status = "ERROR" }
    }
}

# Summary
Write-Host ""
Write-Header $LINE
Write-Header "SUMMARY"
Write-Header $LINE
Write-Host ""
Write-Info  "Total Questions: $($questionsWithTests.Count)"
Write-Pass  "Accepted:        $totalPassed"
if ($totalFailed -gt 0) {
    Write-Fail "Failed:          $totalFailed"
}
Write-Host ""

if ($totalFailed -gt 0) {
    Write-Fail "Failed Questions:"
    foreach ($r in $results) {
        if ($r.Status -ne "ACCEPTED") {
            Write-Fail "  - $($r.File)"
        }
    }
    Write-Host ""
}

$accuracy = if ($questionsWithTests.Count -gt 0) { [math]::Round(($totalPassed / $questionsWithTests.Count) * 100) } else { 0 }

if ($totalFailed -eq 0) {
    Write-Pass "Accuracy: $accuracy% - ALL ACCEPTED!"
} else {
    Write-Warn "Accuracy: $accuracy%"
}

Write-Dim $LINE
exit $totalFailed
