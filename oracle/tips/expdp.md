# EXPDP

Data Pump Export.

<br>

#### ESTIMATE

ダンプファイルのサイズを見積もる。
ディスク容量に不足が無いか確認する時とかに使用する。

```bash
expdp scott/tiger@db schemas=SCOTT estimate_only=y
```

#### SCHEMA

スキーマダンプ

```bash
expdp scott/tiger@db directory=DATA_PUMP_DIR dumpfile=scott.dmp logfile=scott.log schemas=SCOTT
```
