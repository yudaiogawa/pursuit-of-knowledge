<h1 align="center">Tips</h1>
<br>

### MacOSでsqlplusが使えるようにする

ORACLE公式サイトより、下記2つをダウンロード。

- instantclient-basic-macos.x64-12.2.0.1.0-2.zip
- instantclient-sqlplus-macos.x64-12.2.0.1.0-2.zip

`/usr/local/oracle/` を作成して、そこに解凍したものを移動。

パスを通す。 `.zshrc` に下記を記述。

```zsh
# oracle
export ORACLE_HOME=/usr/local/oracle
export PATH=$PATH:$ORACLE_HOME/instantclient_12_2
```

必要であれば `tnsnames.ora` を `$ORACLE_HOME/network/admin/` 以下に作成すると良いと思う。<br>
`$ORACLE_HOME` 以下には `network/admin/` は存在しないはずなので自分で作成する必要あるよ。

<br>
