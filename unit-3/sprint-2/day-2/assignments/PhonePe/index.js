let Submit = document.getElementById("Submit");
Submit.addEventListener("click", function () {
    Payment()
});

function Payment(){
    let UPIPIN = document.getElementById("UPIPIN").value;
    if(UPIPIN.length!==4){
        return alert("Invalid Upi Pin")
    }
    let HideInput= document.getElementById("Hide");
    HideInput.style.display="none";
    function BankServer() {
        if (UPIPIN == 2345) {
            console.log("BankServer")
            return true;
        }
        else {
            return false;
        }
    }
    
    let pin = BankServer();    
    let image = document.createElement("img");
    image.src = "https://powerusers.microsoft.com/t5/image/serverpage/image-id/118082i204C32E01666789C?v=v2"
    image.setAttribute("id", "Serverpage");
    document.getElementById("PhonePe").append(image);
    let paymentPromise = new Promise(function (resolve, reject) {
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
}