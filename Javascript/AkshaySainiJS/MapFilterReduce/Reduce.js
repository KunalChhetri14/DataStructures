let reduceOper = function(data, acc) {
  return acc + data;
}

Array.prototype.reduce = function(logic) {
  let sum = 0;
  for(var i=0; i<this.length; i++) {
    sum = logic(this[i], sum);
  }
  return sum;
}

const arr = [1,2,3,4,5];
// Array.prototype.reduceFF = reduce;

let result = arr.reduce(reduceOper);
  // reduce(arr, reduceOper);
console.log("The result is ::: ", result);
