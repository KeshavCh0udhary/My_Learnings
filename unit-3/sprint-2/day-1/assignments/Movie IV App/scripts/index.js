
function AddImage() {
    if (document.getElementById("image_url").value != "" && document.getElementById("Movie").value != "" && document.getElementById("ReleaseDate").value && document.getElementById("rating").value) {
        let img_url = document.getElementById("image_url");
        let images = JSON.parse(localStorage.getItem("images")) || [
            "https://m.media-amazon.com/images/I/81T4v8GOhBL._SY679_.jpg", "https://i.pinimg.com/originals/d9/f0/88/d9f08864dc441c8a4a905dbc916f65cd.jpg", "https://www.pinkvilla.com/files/styles/amp_metadata_content_image/public/prabhas-bahubali-main.jpg", "https://assets.telegraphindia.com/telegraph/2020/Aug/1597773389_b-and-a.jpg", "https://st1.bollywoodlife.com/wp-content/uploads/2021/06/MicrosoftTeams-image-2021-06-21T140124.248.jpg", "https://english.cdn.zeenews.com/sites/default/files/2020/03/13/848821-anushka-shetty-new.jpg", "https://images.cinemaexpress.com/uploads/user/imagelibrary/2019/2/10/original/p4kgf1.jpg?w=400&dpr=2.6", "https://i.ndtvimg.com/mt/movies/2013-08/chennai-auctionbig.jpg", "https://static.toiimg.com/thumb/msid-85147219,width-800,height-600,resizemode-75,imgsize-60237,pt-32,y_pad-40/85147219.jpg", "https://www.pinkvilla.com/files/styles/amp_metadata_content_image_min_696px_wide/public/chennai-express-1.jpg",
        ];
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
// let Interval;
let i = 0;
SlideShow()
function SlideShow() {
    let images = JSON.parse(localStorage.getItem("images"));
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
    }, 800);
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
        PosterURL: "https://images.cinemaexpress.com/uploads/user/imagelibrary/2019/2/10/original/p4kgf1.jpg?w=400&dpr=2.6",
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
