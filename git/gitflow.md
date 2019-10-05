<h1 align="center">Gitflow</h1>
<br>

## References

- [nvie/gitflow](https://github.com/nvie/gitflow)
- [A successful Git branching model](http://nvie.com/posts/a-successful-git-branching-model/) の為のGitのプラグインツール

<br>

## Branch model

|Branch |Interpretation |
|:-:|:-:|
| develop|開発メイン |
|feature |新機能開発 |
|release |リリース準備 |
|master |リリース |
|hotfix |バグ緊急対応 |
|support |旧バージョン保守 |

<br>

## Main branches

- master
- develop

<br>

## Supporting branches

- feature
- release
- hotfix
- support

<br>

## About branches

#### develop

- `master` から分岐
- 開発主軸ブランチ
- 最新の開発作業の変更を常に反映する
- 他ブランチで作業した内容がマージされる
- マージコミットされるため、マージのタイミングやマージされたブランチが明確になるからいいよね！
- リリースする段階で `release` ブランチを作成し、リリース準備を行う

#### feature

- `develop` から分岐
- 新機能開発, バグフィックスなどを行うブランチ
- タスク, 機能単位でブランチを作成する
- 別名 `Topic branch`
- 開発完了後 `develop` にマージコミット

#### release

- `develop` から分岐
- リリース準備を行うブランチ
- リリース準備が整い次第 `master` と `develop` にマージ
- マージ後、`master` に、ブランチ名と同じ名前のリリースタグが打たれる
- このブランチを作成することにより、リリース準備と次に向けての開発を分割できる。

#### master

- リリースブランチ
- 製品として出荷可能な状態を常に反映する
- このブランチへの直接コミットは許されない行為
- リリースのタイミングで `release` をマージコミット
- マージしたらリリースタグが打たれる

#### hotfix

- `master` から分岐
- 緊急バグ対応ブランチ
- リリース済みのものに重大なバグが見つかった時に緊急修正を行うためのブランチ
- 修正終了後 `master` と `develop` にマージ

#### support

- 旧バージョン保守ブランチ
