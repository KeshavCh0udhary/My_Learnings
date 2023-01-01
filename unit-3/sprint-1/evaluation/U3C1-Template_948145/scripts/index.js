//store the products array in localstorage as "data"
document.querySelector("form").addEventListener("submit",ProductDetails);
let Data=JSON.parse(localStorage.getItem('data'))||[];

function ProductDetails(event){
    event.preventDefault();
    let Brand=document.getElementById("product_brand").value;
    let Name=document.getElementById("product_name").value;
    let Price=document.getElementById("product_price").value;
    let Image=document.getElementById("product_image").value;
    let Details=new productDetail(Brand,Name,Price,Image);
    Data.push(Details);
    localStorage.setItem("data", JSON.stringify(Data));
}

function productDetail(Brand,Name,Price,Image) {
    this.Brand=Brand;
    this.Name=Name;
    this.Price=Price;
    this.Image=Image;
}
