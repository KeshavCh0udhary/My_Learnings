const find=(data,id)=>{
let item=data.find((el)=>{
return el.id===id;
});
return item;
}

export default find;



