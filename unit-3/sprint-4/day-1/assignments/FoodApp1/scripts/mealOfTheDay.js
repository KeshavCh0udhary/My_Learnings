import navbar from "../Component/navbar.js";
document.getElementById("navbar").innerHTML=navbar();

import { getData, append } from "../Component/fetch.js";
//console.log(getData);
//console.log(append);

let Container = document.getElementById("Container");

window.addEventListener("load",()=>{
    OnLoad();
});


let OnLoad = async () => {
    const url = `https://www.themealdb.com/api/json/v1/1/random.php`
   // console.log(url,"keshav");
    let data = await getData(url);
   // console.log(data);
    Container.innerHTML= null;
    append(data, Container);
}
//OnLoad()
let Info = JSON.parse(localStorage.getItem("LoginInfo"))||[];
if (Info.length > 1) {
    let Logout = document.getElementById("Login");
    Logout.innerText = "Logout";
    Logout.addEventListener("click", () => {
        Info = [flag];
        localStorage.setItem("LoginInfo", JSON.stringify(Info));
    });
}