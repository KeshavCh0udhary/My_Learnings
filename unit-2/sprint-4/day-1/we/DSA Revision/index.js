document.querySelector("form").addEventListener("submit", DSAList);

let QuestionArr = JSON.parse(localStorage.getItem("DSADATA")) || [];

// if(localStorage.getItem("DSADATA")=== null){
//     QuestionArr=[];
// }
// else{
//     QuestionArr = JSON.parse(localStorage.getItem("DSADATA"))
// }


function DSAList(event) {
    event.preventDefault();
    let QuestionObj = {
        QuestionTitle: document.querySelector("#title").value,
        QuestionLink: document.querySelector("#link").value,
        DifficultyLevel: document.querySelector("#difficulty").value,
    }
    QuestionArr.push(QuestionObj);

    Display(QuestionArr)

    // window.addEventListener("load", function () {
    //     Display(QuestionArr)
    // })
    
    localStorage.setItem("DSADATA", JSON.stringify(QuestionArr));

}
Display(QuestionArr)


function Display(QuestionArr) {

    document.querySelector("tbody").innerHTML = "";
    QuestionArr.forEach(function (el) {
        let TableRow = document.createElement("tr");
        let TableDiv = document.createElement("td");
        TableDiv.innerText = el.QuestionTitle;

        let TableDiv1 = document.createElement("td");
        TableDiv1.innerText = el.QuestionLink;

        let TableDiv2 = document.createElement("td");
        TableDiv2.innerText = el.DifficultyLevel;

        let TableDiv3 = document.createElement("td");

        if (TableDiv2.innerText === "Easy") {
            TableDiv3.innerText = "No";
            document.querySelector("tr");
            TableRow.style.backgroundColor = "lightgreen";

        }
        else if (TableDiv2.innerText === "Medium") {
            TableDiv3.innerText = "Depends On You";
            document.querySelector("tr");
            TableRow.style.backgroundColor = "yellow";
        }
        else {
            TableDiv3.innerText = "Definitely";
            document.querySelector("tr")
            TableRow.style.backgroundColor = "darkred";
            TableRow.style.color = "lightblue";
        }

        let Button = document.createElement("button");
        Button.innerText = "Delete";

        Button.addEventListener("click", Delete);


        TableRow.append(TableDiv, TableDiv1, TableDiv2, TableDiv3, Button);

        document.querySelector("tbody").append(TableRow);
    });
}


function Delete(event) {
    event.target.parentNode.remove();
}