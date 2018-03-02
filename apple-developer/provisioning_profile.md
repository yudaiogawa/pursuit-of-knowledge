# Provisioning Profile

## About

## Tips

### 新規デバイスUUIDを追加したのにProvisioning Profileに追加されない...

- cacheが悪さをしている時もある
- XcodeのAuto Signing機能にチェック入れる
- ` ~/Library/MobileDevice/Provisioning Profiles ` 直下にある provisioning file を全て消す
- 新しいProvisioning Profileが生成される（apple developerから取ってきてると思う）
- 新規デバイスのUUIDが追加された Privisioning Profileが作られる