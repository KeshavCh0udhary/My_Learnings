let UserData = JSON.parse(localStorage.getItem("SignUpInfo")) || [];
let UserAccount=document.querySelector("form").addEventListener("submit", CreateAccount);

function CreateAccount(event) {
    event.preventDefault();
    let UserName = document.getElementById("Username").value;
    let UserEmail = document.getElementById("Email").value;
    let Password =document.getElementById("Password").value;
    let ConfirmPassword = document.getElementById("MatchPassword").value;
    let MobileNumber = document.getElementById("PhoneNumber").value;
    let UserAccountData = {
        UserName: UserName,
        UserEmail: UserEmail,
        Password: Password,
        ConfirmPassword: ConfirmPassword,
        MobileNumber:MobileNumber
    }
    if (UserName != "" && UserEmail != "" && Password != "" && ConfirmPassword != "" && MobileNumber != "") {
        let FliterData = UserData.filter(function (ele) {
            return ele.UserEmail == UserEmail;
        });
        if (Password != ConfirmPassword) {
            alert("Password is not Matched");
        }
        else if (FliterData.length > 0) {
            alert("Allready registered");
            window.location.href="login.html";
        }
        else {
            alert("Registerd sucessfully");
            UserData.push(UserAccountData)
            localStorage.setItem("SignUpInfo", JSON.stringify(UserData));
            window.location.href="login.html";
        }
    }
    else {
        alert("Invalid Credentials")
    }
}