function myFunction(){
    alert('Hello from external JS file...');
    console.log(document.querySelector(".btn").innerHTML)
    console.log(document.querySelector("#test").parentElement)
}

var x=19;
console.log(typeof(x)=='number');