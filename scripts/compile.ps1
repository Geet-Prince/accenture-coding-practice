<#
.SYNOPSIS
    Accenture Coding Practice - Compile Only
.DESCRIPTION
    Compiles a Java question file without running tests.
    Useful for quick syntax checking.
.PARAMETER JavaFile
    Path to the Java file to compile.
.EXAMPLE
    .\scripts\compile.ps1 .\01-Arrays\14-Accenture-Previous-Questions\Q01-RatCountHouse.java
#>

param(
    [Parameter(Mandatory=$true, Position=0)]
    [string]$JavaFile
)

$ErrorActionPreference = "Stop"
$LINE = "=" * 60

function Write-Header { param([string]$text) Write-Host $text -ForegroundColor Cyan }
function Write-Pass   { param([string]$text) Write-Host $text -ForegroundColor Green }
function Write-Fail   { param([string]$text) Write-Host $text -ForegroundColor Red }
function Write-Info   { param([string]$text) Write-Host $text -ForegroundColor White }
function Write-Dim    { param([string]$text) Write-Host $text -ForegroundColor DarkGray }

$ScriptDir = Split-Path -Parent $MyInvocation.MyCommand.Path
$RepoRoot = Split-Path -Parent $ScriptDir

# Resolve path
if ([System.IO.Path]::IsPathRooted($JavaFile)) {
    $JavaFilePath = $JavaFile
} else {
    $JavaFilePath = Join-Path (Get-Location) $JavaFile
}
$JavaFilePath = [System.IO.Path]::GetFullPath($JavaFilePath)

if (-not (Test-Path $JavaFilePath)) {
    Write-Fail "`n$LINE"
    Write-Fail "FILE NOT FOUND: $JavaFilePath"
    Write-Fail $LINE
    exit 1
}

$JavaDir = Split-Path -Parent $JavaFilePath
$JavaFileName = [System.IO.Path]::GetFileNameWithoutExtension($JavaFilePath)

# Detect class name
$javaContent = Get-Content $JavaFilePath -Raw
$ClassName = $JavaFileName -replace '-', ''
if ($javaContent -match 'public\s+class\s+(\w+)') {
    $ClassName = $Matches[1]
}

$BuildDir = Join-Path $RepoRoot ".build"
if (-not (Test-Path $BuildDir)) {
    New-Item -ItemType Directory -Path $BuildDir -Force | Out-Null
}

Write-Host ""
Write-Header $LINE
Write-Header "ACCENTURE - COMPILE"
Write-Header $LINE
Write-Host ""
Write-Info "File:  $JavaFileName.java"
Write-Info "Class: $ClassName"
Write-Host ""

# Copy and compile
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
    Write-Fail "COMPILATION FAILED"
    Write-Host ""
    $compileStr = $compileErrors
    $compileStr = $compileStr -replace [regex]::Escape($BuildDir), $JavaDir
    Write-Fail $compileStr
    Write-Host ""
    Write-Dim "Fix the error and compile again."
    Write-Fail $LINE
    exit 1
} else {
    Write-Pass "[OK] Compilation successful"
    Write-Host ""
    Write-Dim "Class file: $BuildDir\$ClassName.class"
    Write-Pass $LINE
    exit 0
}
