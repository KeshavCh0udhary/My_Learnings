let UserData = JSON.parse(localStorage.getItem("SignUpInfo"));
let LoginDetails = JSON.parse(localStorage.getItem("LoginDetails")) || [];

function Login(event) {
    event.preventDefault();
    let UserName_Email = document.getElementById("Username").value;
    let Password = document.getElementById("Password").value;
    let Filter = UserData.filter(function (ele) {
        return ele.UserName == UserName_Email || ele.UserEmail == UserName_Email;
    });

    if (Filter.length > 0) {

        if (Filter[0].Password != Password) {
            alert("Invalid password");
        }
        else {
            alert("Logged in sucessfully");
            LoginDetails.push(Filter[0].UserName, Filter[0].Password);
            localStorage.setItem("LoggdinDetails", JSON.stringify(LoginDetails));
            window.location.href = "index.html";
        }
    }
    else {
        alert("invalid Credentials");
    }
}
