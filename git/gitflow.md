# Gitflow

## Branch model
| Branch|Interpretation|
|:-----:|:------------:|
|develop|      開発主軸|
|feature|      機能開発|
|release|  リリース準備|
| master|      リリース|
| hotfix|  バグ緊急対応|

### develop
- 開発主軸ブランチ

### feature
- 新機能の開発を行う為のブランチ

#### 作業開始
```zsh
% git flow feature start foo
```
1. developからcheckoutしてfeatureブランチを作ってくれます。
1. `feature/foo` というブランチが作成されます。

#### 作業終了
```zsh
% git flow feature finish foo
```
1. developにmergeされます。
1. `feature/foo` ブランチが削除されます。

#### Remoteへの反映
```zsh
% git flow feature publish foo
```
- `feature/foo` をリモートに反映。

### release

### master

### hotfix
- リリース後の緊急の修正作業などを行う為のブランチ

#### 作業開始
```zsh
% git flow hotfix start foo
```
1. masterからcheckoutされます。
1. `hotfix/foo` ブランチが作成されます。

#### 作業終了
```zsh
% git flow hotfix finish foo
```
1. masterにmergeされ、masterにリリースタグが打たれます。上記コマンドの場合は、fooというタグが打たれます。
1. masterがdevelopにmergeされます。
1. `hotfix/foo` が削除されます。