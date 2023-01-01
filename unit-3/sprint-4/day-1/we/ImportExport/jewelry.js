import navbar from "./components/navbar.js"

document.getElementById("navbar").innerHTML=navbar();

import {getData,append} from "./components/fetch.js";

//https://fakestoreapi.com/products/category/electronics

const url=`https://fakestoreapi.com/products/category/jewelery`

let container=document.getElementById("container");

getData(url).then((res)=>{
    append(res,container);
});



