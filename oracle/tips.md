# Tips

<details>
<summary>sqlplusコマンドMacで。</summary>

ORACLE公式サイトより、下記2つをダウンロード。

- instantclient-basic-macos.x64-12.2.0.1.0-2.zip
- instantclient-sqlplus-macos.x64-12.2.0.1.0-2.zip

`/usr/local/` に `oracle/` を作成して、そこに解凍したものを移動。  

`.zshrc` に下記を記述。

```zsh
# oracle
export ORACLE_HOME=/usr/local/oracle
export PATH=$PATH:$ORACLE_HOME/instantclient_12_2
```

sqlplusコマンドが使用できるようになりました。

</details>
