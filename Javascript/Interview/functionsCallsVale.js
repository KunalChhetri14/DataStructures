function f1() {
  return function f2() {
    console.log("22");
    return f3;
  }

  f3= () => {
    // console.log("33");
    return 1;
  }
}

let ff= f1();


function a() {
  console.log(b); // 10
  // Instead of printing undefined it prints 10, So somehow this a function could access the variable b outside the function scope.
}
var b = 10;
a();

