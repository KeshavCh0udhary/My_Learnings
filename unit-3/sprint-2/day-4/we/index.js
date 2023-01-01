function GetDAta() {
    let city = document.getElementById("query").value;
     
    let url = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=b2cb8b79a000c20734fe107551e0be53`
    fetch(url).then(function (response) {
        return response.json();
    }).then(function (response) {
        append(response);-
        getSevenDaysWeather();
    });
}

function append(data) {
    let url = `https://maps.google.com/maps?q=${data.name}&t=&z=13&ie=UTF8&iwloc=&output=embed`
   
    // console.log(url);
    // console.log(data);
    let Container = document.getElementById("Container");
    Container.innerHTML = null;
    let h2 = document.createElement("h2");
    h2.innerText = data.name;

    let temp = document.createElement("p");
    temp.innerText = `Temp : ${data.main.temp}`;

    let min_temp = document.createElement("h5");
    min_temp.innerText = `Min Temp : ${data.main.temp_min}`;

    let max_temp = document.createElement("h4");
    max_temp.innerText = `Max Temp : ${data.main.temp_max}`;
    Container.append(h2, temp, min_temp, max_temp);
    let Iframe = document.getElementById("gmap_canvas");
    Iframe.src = url;
}

function getLocation() {
    navigator.geolocation.getCurrentPosition(success);

    function success(pos) {
        const crd = pos.coords;
        console.log("Your current position is:");
        console.log(`Latitude : ${crd.latitude}`);
        console.log(`Longitude: ${crd.longitude}`);
        console.log(`More or less ${crd.accuracy} meters.`);
        getWeatherOnLocation(crd.latitude, crd.longitude);
    }
}



function getWeatherOnLocation(lat, lon) {
    let URL = `https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=b2cb8b79a000c20734fe107551e0be53`;

    fetch(URL)
        .then(function (res) {
            return res.json();
        })
        .then(function (res) {
            console.log(res);
            append(res);
            getSevenDaysWeather()
        })
        .catch(function (err) {
            console.log(err);
        });
}

function getSevenDaysWeather(){
    let city = document.getElementById("query").value;
    console.log(city,"keshav");
    let UrL=`https://api.openweathermap.org/data/2.5/forecast?q=${city}&cnt=7&appid=5c6004fc3786d57b9d23c346916d72e5&units=metric`;
    
    fetch(UrL)
    .then(function (res) {
        return res.json();
    })
    .then(function (res) {
        console.log(res,"keshav");
        // append(res);
    })
    .catch(function (err) {
        console.log(err,"KKKK");
    });
}



// let url = `https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=5881c474bc5289105d70aa1b5`;
