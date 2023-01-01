
async function getData() {
    const url = `https://api.themoviedb.org/3/trending/movie/day?api_key=3609ae59a5141b9d82e639541f27ef90`;
    let response = await fetch(url);
    let data = await response.json();
     append(data.results);
    console.log("Keshav",data.results)
}

getData()

function append(data) {
 if(!data){
    return
 }
    let Movies = document.getElementById("Trending");
    data.forEach(function (item) {

        // console.log(item.imdbID);
        let img = document.createElement("img");
        img.src = item.poster_path;
        let h4 = document.createElement("h4");
        h4.innerText = `Title : ${item.title}`;
        let Year = document.createElement("p");
        Year.innerText = `Release date : ${item.release_date}`;
        let IMDB = document.createElement("p");
        IMDB.innerText = `IMDB : ${item.imdbID}`;
        let div = document.createElement("div");
        div.setAttribute("id", "item")
        let DIV = document.createElement("div");
        div.setAttribute("id", "Details");
        div.addEventListener("click", function () {
            // console.log(item.imdbID);
            // displayDetails(item.imdbID);
        });
        DIV.append(h4, Year)
        div.append(img, DIV);
        Movies.append(div);
    });
}