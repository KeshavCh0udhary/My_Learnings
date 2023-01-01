let images = JSON.parse(localStorage.getItem("images")) || [
    "https://m.media-amazon.com/images/I/81T4v8GOhBL._SY679_.jpg", "https://i.pinimg.com/originals/d9/f0/88/d9f08864dc441c8a4a905dbc916f65cd.jpg", "https://www.pinkvilla.com/files/styles/amp_metadata_content_image/public/prabhas-bahubali-main.jpg", "https://assets.telegraphindia.com/telegraph/2020/Aug/1597773389_b-and-a.jpg", "https://st1.bollywoodlife.com/wp-content/uploads/2021/06/MicrosoftTeams-image-2021-06-21T140124.248.jpg", "https://english.cdn.zeenews.com/sites/default/files/2020/03/13/848821-anushka-shetty-new.jpg", "https://st1.bollywoodlife.com/wp-content/uploads/2022/04/KGF-4.png", "https://i.ndtvimg.com/mt/movies/2013-08/chennai-auctionbig.jpg", "https://static.toiimg.com/thumb/msid-85147219,width-800,height-600,resizemode-75,imgsize-60237,pt-32,y_pad-40/85147219.jpg", "https://www.pinkvilla.com/files/styles/amp_metadata_content_image_min_696px_wide/public/chennai-express-1.jpg",
];




function AddImage() {
    if (document.getElementById("image_url").value != "" && document.getElementById("Movie").value != "" && document.getElementById("ReleaseDate").value && document.getElementById("rating").value) {
        let img_url = document.getElementById("image_url");
        images.push(img_url.value);
        localStorage.setItem("images", JSON.stringify(images));
        TakeMovieList();
        img_url.value = null;
        window.location.href = "index.html";
    }
    else {
        alert("Please fill all the fields");
    }

}


let i = 0;
SlideShow()
function SlideShow() {
    let Container = document.getElementById("slideshow");

    let Interval = setInterval(function () {

        if (i === images.length) {
            i = 0;
        }

        let img = document.createElement("img");
        img.src = images[i];
        Container.innerHTML = null;
        Container.append(img);
        i++;
    }, 2000);
}


let Movies = JSON.parse(localStorage.getItem("movies")) || [
    {
        IMDbrating: "10",
        MovieName: "Bahubali 2",
        PosterURL: "https://m.media-amazon.com/images/I/81T4v8GOhBL._SY679_.jpg",
        ReleaseDate: "1999-12-15"
    },
    {
        IMDbrating: "6",
        MovieName: "Bahubali",
        PosterURL: "https://i.pinimg.com/originals/d9/f0/88/d9f08864dc441c8a4a905dbc916f65cd.jpg",
        ReleaseDate: "2000-12-15"
    },
    {
        IMDbrating: "9",
        MovieName: "Bahubali",
        PosterURL: "https://www.pinkvilla.com/files/styles/amp_metadata_content_image/public/prabhas-bahubali-main.jpg",
        ReleaseDate: "2001-12-15"
    },
    {
        IMDbrating: "8",
        MovieName: "Bahubali",
        PosterURL: "https://assets.telegraphindia.com/telegraph/2020/Aug/1597773389_b-and-a.jpg",
        ReleaseDate: "2000-12-15"
    },
    {
        IMDbrating: "7",
        MovieName: "Bahubali",
        PosterURL: "https://st1.bollywoodlife.com/wp-content/uploads/2021/06/MicrosoftTeams-image-2021-06-21T140124.248.jpg",
        ReleaseDate: "1999-12-15"
    },
    {
        IMDbrating: "6",
        MovieName: "Bahubali",
        PosterURL: "https://english.cdn.zeenews.com/sites/default/files/2020/03/13/848821-anushka-shetty-new.jpg",
        ReleaseDate: "2000-12-15"
    },
    {
        IMDbrating: "10",
        MovieName: "KGF 2",
        PosterURL: "https://st1.bollywoodlife.com/wp-content/uploads/2022/04/KGF-4.png",
        ReleaseDate: "2022-12-15"
    },
    {
        IMDbrating: "5",
        MovieName: "Chennai Express",
        PosterURL: "https://i.ndtvimg.com/mt/movies/2013-08/chennai-auctionbig.jpg",
        ReleaseDate: "2010-12-15"
    },
    {
        IMDbrating: "8",
        MovieName: "Chennai Express",
        PosterURL: "https://static.toiimg.com/thumb/msid-85147219,width-800,height-600,resizemode-75,imgsize-60237,pt-32,y_pad-40/85147219.jpg",
        ReleaseDate: "2015-01-15"
    },
]

function TakeMovieList() {
    let MovieName = document.getElementById("Movie").value;
    let ReleaseDate = document.getElementById("ReleaseDate").value;
    let PosterURL = document.getElementById("image_url").value;
    let IMDbrating = document.getElementById("rating").value;
    let MoviesList = new MoviesObject(MovieName, ReleaseDate, PosterURL, IMDbrating);
    Movies.push(MoviesList);
    localStorage.setItem("movies", JSON.stringify(Movies));
    Movie.value = null;
    ReleaseDate.value = null;
    rating.value = null;
}


function MoviesObject(MovieName, ReleaseDate, PosterURL, IMDbrating) {
    this.MovieName = MovieName;
    this.ReleaseDate = ReleaseDate;
    this.PosterURL = PosterURL;
    this.IMDbrating = IMDbrating;
}



DisplayData(Movies)

function DisplayData(Movies) {
    console.log(Movies);
    document.getElementById("movies").innerHTML = "";
    Movies.forEach(function (ele) {
        let Div = document.createElement("div");
        let PosterURL = document.createElement("img");
        PosterURL.src = ele.PosterURL;
        let MovieName = document.createElement("h4");
        MovieName.innerText = ele.MovieName;

        let ReleaseDate = document.createElement("p");
        ReleaseDate.innerText = `Release Date : ${ele.ReleaseDate}`;
        let IMDbrating = document.createElement("p");
        IMDbrating.innerText = `IMDb : ${ele.IMDbrating}`;
        Div.append(PosterURL, MovieName, ReleaseDate, IMDbrating)
        document.querySelector("#movies").append(Div);
    });
}


function sortMe(Movies) {

    let TopRating = Movies.sort(function (a, b) {
        if (+a.IMDbrating > +b.IMDbrating) return -1
        if (+a.IMDbrating < +b.IMDbrating) return 1
        return 0
    });

    DisplayData(TopRating)
}


function SortMe(Movies) {
    let LowRating = Movies.sort(function (a, b) {
        if (+a.IMDbrating > +b.IMDbrating) return 1
        if (+a.IMDbrating < +b.IMDbrating) return -1
        return 0
    })
    DisplayData(LowRating)
}

let searchInput = document.querySelector("#data-search");
searchInput.addEventListener("input", function(element) {
    let value = element.target.value.toLowerCase()
    if(value==""){
        window.location.reload();
    }
    let MoviesSearch = Movies.filter(function (el) {
        return el.MovieName.toLowerCase().includes(value)
    })

    console.log("keshav", MoviesSearch, MoviesSearch.length)
    if (MoviesSearch.length === 0) {
        document.getElementById("movies1").innerHTML = "";
        let Div = document.createElement("div");
        
        let PosterURL = document.createElement("img");
        PosterURL.src = "https://i.pinimg.com/originals/6d/38/dd/6d38dd757b375e577c64962d8256efa8.gif";
        PosterURL.setAttribute("id","NoResult");
        let ShowMessage = document.createElement("h4");
        ShowMessage.innerText = "Searching in Universe...";
        Div.append(PosterURL,ShowMessage);
        console.log(Div);
        console.log(document.querySelector("#movies1"))
        document.querySelector("#movies1").append(Div)
    }
    else if (MoviesSearch.length != 0) {
        DisplayData1(MoviesSearch);
    }
})

function DisplayData1(Movies) {
    console.log(Movies);
    console.log(document.getElementById("movies"))
    document.getElementById("movies1").innerHTML = "";
    Movies.forEach(function (ele) {
        let Div = document.createElement("div");
        let PosterURL = document.createElement("img");
        PosterURL.src = ele.PosterURL;
        let MovieName = document.createElement("h4");
        MovieName.innerText = ele.MovieName;

        let ReleaseDate = document.createElement("p");
        ReleaseDate.innerText = `Release Date : ${ele.ReleaseDate}`;
        let IMDbrating = document.createElement("p");
        IMDbrating.innerText = `IMDb : ${ele.IMDbrating}`;
        Div.append(PosterURL, MovieName, ReleaseDate, IMDbrating)
        document.querySelector("#movies1").append(Div);
    });
}