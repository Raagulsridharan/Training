function fun1() {
    var animal1 = "Lion";
    function fun2() {
        var animal2 = "tiger";
        console.log(animal1);
        console.log(animal2);
    }
    fun2();
    console.log(animal2);
}
fun1();