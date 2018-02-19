# Gitflow
[A successful Git branching model](http://nvie.com/posts/a-successful-git-branching-model/) の為のGitのプラグインツール

## Branch model
| Branch |  Interpretation  |
|:------:|:----------------:|
| develop|              開発|
| feature|        新機能開発|
| release|      リリース準備|
|  master|          リリース|
|  hotfix|      バグ緊急対応|
| support|  旧バージョン保守|

## Main branches
- master
- develop

## Supporting branches
- feature
- release
- hotfix
- support

## About branches

### develop
- 開発ブランチ
- 最新の開発作業の変更を常に反映する
- `master` を親として作成
- リリース準備が出来たら `master` にマージ

### feature
- 新機能開発ブランチ
- 機能単位で作成される
- 別名 `Topic branch`
- `develop` を親として作成
- 開発が完了したら `develop` にマージ

### release
- リリース作業ブランチ
- `develop` を親として作成
- リリース終了後 `master` と `develop` にマージ

### master
- 製品として出荷可能な状態を常に反映する
- リリースのタイミングでマージコミットする

### hotfix
- 緊急バグ対応ブランチ
- リリース済みのものに重大なバグが見つかった時に緊急修正を行うためのブランチ
- 修正終了後 `develop` と `master` にマージ

### support
- 旧バージョン保守ブランチ
