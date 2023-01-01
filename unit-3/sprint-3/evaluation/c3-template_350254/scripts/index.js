document.getElementById("query").addEventListener("keypress", (e) => {
    if (e.keyCode === 13) {
        event.preventDefault();
        search();
    }
});

let search = async () => {
    let query = document.getElementById("query").value;
    if (query === "") {
        window.location.href = "index.html";
    }
    let data = await GetData(query);
    append(data.hotels);
    console.log("keshav", data)
}

let query = "goa"
let GetData = async () => {
    const url = `https://masai-mock-api.herokuapp.com/hotels/search?city=${query}`
    let response = await fetch(url);
    let data = await response.json();
    return (data);
}

//GetData();

let append = (data) => {
    if (!data) {
        return;
    }

    let Container = document.getElementById("hotels_list");
    Container.innerHTML = null;

    data.forEach((el) => {
        let Div = document.createElement("div");
        Div.setAttribute("id", "hotel");

        let img = document.createElement("img");
        img.src = el.Images.one;

        let name = document.createElement("h3");
        name.innerText = el.Title;

        let Price = document.createElement("p");
        Price.innerText = `Price per room : Rs ${el.Price}`;

        let ac = document.createElement("p");
        ac.innerText = `AC : ${el.Ac}`;

        let Rating = document.createElement("p");
        Rating.innerText = `Rating : ${el.Rating}`;

        let button = document.createElement("button");
        button.innerText = "BOOK NOW";

        button.setAttribute("class","book");

        button.addEventListener("click",()=>{
              Checkout(el);
        })

        Div.append(img, name, Price, ac, Rating, button);

        Container.append(Div);

    });

}

let Sort= async ()=>{
    let data=await GetData(query);
    console.log("keshav",data);

    data.hotels=data.hotels.sort((a,b)=>{
        return a.Price -b.Price;
    });
    append(data.hotels);
}

let Sort1= async ()=>{
    let data=await GetData(query);
    //console.log("keshav",data);

    data.hotels=data.hotels.sort((a,b)=>{
        return b.Price -a.Price;
    });
    append(data.hotels);
}


let Ac=async()=>{
    let data=await GetData(query);
    //console.log("keshav-jj")
    data.hotels=data.hotels.filter((el)=>{
        return el.Ac==true;
    });
    append(data.hotels);
}

let NonAc=async()=>{
    let data=await GetData(query);
      //console.log("keshav-jj")
    data.hotels=data.hotels.filter((el)=>{
        return el.Ac==false;
    });
    append(data.hotels);
}


let Checkout=(el)=>{
    window.location.href="checkout.html";
}






