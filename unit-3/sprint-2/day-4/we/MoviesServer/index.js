async function main(){
    let query=document.getElementById("query").value;
    let data= await getData(query);
   append(data.Search);
    // console.log(data.Search)
}

// const url="https://www.omdbapi.com/?s=thor&apikey=dd861ec6"

async function getData(query){
    const url = `https://www.omdbapi.com/?s=${query}&apikey=dd861ec6`;
    let response= await fetch(url);
    let data= await response.json();
    // console.log(data,"keshav");
    // console.log(response,"krishna");
    return data;
}

function append(data) {
    if(!data){
        return;
    }
    document.getElementById("Movies").innerHTML = null;
    let Movies = document.getElementById("Movies");

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
        Movies.append(div);
    });
}


// function debounce(fn, delay) {
//     setTimeout(function () {
//         func();
//     }, delay);
// }
let id;
function debounce(fn, delay) {
    if(id){
       clearTimeout(id);
    }
       id = setTimeout(function () {
        fn();
    }, delay);
}


//Movied Display start

// let total=0;
// function getData()
// { 
//    movieData=[]
//    document.getElementById("cont").innerHTML=""  
//    let name=document.getElementById("search").value
//    let url = `https://www.omdbapi.com/?s=${name}&plot=full&apikey=5a887465`
//    fetch(url).then(function(resolve){
//       return resolve.json()
//    }).then(function(resolve){
//     document.getElementById("message").src=""
//     document.getElementById("warning").innerText=""
//        getDetails(resolve)
//    }).catch(function(reject){
//     document.getElementById("message").src="https://i0.wp.com/balututorials.com/wp-content/uploads/2020/07/Error.gif"
//     document.getElementById("warning").innerText="No Result"
//    })
// }
// function getDetails(resolve)
// {
//     let storeID=[]
//     resolve.Search.forEach(function(el){
//     storeID.push(el.imdbID)
//   })
//   matchData(storeID)
// }
// let movieData=[]
// function matchData(storeID)
// {
//     for(let i=0;i<storeID.length;i++)
//     {
//         let url=`https://www.omdbapi.com/?i=${storeID[i]}&apikey=5a887465`
//         fetch(url).then(function(resolve){
//             return resolve.json()
//         }).then(function(resolve){
//             movieData.push(resolve)
//         })
//     }
//     console.log(movieData)
    
//         setTimeout(function(){
//             display(movieData)
//             total=movieData.length
//             document.getElementById("warning").innerText=`Search Result: ${total}`
//            },2000)
// }
// function display(movieData)
// {
//     document.getElementById("cont").innerHTML="" 
//     movieData.forEach(function(el) {
//     let title = document.createElement("h2")
//     title.innerText=el.Title;
//     let image=document.createElement("img")
//     image.src=el.Poster
//     let year=document.createElement("p")
//     year.innerText=`Release Year: ${el.Year}`
//     let rating=document.createElement("p")
//     rating.innerText=`IMDb Rating: ${el.imdbRating}`
//     let child_div=document.createElement("div")
//     if(el.imdbRating>8.5)
//     {
//         let ratingTag=document.createElement("p")
//         ratingTag.innerText="RECOMMENDED"
//         ratingTag.style.backgroundColor="red"
//         ratingTag.style.color="white"
//         child_div.append(ratingTag)
//     }
//     child_div.append(image,title,year,rating)
//     child_div.addEventListener("click",function(){
//         displayDetails(el)
//     })
//     document.getElementById("cont").append(child_div)
//     }); 
// }
// function displayDetails(el)
// {
//     let div=document.getElementById("details")
//     let img=document.createElement("img")
//     img.src=el.Poster;
//     let img_div=document.createElement("div")
//     img_div.append(img)
//     let actors=document.createElement("p")
//     actors.innerText=`Actors: ${el.Actors}`;
//     let awards=document.createElement("p")
//     awards.innerText=`Awards: ${el.Awards}`;
//     let boxoffice=document.createElement("p")
//     boxoffice.innerText=`Box Office: ${el.BoxOffice}`;
//     let country=document.createElement("p")
//     country.innerText=`Country: ${el.Country}`;
//     let info=document.createElement("div")
//     let btn=document.createElement("button")
//     btn.innerText="Go Back"
//     btn.addEventListener("click",goBack)
//     let plot=document.createElement("p")
//     plot.innerText=`Plot: ${el.Plot}`
//     info.append(plot,actors,awards,boxoffice,country,btn)
//     div.append(img_div,info)
//     let container=document.getElementById("cont")
//     container.setAttribute("class","blurr")
// }
// function goBack()
// {
//     document.querySelector(".blurr").style.opacity=1
//     document.getElementById("details").innerHTML=""
// }
// function Ascending()
// {
//     let filtered = movieData.sort(function(a,b){
//         if(a.Year>b.Year) return 1
//         if(b.Year>a.Year) return -1
//         return 0
//     })
//     display(filtered)
// }
// function Descending()
// {
//     let filtered = movieData.sort(function(a,b){
//         if(a.Year>b.Year) return -1
//         if(b.Year>a.Year) return 1
//         return 0
//     })
//     display(filtered)
// }
// document.getElementById("filter").addEventListener("change",filterMe)
// function filterMe()
// {
//     let value=document.getElementById("filter").value;
//     if(value==="all")
//     {
//         display(movieData)
//         total=movieData.length
//         document.getElementById("warning").innerText=`Search Result: ${total}`
//     }
//     else
//     {
//         let filter=movieData.filter(function(el){
//             return el.Year>=value
//         })
//         if(filter.length==0)
//         {
//             document.getElementById("message").src="https://i0.wp.com/balututorials.com/wp-content/uploads/2020/07/Error.gif"
//             document.getElementById("warning").innerText="No Result"
//         }
//         total=filter.length
//         document.getElementById("warning").innerText=`Search Result: ${total}`
//         display(filter)
//     }
    
// }
