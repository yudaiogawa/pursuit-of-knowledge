/**
Promise

- 非同期処理を扱う
- resolve: こいつに処理の結果を渡す
- reject: エラーを処理する
- Promise.then()で結果を取得する
*/

// ---- ex.01 --------
// - Method chain

function getName1() {
  return new Promise(resolve => {
    setTimeout(() => {
      resolve("Nana Komatsu");
    }, 1000);
  });
}

function getAge1() {
  return new Promise(resolve => {
    setTimeout(() => {
      resolve(23);
    }, 2000);
  });
}

getName1().then(name => {
  console.log(name);
})
.then(getAge1)
.then(age => {
  console.log(age);
});


// ---- ex.02 --------
// - Promise.all()

function getName2() {
  return new Promise(resolve => {
    setTimeout(() => {
      resolve("Marie Iitoyo");
    }, 3000);
  });
}

function getAge2() {
  return new Promise(resolve => {
    setTimeout(() => {
      resolve(21);
    }, 4000);
  });
}

Promise.all([
  getName2(), getAge2()
]).then(([name, age]) => {
  console.log(name);
  console.log(age);
});


// ---- ex.03 --------
// - Handling the error.
// - Catch, Finally

function getError() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      reject("Catch the error.");
    }, 6000);
  });
};

getError().catch(e => {
  console.log(e);
})
.then(() => {
  console.log("This process is finally.")
});


// ---- ex.04 --------
// - 値を渡すだけの単純な処理

function getName3() {
  return Promise.resolve("Suzu Hirose");
}

getName3().then(name => {
  console.log(name);
});


// ---- ex.05 --------
// - resolveに渡す値が無くてもresolveの記述は必須
// - resolveが無い場合、処理が続かない

function echoMessage(msg, sec) {
  return new Promise(resolve => {
    setTimeout(() => {
      console.log(msg);
      resolve(); // Required
    }, sec);
  });
}

echoMessage("First Message.", 10000)
.then(() => echoMessage("Second Message.", 12000))
.then(() => echoMessage("Third Message."), 14000);
