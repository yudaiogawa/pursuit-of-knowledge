# Commands

## xcode-select

現在アクティブな `developer directory` の出力

```zsh
% xcode-select --print-path
```

`developer directory` の切替

異なるバージョンのXcodeのツールを簡単にスイッチできる。

```zsh
% sudo xcode-select --switch /Applications/Xcode0.0.0.app/Contents/Developer
```

## security

端末にインストールされている証明書の出力

```zsh
% security find-identity -v -p codesigning
```
