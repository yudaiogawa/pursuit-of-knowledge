# Oracle

## Version

```sql
-- バージョン確認
SELECT * FROM V$VERSION
```

## User

```sql
-- 一覧
SELECT * FROM DBA_USERS ORDER BY USERNAME;
```

## Sequence

```sql
-- 一覧 ... DBに登録してある全てのシーケンス
SELECT * FROM DBA_SEQUENCES;

-- 一覧 ... 現在のユーザが参照できるシーケンス
SELECT * FROM ALL_SEQUENCES;

-- 一覧 ... 現在のユーザがオーナーのシーケンス
SELECT * FROM USER_SEQUENCES;

-- 次の値を取得
SELECT SEQUENCE_NAME.nextval from dual;

-- 現在のセッションにて最後に採番した番号を取得
-- 現在のセッションにて採番を行なってない場合には取得できずエラーとなる
SELECT SEQUENCE_NAME.currval from dual;
```

## MacにてSqlPlusを使えるようにしてみた

macOSからsqlplusコマンドを利用したかった。  
ORACLE公式より、下記2つをダウンロード。

- instantclient-basic-macos.x64-12.2.0.1.0-2.zip
- instantclient-sqlplus-macos.x64-12.2.0.1.0-2.zip

`/usr/local/` に `oracle/` を作成して、そこに解凍したものを移動。  
`.zshrc` に下記を記述。

```zsh
# oracle
export ORACLE_HOME=/usr/local/oracle
export PATH=$PATH:$ORACLE_HOME/instantclient_12_2
```

sqlplus コマンドが使用できるようになりました。
