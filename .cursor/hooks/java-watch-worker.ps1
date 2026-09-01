$root = (Resolve-Path (Join-Path $PSScriptRoot '..\..')).Path
$javacCmd = Get-Command javac -ErrorAction SilentlyContinue
if (-not $javacCmd) {
    $fallback = 'C:\Program Files\Common Files\Oracle\Java\javapath\javac.exe'
    if (Test-Path -LiteralPath $fallback) {
        $javac = $fallback
    } else {
        exit 0
    }
} else {
    $javac = $javacCmd.Source
}

function Compile-JavaFile {
    param([string]$path)
    if (-not $path -or $path -notmatch '\.java$') { return }
    if (-not (Test-Path -LiteralPath $path)) { return }
    $dir = Split-Path -Parent $path
    $leaf = Split-Path -Leaf $path
    $classPath = [System.IO.Path]::ChangeExtension($path, '.class')
    $javaInfo = Get-Item -LiteralPath $path
    if (Test-Path -LiteralPath $classPath) {
        $classInfo = Get-Item -LiteralPath $classPath
        if ($classInfo.LastWriteTimeUtc -ge $javaInfo.LastWriteTimeUtc) { return }
    }
    Push-Location -LiteralPath $dir
    try {
        & $javac -encoding UTF-8 $leaf 2>$null
    } finally {
        Pop-Location
    }
}

function Compile-StaleJava {
    Get-ChildItem -LiteralPath $root -Filter '*.java' -Recurse -File -ErrorAction SilentlyContinue |
        Where-Object { $_.FullName -notmatch '\\(\.git|\.cursor)\\' } |
        ForEach-Object { Compile-JavaFile $_.FullName }
}

Compile-StaleJava
while ($true) {
    Start-Sleep -Seconds 2
    Compile-StaleJava
}
