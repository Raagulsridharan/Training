let discount:number=10;
let itemcount:number=20;

if(itemcount>0 && itemcount<=5){
    discount=5;
}
else if(itemcount>5 && itemcount<=10){
    discount=10;
}
else{
    discount=20;
}

// let discount:number=10;
// discount<itemcount?discount+=5:discount+=1;

console.log(`you got ${discount}% discount`);