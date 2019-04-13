# Provisioning profile

## About

## Tips

### 新規デバイスの UUID を追加したのに Provisioning profile に反映されない場合

- cache が悪さをしている時もある
- Xcode の Auto Signing 機能にチェック入れる
- ` ~/Library/MobileDevice/Provisioning Profiles ` 直下にある Provisioning profile を全て消す
- 新しい Provisioning profile が生成される( apple developer から取ってきてると思う)
- 新規デバイスの UUID が追加された Privisioning profile が作られる
