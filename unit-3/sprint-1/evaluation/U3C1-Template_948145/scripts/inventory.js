let Data = JSON.parse(localStorage.getItem("data")) || [];

DisplayData()

function DisplayData(Data) {
    Data.forEach(function (ele, index) {
        let Div = document.createElement("div");
        let ImagE = document.createElement("img");
        ImagE.src = ele.Image;
        ImagE.setAttribute("id", "product_image");
        let BranD = document.createElement("h4");
        BranD.innerText = ele.Brand;
        BranD.setAttribute("id", "product_brand");
        let NamE = document.createElement("p");
        NamE.innerText = ele.Name;
        NamE.setAttribute("id", "product_name");
        let PricE = document.createElement("p");
        PricE.innerText = ele.Price;
        PricE.setAttribute("id", "product_price");
        let Button = document.createElement("button");
        Button.innerText = "Remove";
        Button.setAttribute("id", "RemovE");
        Button.addEventListener("click", function () {
            Remove(index)
        })
        Div.append(ImagE, BranD, NamE, PricE, Button)
        document.querySelector("#products_data").append(Div);
    });
}

function Remove(index) {
    Data = Data.filter(function (ele, i) {
       return index!=i
    })
    localStorage.setItem("data", JSON.stringify(Data));
    Window.location.reload();
}

