// const url = "https://reqres.in/api/users?page=2"

// fetch(url).then(function (response) {
//     let Data = response.json(); // collection()
//     return Data;
// }).then(function (Data) {
//     console.log(Data);
//     append(Data.data);
// }).catch(function (err) {
//     console.log(err);
// });


//  //Server send you data in form of samll chunks or packets.

//  function append(data) {

//     data.forEach(function (item) {
//         let img= document.createElement("img");
//         img.src=item.avatar;
//         let p= document.createElement("p");
//         p.innerText=`${item.first_name} ${item.last_name}`;

//         let div= document.createElement("div");
//         div.append(img,p);
//         contaniner.append(div);
//     });
//  }



const URL = "https://fakestoreapi.com/products";

async function getData() {
    try {
        let Response = await fetch(URL);
        let Data = await Response.json();
        // console.log(Data);
        append(Data)
    } catch (error) {
        console.log(error);
    }
}


function append(data) {
    let contaniner = document.getElementById("contaniner");

    data.sort(function (a, b) {
        return a.price - b.price;
    });


    data= data.filter(function (ele){
        return ele.category==="jewelery";
    });
    console.log("keshav");


    data.forEach(function (item) {
        let img = document.createElement("img");
        img.src = item.image;
        let p = document.createElement("p");
        p.innerText = item.title;
        let Price = document.createElement("p");
        Price.innerText = item.price;

        let div = document.createElement("div");
        div.append(img, p, Price);
        contaniner.append(div);
    });
}



// function hello(){
//     return new Promise(function(resolve, rejected){
//         setTimeout(function(){
//             resolve("Hello");
//         },5000);
//     });
// }

// async function print(){
//     let Response= await hello();
//     console.log(Response);
//     console.log("World");
// }

// print();

getData()