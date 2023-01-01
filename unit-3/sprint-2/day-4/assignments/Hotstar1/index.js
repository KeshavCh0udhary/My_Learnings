async function Search(){
    let query=document.getElementById("query").value;
    let data= await getData(query);
   append(data.Search);
}

async function getData(query){
    const url = `https://www.omdbapi.com/?s=${query}&apikey=dd861ec6`;
    let response= await fetch(url);
    let data= await response.json();
    return data;
}

function append(data) {
    if(!data){
        return;
    }
    document.getElementById("Movies").innerHTML = null;
    let Movies = document.getElementById("Movies");

    data.forEach(function (item) {
        let img = document.createElement("img");
        img.src = item.Poster;
        let h4 = document.createElement("h4");
        h4.innerText = item.Title;
        let Year = document.createElement("p");
        Year.innerText = `Year : ${item.Year}`;
        let IMDB = document.createElement("p");
        IMDB.innerText = `IMDB : ${item.imdbID}`;
        let div = document.createElement("div");
        div.setAttribute("id", "item")
        let DIV=document.createElement("div");
        div.setAttribute("id","Details");
        DIV.append(h4, Year, IMDB)
        div.append(img,DIV);
        div.addEventListener("click", function(e) {
            
        });
        Movies.append(div);
    });
}
let id;
function debounce(fn, delay) {
    if(id){
       clearTimeout(id);
    }
       id = setTimeout(function () {
        fn();
    }, delay);
}