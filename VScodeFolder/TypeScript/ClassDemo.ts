class Raagul{
    firstName:String;
    lastName:string;
    constructor(firstName:string,lastName:string){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    getfullName():String{
        return `${this.firstName+this.lastName}`;
    }
}

// name = new Raagul('raagul','sam');