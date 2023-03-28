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







