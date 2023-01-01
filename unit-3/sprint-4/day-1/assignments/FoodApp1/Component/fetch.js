let getData = async function (url) {
    //console.log(url)
    let res = await fetch(url);
    //console.log(res)
    let data = await res.json();
    //console.log(data)
    return data.meals;
}
let append = function (data, Container,Container1) {
    if (!data) {
        return;
    } //let Display= document.getElementById("container");
    data.forEach(({ strMealThumb, strMeal, strArea, strCategory, idMeal }) => {
        let Div = document.createElement("div");
        Div.addEventListener("click", async () => {
            let URL = `https://www.themealdb.com/api/json/v1/1/lookup.php?i=${idMeal}`
            //console.log(getData(URL));
            // let res = await fetch(URL);
            let data = await getData(URL);
           // console.log(data)
            Container.innerHTML = null;           //append(data, Container);//Container=document.getElementsById("Container"); //console.log(Container1)
            append1(data, Container1)// Fun(idMeal, Container)
        })
        let img = document.createElement("img");
        img.src = strMealThumb;
        // let meal= document.createElement("h3");
        // meal.innerText=`Local Name : ${strMeal}`;
        let Name = document.createElement("h3");
        Name.innerText = `Meal : ${strMeal}`
        let FoodType = document.createElement("h4");
        FoodType.innerText = `Type : ${strArea}`;
        let Category = document.createElement("h4");
        Category.innerText = `Category : ${strCategory}`;
        Div.append(img, Name, FoodType, Category);
        Container.append(Div);
        //console.log(Div);
    });
}
let append1 = (data, Container) => {
    data.forEach(({ strMealThumb, strMeal, strArea, strCategory, strIngredient1, strIngredient2, strIngredient3, strIngredient4, strIngredient5, strIngredient6, strIngredient7, strIngredient8, strIngredient9, strIngredient10, strIngredient11, strIngredient12, strInstructions, strMeasure1, strMeasure2, strMeasure3, strMeasure4, strMeasure5, strMeasure6, strMeasure7, strMeasure8, strMeasure9 }) => {
        let Div = document.createElement("div");
        let img = document.createElement("img");
        img.src = strMealThumb;
        // let meal= document.createElement("h2");
        // meal.innerText=`Local Name : ${strMeal}`;
        let Name = document.createElement("h3");
        Name.innerText = `Meal : ${strMeal}`
        let FoodType = document.createElement("h4");
        FoodType.innerText = `Type : ${strArea}`;
        let Category = document.createElement("h4");
        Category.innerText = `Category : ${strCategory}`;
        Div.append(img, Name, FoodType, Category);

        let Recipe = document.createElement("div");
        let Ingredient = document.createElement("h2");
        Ingredient.innerText = `Ingredient : ${strIngredient1} ${strMeasure1}`;
        let Ingredient1 = document.createElement("h2");
        Ingredient1.innerText = `Ingredient : ${strIngredient2} ${strMeasure2}`;
        let Ingredient2 = document.createElement("h2");
        Ingredient2.innerText = `Ingredient : ${strIngredient3} ${strMeasure3}`;
        let Ingredient3 = document.createElement("h2");
        Ingredient3.innerText = `Ingredient : ${strIngredient4} ${strMeasure4}`;
        let Ingredient4 = document.createElement("h2");
        Ingredient4.innerText = `Ingredient : ${strIngredient5} ${strMeasure5}`;
        let Ingredient5 = document.createElement("h2");
        Ingredient5.innerText = `Ingredient : ${strIngredient6} ${strMeasure6}`;
        let Ingredient6 = document.createElement("h2");
        Ingredient6.innerText = `Ingredient : ${strIngredient7} ${strMeasure7}`;
        let Ingredient7 = document.createElement("h2");
        Ingredient7.innerText = `Ingredient : ${strIngredient8} ${strMeasure8}`;
        let Ingredient8 = document.createElement("h2");
        Ingredient8.innerText = `Ingredient : ${strIngredient9} ${strMeasure9}`;
        let Ingredient9 = document.createElement("h2");
        Ingredient9.innerText = `Ingredient : ${strIngredient10}`;
        let Ingredient10 = document.createElement("h2");
        Ingredient10.innerText = `Ingredient : ${strIngredient11}`;
        let Ingredient11 = document.createElement("h2");
        Ingredient11.innerText = `Ingredient : ${strIngredient12}`;
        let Instruction = document.createElement("p");
        Instruction.innerText = `Instructions : ${strInstructions}`;
        //console.log(Instruction);
        Recipe.append(Ingredient, Ingredient1, Ingredient2, Ingredient3, Ingredient4, Ingredient5, Ingredient6, Ingredient7, Ingredient8, Ingredient9, Ingredient10, Ingredient11, Instruction);
        Container.append(Div, Recipe);
    });
}
export { getData, append, append1 };