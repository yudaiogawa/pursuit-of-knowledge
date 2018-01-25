# Gitflow

## Reference
[nvie/gitflow](https://github.com/nvie/gitflow)

## Branch model
| Branch|Interpretation|
|:-----:|:------------:|
|develop|      開発主軸|
|feature|      機能開発|
|release|  リリース準備|
| master|      リリース|
| hotfix|  バグ緊急対応|

### develop

### feature
#### 新機能の開発スタート
```zsh
% git flow feature start foo
```
- 勝手にdevelopからcheckoutしてfeatureブランチを作ってくれる。
- 上記コマンドで `feature/foo` というブランチが作成される。

#### 新機能の開発フィニッシュ
```zsh
% git flow feature finish foo
```
- 上記コマンドで勝手にdevelopにmergeしてくれて、featureブランチを削除してくれる。

#### remoteへの反映
```zsh
% git flow feature publish foo
```
- featureブランチをリモートに反映。
- 同じ機能を複数人で開発する際は必要だと思う。

### release

### master

### hotfix
