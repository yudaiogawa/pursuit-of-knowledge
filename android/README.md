# Android

## デバイスにapkをインストールする方法

USB接続されているデバイスにapkをインストールする方法。  
ADB (Android Debug Bridge) を使用。

```zsh
# 接続デバイスの確認
% adb devices

# 接続デバイスに apk をインスコ
% adb install [apk_file]
```
