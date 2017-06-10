# coding: utf-8

# dis:
#     逆アセンブル。バイトコードでの解析をサポート。
#     デバッグとかで使えそう。

# 今回は、VMが実行する命令を確認してみた。

import dis

dis.dis(lambda param1, param2: param1 ** 2 + param2 ** 2)
