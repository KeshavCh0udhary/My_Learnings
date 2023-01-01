async function getData(){
    const url =`https://grocery-masai.herokuapp.com/items`
    let res= await fetch(url);
    let data= await res.json();
    appened(data.data);
}
getData()


function appened(data){
    if(!data){
        return ;
    }
    console.log(data)
    let Details=document.getElementById("groceries");
    data.forEach(function(item){
        let Div=document.createElement("div");
        Div.setAttribute("class","item");
        let  Image= document.createElement("img");
        Image.src=item.image
        let Name=document.createElement("p");
        Name.innerText=`Name: ${item.name}`;
        let Price=document.createElement("p");
        Price.innerText=`Price: ${item.price}`;
        let Button=document.createElement("button");
        Button.setAttribute("class","add_to_cart");
        Button.innerText="Add to Cart";
        Button.addEventListener("click",function(){
            add_to_cart(item)
        });
        Div.append(Image,Name,Price,Button);
        Details.append(Div);
    });
}

let CartItem=JSON.parse(localStorage.getItem("cart_items"))||[];

let Wallet=document.getElementById('wallet');
Wallet.innerText=`${700}`
let MaxPrice=Wallet.innerText=`${700}`
function add_to_cart(item){
    
     MaxPrice=`${Wallet.innerText-item.price}`
    console.log(MaxPrice);
    if(MaxPrice<0){
        alert("Insufficient balance");
        return;
    }
    Wallet.innerText=`${Wallet.innerText-item.price}`;
    
    CartItem.push(item);
    localStorage.setItem("cart_items", JSON.stringify(CartItem));
    console.log("keshav",CartItem)
}


