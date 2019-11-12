# Reimport Provisioning Profile

### 解決

以下手順にて、新規デバイスのUUIDが追加された `Privisioning Profile` が作成されるはずです。

1. Xcodeの Auto Signing 機能にチェック
2. `$HOME/Library/MobileDevice/Provisioning Profiles/` にある `Provisioning Profile` を全て消す
3. `Provisioning Profile` が新規に作成される

### 問題

新規デバイスのUUIDを追加したのに `Provisioning Profile` に反映されない。

### 原因

古い `Provisioning Profile` が使用されている。
