//Function statement or function declaration

console.log(f1);
console.log(b);
function f1() {
  console.log("output");
}

//function expression
var b = function() {
  console.log("function expression");
}

//Major diff is hoisting f1 is hoisted with entire fn and b is hoisted with undefined

//anonymous function
// it is used where functions are used as values eg: var b above

//Named function expression
var c = function named() {
  cosole.log("Named function expression");
}

named(); //named is not defined

//Diff bet paramter and arguments  function f11(param1,param2) {    }   ;  f11(arg1,arg2);

//First class functions
//The ability to use functions as values(fn expression) and can be passed as values and be returned as values is called first class fn;
//Functions are first class citizens as it has the ability to use use functions as values(fn expression) and can be passed as values and be returned as values is called first class fn;


//Arrow functions
//Introduced in ES6
//

