function getRandomElement<T>(items: T[]):T{
    let randomInde = Math.floor(Math.random()*items.length);
    return items[randomInde];
}

let numbers = [1,2,3,4,5];
let num = getRandomElement(numbers);
console.log(num);