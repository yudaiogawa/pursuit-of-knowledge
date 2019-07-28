# Android ;)

## How to install APK on Android device

USB接続されている実機デバイスにapkをインストールする方法。

`ADB(Android Debug Bridge)` を使用する。

接続されているデバイスの確認

```zsh
% adb devices
```

接続デバイスに `apk` をインスコ

```zsh
% adb install [apk file]
```
