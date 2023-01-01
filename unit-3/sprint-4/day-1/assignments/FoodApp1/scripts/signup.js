import navbar from "../Component/navbar.js";
document.getElementById("navbar").innerHTML = navbar();

let Data = JSON.parse(localStorage.getItem('users')) || [];

let UserRegister = document.querySelector("form").addEventListener("submit", () => {
    CreateAccount()
});

let CreateAccount = () => {
    event.preventDefault();
    class Users {
        constructor(name, email, password, Mobile) {
            this.name = name;
            this.email = email;
            this.password = password;
            this.MobileNumber = Mobile;
            //console.log(Mobile)
        }

        signUp(name, email, password, MatchPassword, Mobile) {
            let IsValidated = false;
            IsValidated = this.#IsValidateName(name) && this.#IsValidateEmail(email) && this.#IsValidatePassword(password, MatchPassword);
            console.log(Mobile)
            if (IsValidated === true) {
                let FliterData = Data.filter((ele) => {
                    return ele.email == email;
                });
                if (FliterData.length > 0) {
                    alert("Allready registered");
                    window.location.href = "login.html";
                }
                else {
                    this.name = name;
                    this.email = email;
                    this.password = password;
                    alert(`${this.name} Registerd Successfully`);
                    Data.push(this);
                    localStorage.setItem("users", JSON.stringify(Data));
                    window.location.href = "login.html";
                }
            } else {
                alert("Please fill correct details");
            }
        }

        #IsValidateName(name) {
            return name.length < 3 ? false : true;
        }
        #IsValidateEmail(email) {
            return email.length < 3 ? false : true;
        }
        #IsValidatePassword(password, MatchPassword) {
            return password === MatchPassword;
        }
    }

    class NewUser extends Users {
        constructor(name, email, password, Mobile) {
            super(name, email, password, Mobile);
        }
    }

    let name = document.getElementById("name").value;
    let email = document.getElementById("email").value;
    let password = document.getElementById("password").value;
    let MatchPassword = document.getElementById("MatchPassword").value;
    let Mobile = document.getElementById("PhoneNumber").value;
    //console.log(Mobile)

    let obj = new NewUser(name, email, password, Mobile);
    obj.signUp(name, email, password, MatchPassword, Mobile);
}


let Info = JSON.parse(localStorage.getItem("LoginInfo")) || [];
if (Info.length > 1) {
    let Logout = document.getElementById("Login");
    Logout.innerText = "Logout";
    Logout.addEventListener("click", () => {
        Info = [flag];
        localStorage.setItem("LoginInfo", JSON.stringify(Info));
    });
}
