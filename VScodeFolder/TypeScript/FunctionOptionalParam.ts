function multiple(a:number, b:number, c?:number):number{
    if(typeof c !== 'undefined'){
        return a*b*c;
    }
    return a*b;
}

let result:number = multiple(4,5);
console.log(result);