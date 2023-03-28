var b = function(param1) {
  console.log(param1); // prints " f() {} "
}
b(function(){
  console.log("The output is 10");
});


const area = function(rad) {
  return Math.PI * rad * rad;
}

var ar = function(rad, logic) {
  let arr =[];
  for(var i=0; i<rad.length; i++) {
    arr.push(area(rad[i]));
  }
  return arr;
}

const rad = [1,2,3,4];
const areaArray = ar(rad, area);
console.log("Area is :: ",areaArray);

ff = [10,20,30];
ff.map(item => item *2);
console.log("ff is ::: ", ff);
