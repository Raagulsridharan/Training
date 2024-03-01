function getRandomElement(items) {
    var randomInde = Math.floor(Math.random() * items.length);
    return items[randomInde];
}
var numbers = [1, 2, 3, 4, 5];
var num = getRandomElement(numbers);
console.log(num);
