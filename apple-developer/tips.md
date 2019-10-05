# Tips

<br>

### 新規デバイスのUUIDを追加したのにProvisioning Profileに反映されない...

キャッシュが悪さをしている可能性あり。下記手順を試す。

1. XcodeのAuto Signing機能にチェック入れる。
2. `$HOME/Library/MobileDevice/Provisioning Profiles` 直下にあるProvisioning Profileを全て消す。
3. 新しいProvisioning Profileが生成される。
4. 新規デバイスのUUIDが追加されたPrivisioning Profileが作成される。
