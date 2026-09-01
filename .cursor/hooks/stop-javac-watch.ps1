$pidFile = Join-Path $env:TEMP 'java-programs-javac-watch.pid'
if (Test-Path -LiteralPath $pidFile) {
    $oldId = Get-Content -LiteralPath $pidFile -ErrorAction SilentlyContinue
    if ($oldId) {
        Stop-Process -Id $oldId -Force -ErrorAction SilentlyContinue
    }
    Remove-Item -LiteralPath $pidFile -Force -ErrorAction SilentlyContinue
}
Write-Output '{}'
exit 0
