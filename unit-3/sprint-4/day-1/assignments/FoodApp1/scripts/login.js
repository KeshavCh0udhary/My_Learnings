import navbar from "../Component/navbar.js";
document.getElementById("navbar").innerHTML = navbar();
let flag = false;
let Data = JSON.parse(localStorage.getItem("users")) || [];
let LoginInfo = JSON.parse(localStorage.getItem("LoginInfo")) || [flag];
localStorage.setItem("LoginInfo", JSON.stringify(LoginInfo));
//console.log(LoginInfo);
document.querySelector("form").addEventListener("submit", () => {
    LoginDetails();
});

if (LoginInfo.length > 1) {
    let Logout = document.getElementById("Login");
    Logout.innerText = "Logout";
    Logout.addEventListener("click", () => {
        LoginInfo = [flag];
        localStorage.setItem("LoginInfo", JSON.stringify(LoginInfo));
    });
}

let LoginDetails = () => {
    event.preventDefault();
    if (!Data.length) {
        alert("Please Register with us first");
        window.location.href = "signup.html";
        return;
    }//console.log(Data.length)
    if (LoginInfo.length > 1) {
        alert("Already login");
        window.location.href = "mealOfTheDay.html";
        return;
    }
    LoginInfo = [flag];
    //console.log("keshav")
    class login {
        constructor(email) {
            this.email = email;
        }
        Login(username, password) {
            let flag = false;
            let SignIn = Data.filter(function (el) {
                if (el.password == password && el.email == username) {
                    alert("login success!");
                    LoginInfo[0] = true;
                    LoginInfo.push(obj);
                    document.getElementById("Login").innerText = "Logout";
                    //console.log(LoginInfo);
                    localStorage.setItem("LoginInfo", JSON.stringify(LoginInfo));
                    window.location.href = "index.html";
                    return el;
                } else if (el.password !== password && el.email == username) {
                    alert("Invalid Password");
                    flag = true;
                }
            });
            if (flag) {
                return;
            }
            //console.log(SignIn, "Keshav")
            if (!SignIn.length) {
                alert("This email is not registered with us");
                window.location.href = "signup.html";
            }
        }
    }

    class NewLogin extends login {
        constructor(username) {
            super(username);
        }
    }

    let username = document.getElementById("Username").value;
    let password = document.getElementById("Password").value;

    let obj = new NewLogin(username);
    obj.Login(username, password);
}



