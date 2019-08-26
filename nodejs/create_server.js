/**
References
- http://gihyo.jp/dev/serial/01/nodejs/0001
- https://liginc.co.jp/web/programming/node-js/85318
*/

const http = require('http');
const PORT = 8888;

http.createServer((req, res) => {
  res.writeHead(200, {'Content-Type': 'text/plain'});
  res.end('My name is Yudai Ogawa :)\n');
}).listen(PORT);

console.log(`Server running at http://localhost:${PORT}/...`);
