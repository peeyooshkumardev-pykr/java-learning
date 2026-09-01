$raw = [Console]::In.ReadToEnd()
try {
    $data = $raw | ConvertFrom-Json
} catch {
    Write-Output '{}'
    exit 0
}

$path = $null
foreach ($name in @('file_path', 'filePath', 'path', 'uri')) {
    if ($data.PSObject.Properties.Name -contains $name -and $data.$name) {
        $path = [string]$data.$name
        break
    }
}

if ($path -like 'file:*') {
    $path = [Uri]::UnescapeDataString(([Uri]$path).LocalPath)
}

if ($path -and $path -match '\.java$') {
    $dir = Split-Path -Parent $path
    $leaf = Split-Path -Leaf $path
    if (Test-Path -LiteralPath $path) {
        Push-Location -LiteralPath $dir
        try {
            & javac -encoding UTF-8 $leaf 2>$null
        } finally {
            Pop-Location
        }
    }
}

Write-Output '{}'
exit 0
