// fill in javascript code here
document.querySelector('form').addEventListener("submit", AddData);

function AddData(event){
event.preventDefault();
let Name= document.querySelector("#name").value;
let EmployeeId= document.querySelector("#employeeID").value;
let Department= document.querySelector("#department").value;
let Experience= document.querySelector("#exp").value;
let Email= document.querySelector("#email").value;
let Mobile= document.querySelector("#mbl").value;

let TRow= document.createElement("tr");

let TDiv1 = document.createElement("td");
TDiv1.innerText=Name;

let TDiv2 = document.createElement("td");
TDiv2.innerText=EmployeeId;

let TDiv3 = document.createElement("td");
TDiv3.innerText=Department;

let TDiv4 = document.createElement("td");
TDiv4.innerText=Experience;

let TDiv5 = document.createElement("td");
TDiv5.innerText=Email;

let TDiv6 = document.createElement("td");
TDiv6.innerText=Mobile;

let TDiv7 = document.createElement("td");
if(Number(Experience)>5){
    TDiv7.innerText="Senior";
}
else if (Number(Experience)<=5 && Number(Experience)>=2){
    TDiv7.innerText="Junior";
}
else if (Number(Experience)<=1){
    TDiv7.innerText="Fresher";
   
}
// console.log(TDiv7);
// console.log(Number(Experience));


let TDiv8 = document.createElement("td");
TDiv8.innerHTML ="Delete";
TDiv8.style.backgroundColor= "red";
TDiv8.style.cursor="pointer";
TDiv8.addEventListener("click", Delete);


TRow.append(TDiv1,TDiv2,TDiv3,TDiv4,TDiv5,TDiv6,TDiv7,TDiv8);
document.querySelector("tbody").append(TRow);
}``

function Delete(event){
event.target.parentNode.remove();
}