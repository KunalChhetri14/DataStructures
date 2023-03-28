
var a=100;
const c=100;
{
  var f= 22;
  var a= 20;
  const c= 10;
  const b= 22;
  console.log("insiddss:",c);


}
var k= 100;
function f1() {
  var k= 10;
}

console.log("f is:: ",f);
console.log(a); //20
console.log("c is",c);
f1();
console.log("Kss : ", k);
