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