# docker cp

ホストとコンテナ間でのファイル/ディレクトリのコピー。

## From Host To Container

ホストからコンテナに転送したい。

```bash
docker cp [local_path] [container_id]:[path]
```

## From Container To Host

コンテナからホストに落としたい。

```bash
docker cp [container_id]:[path] [local_path]
```
