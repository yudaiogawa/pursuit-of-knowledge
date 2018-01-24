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
- developから分岐
    ```zsh
    % git flow feature start foo
    ```
- 作業終了したらdevelopにmergeされる
    ```zsh
    % git flow feature finish foo
    ```
- リモートに反映
    ```zsh
    % git flow feature publish foo
    ```

### release

### master

### hotfix
