// All the Code for the Admitted page goes here

let Admitted = JSON.parse(localStorage.getItem("admission-accepted")) || [];

Admitted.forEach(function (el) {
    let tr = document.createElement('tr');
    let td = document.createElement('td');
    td.innerText = el.Name;
    let td1 = document.createElement('td');
    td1.innerText = el.Email;
    let td2 = document.createElement('td');
    td2.innerText = el.Course;
    let td3 = document.createElement('td');
    td3.innerText = el.Gender;
    let td4 = document.createElement('td');
    td4.innerText = el.MobileNumber;

    tr.append(td, td1, td2, td3, td4);
    document.querySelector("tbody").append(tr);
});