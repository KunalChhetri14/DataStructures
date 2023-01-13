 const cart = ["shoes", "shocks"];


// Promise Chaining
const promise = createOrder(cart)
  .then(item => {
  console.log(item);
  return proceedToPayment(item.payment_id);
  })
  .then(item=> {
    console.log(item.message);
    return showOrderSummary(item);
  })
  .then(item=> {
    console.log(item.message);
    return updateWallet(item.value);
  })
  .then(item => {
    console.log(item.message);
  })
  .catch(e => {
   console.log(e.message);
 })

var success = true;
 // Producer
function createOrder(item) {
  return new Promise(function (resolve, reject) {
      if(true) {
        setTimeout(function(){
          resolve(104);
        }, 5000)
        setTimeout(() => resolve("Succesfully from arrow"), 3000);
        // resolve("Successful");
      } else {
        reject("Failed");
      }
  })
}

function proceedToPayment(orderId) {
  return new Promise((resolve, reject) => {
    resolve({payment_id: 23, message: 'Payment succesful'});
    reject(new Error("Payment failed"));
  })
}

function showOrderSummary(paymentId) {
  return new Promise(function (resolve, reject) {
    if(true) {
      resolve({value: 53, message: "Order Summary fetched"});
    } else {
      reject(new Error("error while fetching summary"));
    }
  })
}

function updateWallet(user_id) {
  return new Promise(function(resolve, reject) {
    if(true) {
      resolve({message: "Updated successfully"});
    } else {
      reject(new Error("Error while updating wallet"));
    }
  })
}
