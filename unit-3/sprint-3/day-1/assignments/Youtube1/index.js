const API_KEY = "AIzaSyCSTkUoRs76vzLVO4BR797uim2cM7vJUW8"

let OnLoad = async () => {
    const url = `https://youtube.googleapis.com/youtube/v3/videos?part=snippet%2CcontentDetails%2Cstatistics&chart=mostPopular&maxResults=20&regionCode=IN&key=${API_KEY}`
    let response = await fetch(url);
    let data = await response.json();
    // console.log("keshav", data.items)
    console.log("keshav", data.items)
    append(data.items);
}

let input = document.getElementById("query");
input.addEventListener("keypress", (event) => {
    if (event.key === "Enter") {
        event.preventDefault();
        search();
    };
});

let search = async () => {
    let query = document.getElementById("query").value;
    let data = await getData(query);
    append(data.items);
}

let getData = async (query) => {
    const url = `https://youtube.googleapis.com/youtube/v3/search?part=snippet&maxResults=20&q=${query}&key=${API_KEY}`
    let response = await fetch(url);
    let data = await response.json();
    // append(data.items);
    return data;
}

let append = (data) => {
    if (!data) {
        return;
    }
    let Container = document.getElementById("Container");
    Container.innerHTML = null;
    data.forEach((el) => {
        let Div = document.createElement("div");
        Div.setAttribute("class", "Card");
        Div.onclick = () => {
            SaveVideo(el);
        }
        let PosterURL = document.createElement("img");
        PosterURL.src = el.snippet.thumbnails.medium.url;
        let h2 = document.createElement("h2");
        h2.innerText = el.snippet.channelTitle;
        let h3 = document.createElement("h3");
        h3.innerText = el.snippet.title;
        Div.append(PosterURL, h2, h3);
        Container.append(Div);
    });
}

let SaveVideo = (Data) => {
    localStorage.setItem("video", JSON.stringify(Data));
    window.location.href = "play.html";
}

let Sort = async () => {
    let data = await getData(query);
    //console.log(data);
    data.items = data.items.sort((a, b) => {
        return a.snippet.channelTitle - b.snippet.channelTitle;
    })
    append(data.items);
}

let filter = async () => {
    let data = await getData(q);
    console.log(data);
    data = data.filter((el) => {
        return el.snippet.channelId === "UCvC4D8onUfXzvjTOM-dBfEA";
    });
    append(data);
};



