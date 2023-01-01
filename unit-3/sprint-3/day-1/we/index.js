const API_KEY = "AIzaSyAu2xzws7jyt65i1mgfW6hEB8DaqkfOcfs"
// const API_KEY = "AIzaSyAu2xzws7jyt65i1mgfW6hEB8DaqkfOcfs"
//const API_KEY = "AIzaSyD1OnC4VVlcSqc3nD-MUxD3ukAVJbchX8U"
let search = async () => {
    let query = document.getElementById("query").value;
    let data = await getData(query);
    append(data.items);
}

let getData = async (query) => {
    let url = `https://youtube.googleapis.com/youtube/v3/search?part=snippet&maxResults=20&q=${query}&key=${API_KEY}`
    let response = await fetch(url);
    let data = await response.json();
    return data;
}

let append = (data) => {
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
        let h3 = document.createElement("h3");
        h3.innerText = el.snippet.title;
        Div.append(PosterURL, h3);
        Container.append(Div);
    });
}

let SaveVideo = (Data) => {
    localStorage.setItem("video", JSON.stringify(Data));
    window.location.href = "play.html";
}

let Sort = async () => {
    let data = await getData(query);
    console.log(data);
    data.items = data.items.sort((a, b) => {
        return a.snippet.title - b.snippet.title;
    })
    console.log(data.items);
}

let filter = async () => {
    let data = await getData(q);
    console.log(data);
    data = data.filter((el) => {
        return el.snippet.channelId === "UCvC4D8onUfXzvjTOM-dBfEA";
    });
    append(data);
};