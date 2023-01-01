import navbar from "../Component/navbar.js";
document.getElementById("navbar").innerHTML=navbar();

import { getData, append1 } from "../Component/fetch.js";
//console.log(getData);
//console.log(append);

let Container = document.getElementById("Container");

window.addEventListener("load",()=>{
    OnLoad();
});


let OnLoad = async function () {
    const url = `https://www.themealdb.com/api/json/v1/1/random.php`
    console.log(url,"keshav");
    let data = await getData(url);
    //console.log(data);
    Container.innerHTML= null;
    append1(data, Container);
    console.log(data)
}
let Info = JSON.parse(localStorage.getItem("LoginInfo"))||[];
if (Info.length > 1) {
    let Logout = document.getElementById("Login");
    Logout.innerText = "Logout";
    Logout.addEventListener("click", () => {
        Info = [flag];
        localStorage.setItem("LoginInfo", JSON.stringify(Info));
    });
}



