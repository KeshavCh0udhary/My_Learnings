async function Search() {
    let query = document.getElementById("query").value;
    if(query==""){
        window.location.href="index.html"
    }
    let data = await getData(query);
    Store(data.Search)
    append(data.Search);
}

async function getData(query) {
    const url = `https://www.omdbapi.com/?s=${query}&apikey=dd861ec6`;
    let response = await fetch(url);
    let data = await response.json();
    return data;
}

function Store(resolve) {
    let storeID = []
    resolve.forEach(function (el) {
        storeID.push(el.imdbID)
    })
    matchData(storeID)
    console.log(storeID);
}
let movieData = [];
function matchData(storeID) {
       movieData = [];
        storeID.forEach(async function (el) {
            const url = `https://www.omdbapi.com/?i=${el}&apikey=5a887465`;
            let response = await fetch(url);
            let MoviesDetails = await response.json();
            movieData.push(MoviesDetails);
        });
    let id = setTimeout(function () {
        console.log(movieData);
    }, 1000);

}

function displayDetails(ImdbId) {
    movieData.forEach(function (el){
        if(el.imdbID==ImdbId){
            let div = document.getElementById("Display")
            div.innerHTML =null;
            let img = document.createElement("img")
            img.src = el.Poster;
            let DIV = document.createElement("div")
            DIV.append(img);
            let actors = document.createElement("h3")
            actors.innerText = `Actors : ${el.Actors}`;
            let awards = document.createElement("h4")
            awards.innerText = `Awards : ${el.Awards}`;
            let boxoffice = document.createElement("h5")
            boxoffice.innerText = `Box Office : ${el.BoxOffice}`;
            let country = document.createElement("p")
            country.innerText = `Country : ${el.Country}`;
            let DVD= document.createElement("p");
            DVD.innerText = `DVD: ${el.DVD}`;
            let Director= document.createElement("p");
            Director.innerText = `Director : ${el.Director}`;
            let Genre= document.createElement("p");
            Genre.innerText = `Genre : ${el.Genre}`;
            let Language= document.createElement("p");
            Language.innerText = `Language : ${el.Language}`;
            let Metascore= document.createElement("p");
            Metascore.innerText = `Metascore : ${el.Metascore}`;
            let ReleaseDate = document.createElement("p");
            ReleaseDate.innerText = `ReleaseDate : ${el.ReleaseDate}`;
            let Runtime= document.createElement("p");
            Runtime.innerText = `Runtime : ${el.Runtime}`;
            let Title = document.createElement("p");
            Title.innerText = `Title : ${el.Title}`;
            let Writer = document.createElement("p");
            Writer.innerText = `Writer : ${el.Writer}`;
            let Year = document.createElement("p");
            Year.innerText = `Year : ${el.Year}`;
            let imdbRating = document.createElement("p");
            imdbRating.innerText = `IMDB Rating : ${el.imdbRating}`;
            let imdbVotes = document.createElement("p");
            imdbVotes.innerText = `IMDB Votes : ${el.imdbVotes}`;
            let info = document.createElement("div")
            let plot = document.createElement("p")
            plot.innerText = `Plot : ${el.Plot}`
            info.append(actors,awards, boxoffice, country,DVD,Director,Genre,Language,Metascore,Runtime,Title,Writer,Year,imdbRating,imdbVotes);
            div.append(DIV, info)
        }
    });
}

function append(data) {
    if (!data) {
        return;
    }
    let Movies = document.getElementById("Movies");
    Movies.innerHTML = null
    if (Movies !== null) {
        Movies.style.backgroundColor = "black";
    }
    // console.log(data);
    data.forEach(function (item) {

        console.log(item.imdbID);
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
        let DIV = document.createElement("div");
        div.setAttribute("id", "Details");
        div.addEventListener("click", function () {
            console.log(item.imdbID);
            displayDetails(item.imdbID);
        });
        DIV.append(h4, Year)
        div.append(img, DIV);
        Movies.append(div);
    });
}
let id;
function debounce(fn, delay) {
    if (id) {
        clearTimeout(id);
    }
    id = setTimeout(function () {
        fn();
    }, delay);
}