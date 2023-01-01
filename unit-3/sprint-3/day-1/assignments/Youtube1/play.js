let GoBack = () => {
    window.location.href = "index.html";
};


let playVideo = () => {
    let video = JSON.parse(localStorage.getItem("video"));
    console.log(video);
    let id = video.id.videoId;
    console.log(id);
    let play_video = document.getElementById("play_video");
    play_video.src = `https://www.youtube.com/embed/${id}`;
};