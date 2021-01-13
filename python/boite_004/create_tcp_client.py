# -*- coding: utf-8 -*-

import socket

host = "github.com"
port = 80

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect((host,port))

str = 'GET / HTTP/1.1\r\nHost: github.com\r\n\r\n'
client.send(str)

res = client.recv(4096)

print(res)
