var names = ["raagul","ranju",'sethu',"praveen","thina"];
console.log(names);
console.log("Length of the array[names] : "+names.length);
for(i=0; i<names.length;i++)
    console.log(names[i]);

names.push("vishnu");
console.log(names);
console.log(names.toString());

var poppedElement = names.pop();
console.log("Pooped element : "+poppedElement);
console.log(names);

names.shift();
console.log(names);

names.unshift("raa");
console.log(names);

delete names[3];
console.log(names);

names.splice(3,0,"praveen");
console.log(names);