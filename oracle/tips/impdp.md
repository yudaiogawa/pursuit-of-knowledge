# Impdp

Data Pump Import.

<br>

#### テーブル

```bash
impdp user/pass@DB directory=directory_object dumpfile=foobar.dmp logfile=foobar.log tables=QISLOGI.%
```

#### スキーマ

```bash
impdp user/pass@DB directory=directory_object dumpfile=foobar.dmp logfile=foobar.log schema=SCOTT
```

#### 違うスキーマ

```bash
impdp user/pass@DB directory=directory_object dumpfile=foobar.dmp logfile=foobar.log remap_schema=SCOTT:ALICE
```
