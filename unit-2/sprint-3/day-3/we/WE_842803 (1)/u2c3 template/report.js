// write code here, dont change anything in HTML and css files 
// refer to id's mentioned in html files carefully
// Follow the exact column order for tables,for eg: name should be filled under "name" column 
// we are using form here, make sure you are using "submit" eventListener , or else you will get 0 marks

document.querySelector('form').addEventListener("submit", AddData);
function AddData(event) {
    event.preventDefault();
    let Profile = document.querySelector("form").image.value;
    let Name = document.querySelector("#name").value;
    let Batch = document.querySelector("#batch").value;
    let DSA = document.querySelector("#dsa").value;
    let Skillathon = document.querySelector("#cs").value;
    let CODE = document.querySelector("#coding").value;

    let TableRow = document.createElement("tr");

    let TableDiv1 = document.createElement("td");
    let Image = document.createElement("img");
    Image.setAttribute("src", Profile);
    TableDiv1.append(Image);

    let TableDiv2 = document.createElement("td");
    TableDiv2.innerText = Name;

    let TableDiv3 = document.createElement("td");
    TableDiv3.innerText = Batch;

    let TableDiv4 = document.createElement("td");
    TableDiv4.innerText = DSA;

    let TableDiv5 = document.createElement("td");
    TableDiv5.innerText = Skillathon;

    let TableDiv6 = document.createElement("td");
    TableDiv6.innerText = CODE;

    let Marks = Number(DSA) + Number(CODE) + Number(Skillathon);
    let Result = (Marks / 30) * 100;
    let TableDiv7 = document.createElement("td");
    TableDiv7.innerText = Result.toFixed(2);

    let TableDiv8 = document.createElement("td");
    if (Result > 50) {
        TableDiv8.innerText = "Regular";
        TableDiv8.style.backgroundColor = "green";
    }
    else {
        TableDiv8.innerText = "Async";
        TableDiv8.style.backgroundColor = "red";
    }

    let TableDiv9 = document.createElement("td");
    TableDiv9.innerText = "Delete";
    TableDiv9.style.backgroundColor = "red";
    TableDiv9.style.cursor = "pointer";
    TableDiv9.addEventListener("click", Delete);


    TableRow.append(TableDiv1, TableDiv2, TableDiv3, TableDiv4, TableDiv5, TableDiv6, TableDiv7, TableDiv8, TableDiv9);
    document.querySelector("tbody").append(TableRow);
    console.log(TableDiv1, TableDiv2, TableDiv3, TableDiv4, TableDiv5, TableDiv6, TableDiv7, TableDiv8, TableDiv9)

}

function Delete(event) {
    event.target.parentNode.remove();
}