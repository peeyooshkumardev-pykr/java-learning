$pidFile = Join-Path $env:TEMP 'java-programs-javac-watch.pid'
if (Test-Path -LiteralPath $pidFile) {
    $oldId = Get-Content -LiteralPath $pidFile -ErrorAction SilentlyContinue
    if ($oldId -and (Get-Process -Id $oldId -ErrorAction SilentlyContinue)) {
        Write-Output '{}'
        exit 0
    }
}

$worker = Join-Path $PSScriptRoot 'java-watch-worker.ps1'
$proc = Start-Process -FilePath 'powershell.exe' -WindowStyle Hidden -PassThru -ArgumentList @(
    '-NoProfile',
    '-ExecutionPolicy', 'Bypass',
    '-File', "`"$worker`""
)
$proc.Id | Set-Content -LiteralPath $pidFile
Write-Output '{}'
exit 0
