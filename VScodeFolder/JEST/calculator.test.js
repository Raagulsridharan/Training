// const sum = require('./calculator')
// const sub = require('./calculator')
// const mul = require('./calculator')

const {sum,sub,mul} = require('./calculator')

test ('adding',()=>{
    //Arrange
    n1=3;
    n2=2;
    //Act
    var result1 = sum(n1,n2)
    var result2 = sub(n1,n2)
    var result3 = mul(n1,n2)
    //Assert
    expect(result1).toBe(5);
    expect(result2).toBe(1);
    expect(result3).toBe(6);
});