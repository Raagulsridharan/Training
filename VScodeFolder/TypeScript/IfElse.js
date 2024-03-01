var discount = 10;
var itemcount = 20;
// if(itemcount>0 && itemcount<=5){
//     discount=5;
// }
// else if(itemcount>5 && itemcount<=10){
//     discount=10;
// }
// else{
//     discount=20;
// }
discount < itemcount ? discount += 5 : discount += 1;
console.log("you got ".concat(discount, "% discount"));
