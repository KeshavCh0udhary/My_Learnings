import navbar from "../Component/navbar.js";
document.getElementById("navbar").innerHTML = navbar();
import { getData, append } from "../Component/fetch.js";


let Container = document.getElementById("container");
let Container1 = document.getElementById("Container");
//console.log(Container1)

document.getElementById("button").addEventListener("click", () => {
    onButtonClick();
});

document.getElementById("query").addEventListener("keypress", (e) => {
    if (e.key === "Enter") {
        event.preventDefault();
        onButtonClick();
    }
});

let onButtonClick = async () => {
    let query = document.getElementById("query").value;
    const url = `https://www.themealdb.com/api/json/v1/1/search.php?s=${query}`
    //console.log(url,"keshav")
    let data = await getData(url);
    //console.log(data);
    Container.innerHTML = null;
    append(data, Container, Container1);
}

let ata = JSON.parse(localStorage.getItem("users")) || [];
//console.log(ata)
let Info = JSON.parse(localStorage.getItem("LoginInfo")) || [];
//console.log(Info);
let INFO = document.getElementById("Info");
let DisplayUser = () => {
    if (!Info[0]) {
        return;
    }
    if (Info.length > 0) {
        //console.log(Info,"keshav")
        //console.log(INFO)
        let User = ata.filter((el) => {
            return el.email == Info[1].email
        });
        //console.log(User)
        let Name = document.createElement("h2");
        Name.innerText = `${User[0].name}`;
        let Email = document.createElement("h2");
        Email.innerText = `Email : ${User[0].email}`;
        let Mobile = document.createElement("h2");
        Mobile.innerText = `Mobile : ${User[0].MobileNumber}`;
        INFO.append(Name, Email, Mobile);
        //console.log(INFO)
    }
    //console.log("keshav")
};
DisplayUser();

if (Info.length > 1) {
    let Logout = document.getElementById("Login");
    Logout.innerText = "Logout";
    Logout.addEventListener("click", () => {
        Info = [flag];
        localStorage.setItem("LoginInfo", JSON.stringify(Info));
    });
}