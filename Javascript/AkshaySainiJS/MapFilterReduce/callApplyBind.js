// import {server} from './../../NodejsServer';

const name = {
  firstName: "Kajal",
  lastName: "Chhetri",
  printFullName1 :  function(hometown) {
    console.log(this.firstName + " "+ this.lastName  + ", Hometown is : " + hometown);
  }
}

let printFullName =  function(hometown, gender) {
  console.log(this.firstName + " "+ this.lastName + ", Hometown is : " + hometown + " , gender: "+ gender);
}

const name2= {
  firstName: "Kunal2",
  lastName: "Chhetri2"
}

let fn = name.printFullName1;
fn.call(name2, "Jaig;aon")
printFullName.call(name, "Siliguri", "Female");

//apply
printFullName.apply(name2, ["Ranchi", "Male"]);
// printFullName.call(name2);

const name3 = {
  firstName: "Sandhya",
  lastName: "Sharma"
}
//bind
let bindCall = printFullName.bind(name, "Rangamati", "female");
bindCall();


// Pollyfill for bind
const myBind = function() {
  return function() {
    this();
  }
}

const name4 = {
  firstName: "Kumar",
  lastName: "Chhetri"
}

Function.prototype.myBind1 = myBind;

myBind1.myBind1(name4, )



