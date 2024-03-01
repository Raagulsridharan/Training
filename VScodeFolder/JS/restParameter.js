function func(...input){//rest operator
    let sum = 0;
    for(let i of input){
        sum+=i;
    }
    return sum;
}

console.log(func(2));
console.log(func(2,4));
console.log(func(2,10,56));

var input = [1,2,3,4];
console.log(func(...input));//spread operator