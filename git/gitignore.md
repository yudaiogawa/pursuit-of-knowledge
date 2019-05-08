# Gitignore

## References

- [github/gitignore](https://github.com/github/gitignore)
- [GitHub Help - Ignoring files](https://help.github.com/en/articles/ignoring-files#create-a-global-gitignore)
- [gibo](https://github.com/simonwhitaker/gibo)

## Create a global .gitignore for macOS

[gibo](https://github.com/simonwhitaker/gibo)を使って、macOS用のグローバルなgitignoreファイル作成。

```zsh
% gibo dump macOS >> .gitignore_global
```

グローバルなGit設定ファイルに定義する

```zsh
% git config --global core.excludesFile ~/.gitignore_global
```
