let getData=async(url)=>{
let res= await fetch(url);
let data= await res.json();

data=data.sort((b,a)=>{
return a.price-b.price;
});

data=data.sort((a,b)=>{
    return a.title>b.title ?1:a.title<b.title?-1:0;
    });

return data;
}


let append =(data,cont)=>{

    //let Display= document.getElementById("container");

    data.forEach(({image,title,price})=>{
        //console.log(el);

        let Div= document.createElement("div");
        let img= document.createElement("img");
        img.src = image;
        let Title=document.createElement("h4");
        Title.innerText=title;
        let Price=document.createElement("h4");
        Price.innerText=price;
        Div.append(img,Title,Price);
        cont.append(Div);
        //console.log(Div);
    });   
}


export {getData,append};