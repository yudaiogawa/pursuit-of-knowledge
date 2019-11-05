# Use SQL*Plus on macOS

MacOSに、Oracle Instant Clientを導入して、`SQL*Plus`を使用する方法。

<br>

## Introduction

ORACLE公式サイトより、下記2つをダウンロード。

- instantclient-basic-macos.x64-12.2.0.1.0-2.zip
- instantclient-sqlplus-macos.x64-12.2.0.1.0-2.zip

`/usr/local/oracle/` に解凍したものを移動。

以下、`.zshrc` に記述。

```bash
# Oracle
export ORACLE_HOME=/usr/local/oracle
export PATH=$PATH:$ORACLE_HOME/instantclient_12_2
```

必要であれば `tnsnames.ora` を `$ORACLE_HOME/network/admin/` に作成すると良いと思う。<br>
