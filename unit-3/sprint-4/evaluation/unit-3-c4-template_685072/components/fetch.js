let getData=async (url)=>{
let res= await fetch(url);
let data=res.json();
return data;
}


let append =(data,Result)=>{
data.articles.forEach(({urlToImage,title,description})=>{
let div=document.createElement("div");
div.setAttribute("class","news");
div.addEventListener("click",async  ()=> {
    window.location.href = "news.html";
});
let img=document.createElement("img");
img.src=urlToImage;
let h3 = document.createElement("h2");
h3.innerText=title;
let p=document.createElement("p");
p.innerText=description;
div.append(img,title,p);
Result.append(div);
})
}


export {getData, append};