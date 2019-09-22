# Commands

## Shebang

実行されたコマンドを表示。変数は展開されて表示される。

```bash
#!/bin/bash -x
```

実行されるコマンドを表示。変数はそのまま表示される。

```bash
#!/bin/bash -v
```

処理がエラーになった時は中断

```bash
#!/bin/bash -e
```

## History

直前のコマンドに渡したパラメータを `!$` で呼び出せる

```bash
$ ls target_dir
$ cd !$
```

直近で使用したコマンドを、指定した文字列で検索して表示してくれる

```bash
$ !foo:p
```

## Network

受信パケット内容を確認

```bash
$ tcpdump src www.google.co.jp -X
```

## Move

findで検索したファイルを指定のディレクトリへ全て移動

```bash
$ find . -type f -name '*foobar*' | xargs -t mv [target_directory]
```

## 環境変数

grep結果の色付け

```bash
export GREP_OPTIONS='--color=auto'
```
