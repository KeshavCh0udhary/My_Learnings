let CartItems = JSON.parse(localStorage.getItem('cart_items')) || [];
let sum = 0;


//console.log(CartTotal, CartItems.length);
function appened(CartItems) {
    if (!CartItems) {
        return;
    }
    console.log(CartItems)
    let Details = document.getElementById("cart");
    CartItems.forEach(function (item, index) {
        let Div = document.createElement("div");
        Div.setAttribute("class", "item");
        let Image = document.createElement("img");
        Image.src = item.image
        let Name = document.createElement("p");
        Name.innerText = `Name: ${item.name}`;
        let Price = document.createElement("p");
        Price.innerText = `Price: ${item.price}`;
        sum = sum + item.price;
        let Button = document.createElement("button");
        Button.setAttribute("class", "remove");
        Button.innerText = "Remove";
        Button.addEventListener("click", function () {
            Remove(item, index)
        });
        Div.append(Image, Name, Price, Button);
        Details.append(Div);
    });
}
appened(CartItems)



function Remove(item, index) {
   
    CartItems = CartItems.filter(function (el, i) {
        return i !== index
    });
   
    CartTotal.innerText = sum;
    sum = sum - item.price
    console.log(CartItems);
    localStorage.setItem("cart_items", JSON.stringify(CartItems));
    window.location.href = "cart.html";
    console.log("keshav", CartItems)
}

let CartTotal = document.getElementById('cart_total');
CartTotal.innerText = sum;

let Checkout = document.getElementById("checkout");

Checkout.addEventListener("click", function () {
    console.log(CartTotal,"keshav")
    if (sum > 0) {
        window.location.href = "checkout.html";
    }
    else {
        alert("Please add an item to the cart for Checkout");
    }
});
