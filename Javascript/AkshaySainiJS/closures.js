function x() {
  let a=10;
  let b = 20;
  function y() {
    return a+b;
  }
  return y;
}

let f1 = x();
let k =f1();
console.log("kk ",k);


function t() {
  for(var i=1; i<5; i++) {
    setTimeout(()=> {
      console.log("Inside k values",i); // 5 5 5 5
    },i*1000);
  }
}

function lett() {
  for(var i=1; i<5; i++) {
    setTimeout(()=> {
      console.log("Inside k values",i); // 1 2 3 5
    },i*1000);
  }
}

withoutLet();
console.log("without");
function withoutLet() {
  for(var i=1; i<5; i++) {
    function varWithClosures(i) {
      setTimeout(() => {
        console.log("Inside k values without let :: ", i);  //1 2 3 4
      }, i*1000);
    }
    varWithClosures(i);
  }
}
//As var is not block scoped but it is function scoped
// inside varWithClosures its value becomes 1
//Then the closures is stored somewhere with its lexical env i.e i=1;

// t();



function outest() {
  var c = 20;
  function outer(str) {
    let a = 10;
    function inner() {
      console.log(a, c, str);
    }
    return inner;
  }
  return outer;
}
outest()("Hello There")();  // 10 20 "Hello There"


var count = 0;
function increment() {
  count++;
}

//Not secure


function counter() {
  count = 0;
  function increment() {
    count++;
    return count;
  }
  return increment;
}

let countOpert = counter();
console.log("Count valu : ", countOpert());
console.log("Count valu : ", countOpert());





