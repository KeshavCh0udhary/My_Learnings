// All the JS Code for the Add Students Page Goes Here


document.querySelector("form").addEventListener("submit", Admission);
let admission = JSON.parse(localStorage.getItem("admission")) || [];

function Admission(event) {
    event.preventDefault();

    let StudentsDetails = {
        Name: document.querySelector("#name").value,
        Gender: document.querySelector("#gender").value,
        Email: document.querySelector("#email").value,
        MobileNumber: document.querySelector("#phone").value,
        Course: document.querySelector("#course").value
    }
    admission.push(StudentsDetails);
    localStorage.setItem("admission", JSON.stringify(admission));
}