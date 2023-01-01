let Sort;
let searchInput1;
 let Universal="crime";



let Display = document.getElementById("Universal");
Display.addEventListener("input", function (e) {
    Universal = e.target.value.toLowerCase();
    // console.log(e.target.value.toLowerCase());
    getData();
    if (e.target.value == "") {
        window.location.href = "index.html";
    }
});

getData();
async function getData() {
    const URL = `https://www.omdbapi.com/?s=${Universal}&apikey=dd861ec6`;
    try {
        let Response = await fetch(URL);
        let Data = await Response.json();
        // console.log(Data.Search);
        Sort = Data.Search;
        // append(Data.Search)
        if (Sort === undefined) {
            document.getElementById("movies").innerHTML = "";
            let Div = document.createElement("div");
            Div.setAttribute("id", "NOResult");
            let PosterURL = document.createElement("img");
            PosterURL.src = "https://media4.giphy.com/media/5YgoFLQ4cfiqAJLauQ/200.webp?cid=ecf05e47oq5vqfk1oc8j151mgtgi8axco531u6n5lqkq684w&rid=200.webp&ct=g";
            PosterURL.setAttribute("id", "NoResult1");
            let ShowMessage = document.createElement("h4");
            ShowMessage.innerText = "Searching anything else...";
            Div.append(PosterURL, ShowMessage);
            //console.log(Div);
            //console.log(document.querySelector("#movies"))
            document.querySelector("#movies").append(Div)
        }
        else if (Sort.length != 0) {
            append(Data.Search)
        }
        // SortByYear(Data.Search)
        Search(Data.Search)
    } catch (error) {
        console.log(error);
    }
}


function append(data) {
    document.getElementById("movies").innerHTML = "";
    let movies = document.getElementById("movies");
    console.log(data);
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
        div.append(img, h4, Year, IMDB);
        movies.append(div);
    });
}

function Search(Movies) {
    let searchInput = document.querySelector("#data-search");
    searchInput.addEventListener("input", function (element) {
        let value = element.target.value.toLowerCase()
        searchInput1 = value;
        if (value == "") {
            window.location.href = "index.html";
        }
        let MoviesSearch = Movies.filter(function (el) {
            return el.Title.toLowerCase().includes(value)
        })

        //  console.log("keshav", MoviesSearch, MoviesSearch.length)
        if (MoviesSearch.length === 0) {
            document.getElementById("movies1").innerHTML = "";
            let Div = document.createElement("div");
            let PosterURL = document.createElement("img");
            PosterURL.src = "https://i.pinimg.com/originals/6d/38/dd/6d38dd757b375e577c64962d8256efa8.gif";
            PosterURL.setAttribute("id", "NoResult");
            let ShowMessage = document.createElement("h4");
            ShowMessage.innerText = "Searching in Universe...";
            Div.append(PosterURL, ShowMessage);
            //console.log(Div);
            // console.log(document.querySelector("#movies1"))
            document.querySelector("#movies1").append(Div)
        }
        else if (MoviesSearch.length != 0) {
            DisplayData1(MoviesSearch);
        }
    })
}

function SortByYearAsc(Sort) {
    let SortByYearAsc = Sort.sort(function (a, b) {
        let A = a.Year[0] + a.Year[1] + a.Year[2] + a.Year[3];
        let B = b.Year[0] + b.Year[1] + b.Year[2] + b.Year[3];
        return A - B;
    });
    append(SortByYearAsc);
}

function SortByYearDes(Sort) {
    let SortByYearDes = Sort.sort(function (a, b) {
        let A = a.Year[0] + a.Year[1] + a.Year[2] + a.Year[3];
        let B = b.Year[0] + b.Year[1] + b.Year[2] + b.Year[3];
        return B - A;
    });
    append(SortByYearDes);
}


function SortByIMDBDes(Sort) {
    let SortByIMDBDes = Sort.sort(function (a, b) {
        let A = ""; let B = "";
        for (let i = 2; i < a.imdbID.length; i++) {
            A += a.imdbID[i];
        }
        for (let i = 2; i < b.imdbID.length; i++) {
            B += b.imdbID[i];
        }
        // console.log("keshav", +A, +B);
        return +A - +B;
    });
    append(SortByIMDBDes);

}
function SortByIMDBAsc(Sort) {
    let SortByIMDBAsc = Sort.sort(function (a, b) {
        let A = ""; let B = "";
        for (let i = 2; i < a.imdbID.length; i++) {
            A += a.imdbID[i];
        }
        for (let i = 2; i < b.imdbID.length; i++) {
            B += b.imdbID[i];
        }
        // console.log("keshav", +A, +B);
        return +B - +A;
    });
    append(SortByIMDBAsc);
}

function DisplayData1(Movies) {
    // console.log(Movies);
    //console.log(document.getElementById("movies"))
    document.getElementById("movies1").innerHTML = "";
    Movies.forEach(function (item) {
        let img = document.createElement("img");
        img.src = item.Poster;
        let h4 = document.createElement("h4");
        h4.innerText = item.Title;
        let Year = document.createElement("p");
        Year.innerText = `Year : ${item.Year}`;
        let IMDB = document.createElement("p");
        let X = Math.random(10) + 6;
        X = X.toFixed(1);
        IMDB.innerText = `IMDB : ${item.imdbID}`;

        let div = document.createElement("div");
        div.append(img, h4, Year, IMDB);
        document.querySelector("#movies1").append(div);
    });
}