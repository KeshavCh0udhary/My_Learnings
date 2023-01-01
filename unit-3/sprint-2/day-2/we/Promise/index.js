function BankServer() {
    return true;
}
let image = document.getElementById("PayImage");

let paymentPromise = new Promise(function (resolve, reject) {
    let pin = BankServer();

    setTimeout(function () {
        if (pin === true) {
            resolve("Payment Successful");
        }
        else {
            reject("Payment Failed");
        }
    }, Math.floor(Math.random() * (7000 - 1000) + 1000));
}).then(function (resolve) {
    image.src = "https://i.pinimg.com/originals/45/97/70/459770a2983c886f0473e62097c5006a.gif"
    console.log(resolve);
}).catch(function (reject) {
    image.src = "https://cdn.dribbble.com/users/1000837/screenshots/3857924/loader_failed_01.gif"
    console.log(reject);
});


// OR

// paymentPromise.then(function (resolve) {
//     image.src = "https://i.pinimg.com/originals/45/97/70/459770a2983c886f0473e62097c5006a.gif"
//     console.log(resolve);
// }).catch(function (reject) {
//     image.src = "https://cdn.dribbble.com/users/1000837/screenshots/3857924/loader_failed_01.gif"
//     console.log(reject);
// });


// OR

// paymentPromise.then(function (resolve) {
//     image.src = "https://i.pinimg.com/originals/45/97/70/459770a2983c886f0473e62097c5006a.gif"
//     console.log(resolve);
// });
// paymentPromise.catch(function (reject) {
//     image.src = "https://cdn.dribbble.com/users/1000837/screenshots/3857924/loader_failed_01.gif"
//     console.log(reject);
// });




// OR


// async function Status() {
//     try {
//         let Result = await paymentPromise
//         console.log(Result);
//         console.log("keshav");
//     } catch (reject) {
//         console.log(reject);
//     }
// }
// Status();

// console.log(paymentPromise);