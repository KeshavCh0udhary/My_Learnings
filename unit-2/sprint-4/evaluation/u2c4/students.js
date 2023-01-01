// All the Code for All Students Page Goes Here

let details = JSON.parse(localStorage.getItem('admission'));

let Display = JSON.parse(localStorage.getItem('admission-accepted')) || [];
let Display1 = JSON.parse(localStorage.getItem('admission-rejected')) || [];

details.forEach(function (el) {
    let tr = document.createElement('tr');
    let td = document.createElement('td');
    td.innerText = el.Name;
    let td1 = document.createElement('td');
    td1.innerText = el.Gender;
    let td2 = document.createElement('td');
    td2.innerText = el.Email;
    let td3 = document.createElement('td');
    td3.innerText = el.MobileNumber;
    let td4 = document.createElement('td');
    td4.innerText = el.Course;
    let td5 = document.createElement('td');
    td5.innerText = "Accept";
    td5.style.backgroundColor = "green";
    td5.style.color = "white";
    td5.addEventListener('click', function () {
        Accept(el);
        td5.parentNode.remove();
    });

    let td6 = document.createElement('td');
    td6.innerText = "Reject";
    td6.style.backgroundColor = "red";
    td6.style.color = "white";
    td6.addEventListener('click', function () {
        Reject(el);
        td6.parentNode.remove();
    });

    tr.append(td, td1, td2, td3, td4, td5, td6);
    document.querySelector("tbody").append(tr);
});


function Accept(el) {

    Display.push(el);

    localStorage.setItem('admission-accepted', JSON.stringify(Display));
}

function Reject(el) {

    Display1.push(el);

    localStorage.setItem('admission-rejected', JSON.stringify(Display1));
}