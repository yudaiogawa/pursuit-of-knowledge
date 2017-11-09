#!/bin/bash

#### xcode-select ################################################################

# 現在アクティブな developer directory 出力
xcode-select --print-path

# developer directory 切替 - 異なるバージョンの Xcode のツールを簡単に切り替えれる
sudo xcode-select --switch /Applications/Xcode0.0.0.app/Contents/Developer
