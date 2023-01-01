// Ude Import export (MANDATORY)
// Onclicking store the news in local storage with key "news" so that you can access that on news.html page
import navbar from "../components/navbar.js";
document.getElementById("navbar").innerHTML = navbar();
import { getData, append} from "../components/fetch.js";



let Result=document.getElementById("results");
let Query=JSON.parse(localStorage.getItem("query"));
//console.log(Query);
let count=0;
document.getElementById("search_input").addEventListener("keypress", (el) => {
    if (el.key === "Enter") {
        event.preventDefault();
        count=1;
        search();
    }
});;

let search = async () => {
    let query = document.getElementById("search_input").value;
    let url;
    if(count===0){
       url=`https://masai-api.herokuapp.com/news?q=${Query[Query.length-1]}`
    }
    else{
        url=`https://masai-api.herokuapp.com/news?q=${query}`;
    }
    let data= await getData(url);
    Result.innerHTML=null;
    append(data,Result);
}
search();


function news(){
    console.log("news");
}