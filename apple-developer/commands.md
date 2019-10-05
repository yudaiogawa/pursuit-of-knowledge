# Commands

<br>

### xcode-select

現在アクティブな `Developer Directory` の出力

```zsh
% xcode-select --print-path
```

`Developer Directory` の切替

異なるバージョンのXcodeのツールを簡単にスイッチできる。

```zsh
% sudo xcode-select --switch /Applications/Xcode0.0.0.app/Contents/Developer
```

<br>

### security

端末にインストールされている証明書の出力

```zsh
% security find-identity -v -p codesigning
```
