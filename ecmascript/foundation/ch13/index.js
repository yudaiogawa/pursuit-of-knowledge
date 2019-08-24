/**
Build-In Functions

- 組み込み関数
- 最初から用意されている関数
*/

// ---- Object.assign() --------

let obj1 = { name: "Nana Komatsu", age: 24 };
let obj2 = { location: "Tokyo" };
let obj_assign = Object.assign({}, obj1, obj2);
obj_assign;


// ---- String.repeat() --------

let str = '#'.repeat(16);
str;


// ---- String.includes() --------

let txt = 'p[,mkoijnbhuqwertybhuygvcf.rd%zse#aq';
let str_1 = 'qwerty';
let str_2 = 'ytrewq';
let is_found_1 = txt.includes(str_1);
let is_found_2 = txt.includes(str_2);

is_found_1;
is_found_2;


// ---- String.startsWith && String.endsWith() --------

txt = 'ytrewqplmnvbghurjeidksjsywtqqwerty';
is_starts = txt.startsWith(str_1);
is_ends = txt.endsWith(str_1);

is_starts;
is_ends;


// ---- Array.filter() && Array.find() && Array.findIndex() --------

let arr = [1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024];

let filter = arr.filter(num => {
  return num >= 128;
});

let findIndex = arr.findIndex(num => {
  return num > 64;
});

let find = arr.find(num => {
  return num > 64;
});

filter;
findIndex;
find;


// ---- Exponentiation(**) Operator --------

console.log(111111 ** 2);

let x = 1111;
console.log(x **= 2);
let y = 11111111;
console.log(y **= 2);


// ---- Math.tranc() --------

let trunc = Math.trunc(3.14);
trunc;


// ---- Math.sign() --------

let rtn = Math.sign();
rtn;

rtn = Math.sign(0);
rtn;

rtn = Math.sign(1);
rtn;
rtn = Math.sign(1024);
rtn;
rtn = Math.sign(3.14);
rtn;

rtn = Math.sign(-1);
rtn;
rtn = Math.sign(-1024);
rtn;
rtn = Math.sign(-3.14);
rtn;


// ---- Number.isNaN() --------

let isNan = Math.sign();
console.log(Number.isNaN(isNan));


// ---- Number.isFinite() --------

let is_infinity = 1024 / 0;
let is_finite = 1024 / 2;
console.log(Number.isFinite(is_infinity));
console.log(Number.isFinite(is_finite));


// ---- Number.isSafeInteger() --------
// true = IEE754倍精度数として表すことができる

let isSafe = Number.isSafeInteger(NaN);
console.log(isSafe);
isSafe = Number.isSafeInteger(Infinity);
console.log(isSafe);
isSafe = Number.isSafeInteger('1024');
console.log(isSafe);
isSafe = Number.isSafeInteger(1024);
console.log(isSafe);
isSafe = Number.isSafeInteger(2 ** 53);
console.log(isSafe);
isSafe = Number.isSafeInteger(-(2 ** 53 -1));
console.log(isSafe);
isSafe = Number.isSafeInteger(2 ** 53 -1);
console.log(isSafe);
