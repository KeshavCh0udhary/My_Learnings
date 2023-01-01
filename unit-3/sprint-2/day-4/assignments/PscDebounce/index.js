async function Main() {
    let Query = document.getElementById("Query").value;
    let data = await getData(Query);
    if(Query==""){
        window.location.href = "index.html";
    }
    Append(data.results);
}
async function  getData() {
    let Query=document.querySelector("#Query").value;
    const url=`https://swapi.dev/api/people/?search=${Query}`;
    let Response=await fetch(url);
    let data = await Response.json();
    console.log(data)
    return data
};

let id;
function debounce(func, delay) {
    if (id) {
        clearTimeout(id);
    }
    console.log(id);
    id = setTimeout(function () {
        func()
    }, delay)
}

function Append(data) {

    if (!data) {
        return;
    }
    let container = document.getElementById("Results");
    container.innerHTML = null;
    if(container.innerHTML !== null){
        container.style.backgroundColor = "rgb(50,50,50)"
    }
    data.forEach(function (el) {
        let Heading = document.createElement("p");
        Heading.innerText = el.name;
        Heading.addEventListener("click", function () {
            getdata1(el)
        })
        let div = document.createElement("div");
        div.addEventListener("click", function () {
            getdata1(el)
        })
        div.setAttribute("class", "movie")
        div.append(Heading)
        container.append(div);
    })
}


function getdata1(data) {

    let body = document.querySelector("body")
    body.innerHTML = null;

    let DIV = document.createElement("div");
    DIV.setAttribute("id", "parent");

    let h1 = document.createElement("h1");
    h1.innerText = data.name;

    let Div = document.createElement("div");
    Div.setAttribute("id", "InsideDiv");
    let Div1 = document.createElement("div");

    let h2 = document.createElement("h2");
    h2.innerText = "Personal Info";

    let h3 = document.createElement("h3");
    h3.innerText = `Birth: ${data.birth_year}`;

    let h4 = document.createElement("h3");
    h4.innerText = `Gender: ${data.gender}`;

    let h5 = document.createElement("h3");
    h5.innerText = `Height: ${data.height}`;

    Div1.append(h2, h3, h4, h5)

    let Div2 = document.createElement("div");

    let h6 = document.createElement("h2");
    h6.innerText = "Anotomy";

    let h8 = document.createElement("h3");
    h8.innerText = `Eye_Color: ${data.eye_color}`;

    let h9 = document.createElement("h3");
    h9.innerText = `Mass: ${data.mass}`;

    let h10 = document.createElement("h3");
    h10.innerText = `Skin_Color: ${data.skin_color}`;

    Div2.append(h6, h8, h9, h10)

    Div.append(Div1, Div2)

    let Button = document.createElement("button");
    Button.innerText = "Go Back";
    Button.setAttribute("id", "Button");
    Button.addEventListener("click", function () {
        window.location.reload();
    })

    DIV.append(h1, Div, Button)
    body.append(DIV)
}