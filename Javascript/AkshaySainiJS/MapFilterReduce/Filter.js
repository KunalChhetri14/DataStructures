const filterOper = function(rad) {
  if(rad < 3) {
    return true;
  } else {
    false;
  }
}

var filter = function(rad, logic) {
  let arr = [];
  for(var i=0; i<rad.length; i++) {
    if(logic(rad[i])) {
      arr.push(rad[i])
    }
  }
  return arr;
}

const rad = [1,2,3,4];
const reducedArray = filter(rad, reduceOper);
console.log("reduced arr :: ", reducedArray);
