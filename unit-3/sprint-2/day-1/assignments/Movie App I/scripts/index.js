function AddImage() {
    let img_url = document.getElementById("image_url");
    let images = JSON.parse(localStorage.getItem("images")) || [];
    images.push(img_url.value);
    localStorage.setItem("images", JSON.stringify(images));
    img_url.value = null;
}
let Interval;
let i = 0;
function SlideShow() {
    let images = JSON.parse(localStorage.getItem("images"));
    let Container = document.getElementById("slideshow");

    Interval = setInterval(function () {

        if (i === images.length) {
            i = 0;
        }

        let img = document.createElement("img");
        img.src = images[i];
        Container.innerHTML = null;
        Container.append(img);
        i++;
    }, 1500);
}

function Pause() {
    clearInterval(Interval);
}