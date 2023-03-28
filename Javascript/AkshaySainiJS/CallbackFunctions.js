//Callback function
//Take a fnction and pass into another function ... this is known as callback functions
//It gives us access to whole asynchrounous world in javascript

function x(fun) {

  setTimeout(function () {
    console.log("timer");
  }, 1000);

}

x(function y() {
  console.log("Isnide callback");
});
