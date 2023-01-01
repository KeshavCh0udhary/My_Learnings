// Ude Import export (MANDATORY)
// Onclicking store the news in local storage with key "news" so that you can access that on news.html page

import { getData, append} from "../components/fetch.js";

import navbar from "../components/navbar.js";
document.getElementById("navbar").innerHTML = navbar();

let Result=document.getElementById("results");


document.getElementById("in").addEventListener("click",()=>{
    India();
});
document.getElementById("uk").addEventListener("click",()=>{
    UK();
});
document.getElementById("us").addEventListener("click",()=>{
    USA();
});
document.getElementById("nz").addEventListener("click",()=>{
    NZ();
});
let India= async ()=>{
    const url=`https://masai-api.herokuapp.com/news/top-headlines?country=in`

    let data= await getData(url);

    Result.innerHTML=null;
    append(data,Result);
    console.log(data);
}

document.getElementById("ch").addEventListener("click",()=>{
    china();
});

let china= async()=>{
    const url=`https://masai-api.herokuapp.com/news/top-headlines?country=ch`

    let data= await getData(url);
    Result.innerHTML=null;
    append(data,Result);
    // console.log(data);
    // console.log(data);
}

let USA=async()=>{
    const url=`https://masai-api.herokuapp.com/news/top-headlines?country=us`
    let data= await getData(url);
    // console.log(data);
    Result.innerHTML=null;
    append(data,Result);
    // console.log(data);
}
let UK=async()=>{
    const url=`https://masai-api.herokuapp.com/news/top-headlines?country=uk`
    let data= await getData(url);
    // console.log(data);
    Result.innerHTML=null;
    append(data,Result);
    // console.log(data);
}
let NZ=async()=>{
    const url=`https://masai-api.herokuapp.com/news/top-headlines?country=nz`
    let data= await getData(url);
    Result.innerHTML=null;
    append(data,Result);
}

document.getElementById("search_input").addEventListener("keypress", (el) => {
    let res=[];
    if (el.key === "Enter") {
        event.preventDefault();
        let query = document.getElementById("search_input").value;
        res.push(query);
        localStorage.setItem("query",JSON.stringify(res));
        window.location.href="search.html"
    }
});

