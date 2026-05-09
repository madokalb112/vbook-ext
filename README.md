# vbook-ext

Local VBook extensions.

## Plugin URL

```text
https://raw.githubusercontent.com/madokalb112/vbook-ext/main/plugin.json
```

Use URL above in VBook extension manager.

## Project Layout

```text
plugin.json       Extension index
push_project.py   Helper script for publishing
<site>/           One extension per folder
```

Each extension folder usually contains:

```text
plugin.json
plugin.zip
icon.png
src/
```

## Publish

```powershell
python .\push_project.py
```

## Nuoi em

![Nuoi em](nuoi_em.png)
