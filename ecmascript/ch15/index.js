/**
async && await

- 非同期関数
- await: Async関数の処理を一時停止して、Promiseの解決を待つ。
- then()を記述しなくてもデータを扱える
*/

// ---- ex.01 --------
// - Simple pattern

function getName() {
  return Promise.resolve("Nana Komatsu");
}

function getAge() {
  return Promise.resolve(23);
}

async function ex01() {
  let name = await getName();
  let age = await getAge();
  console.log("Name: " + name);
  console.log("Age: " + age);
}

ex01();

// ---- ex.02 --------
// - Error handling

function getYear() {
  return new Promise(resolve => {
    let year = new Date().getFullYear();
    resolve(year);
  });
}

function throwErr() {
  return Promise.reject("Error has occurred.")
}

async function ex02() {
  try {
    let year = await getYear();
    let err = await throwErr();
  } catch(e) {
    console.log(e);
  }
}

ex02();


// ---- ex.03 --------
// - Promise.all()を使用して、まとめてawaitする。

function getRandomNum() {
  return Promise.resolve(Math.floor(Math.random() * 11));
}

function getRandomNum2() {
  return Promise.resolve(Math.floor(Math.random() * 21));
}

async function ex03() {
  let [num1, num2] = await Promise.all([getRandomNum(), getRandomNum2()]);
  let rslt = num1 == num2 ? true : false;
  console.log(num1 + " == " + num2 + " -> " + rslt);
}

ex03();


// ---- ex.04 --------
// - アロー関数でのasync定義

function echoMessage(msg, sec) {
  return new Promise(resolve => {
    setTimeout(() => {
      console.log(msg);
    }, sec);
  });
}

let ex04 = async () => {
  await Promise.all([
    echoMessage("Sat", 7000),
    echoMessage("Sun", 1000),
    echoMessage("Wed", 4000),
    echoMessage("Mon", 2000),
    echoMessage("Tue", 3000),
    echoMessage("Fri", 6000),
    echoMessage("Thu", 5000)
  ]);
};

ex04();
