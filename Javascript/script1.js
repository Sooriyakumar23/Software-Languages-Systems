console.log('Hello World !') // String in white color
console.log(23) // Number in blue color



/* Basics */
console.log(4+5) // Number + Number = Number
console.log("4"+"5") // String + String = String
console.log(4+"5") // String + Number = String
console.log("4"+5) // String + Number = String

console.log("Sooriya" - "kumar") // string - string = NaN(Not a Number)
console.log("Sooriya" - 5) // string - Number = NaN
console.log("4" - "3") // String of Number - String of Number = Number 

console.clear()



/* var, let, const */

// 1. var ;
    // can reinitialize multiple times 
var firstVar = 1;
console.log(firstVar)
var firstVar = 2;
console.log(firstVar)
var firstVar = 3;
console.log(firstVar)

    // can be rewritten
var secondVar = 4;
console.log(secondVar)
secondVar = 5;
console.log(secondVar)
secondVar = 6;
console.log(secondVar)

    // not necessary to assign value when initialize
var thirdVar;
console.log(thirdVar)

    // global scope
{
    var fourthVar = 7;
    console.log(fourthVar)
}
console.log(fourthVar)

    // can call above too but will result undefined and not an error
console.log(fifthVar)
var fifthVar = 8;

console.clear()

// 2. let ; 
    // can not reinitialize multiple times 
let firstLet = 'a';
console.log(firstLet)
// let firstLet = 'b';

    // can be rewritten
let secondLet = 'b';
console.log(secondLet);
secondLet = 'c';
console.log(secondLet);

    // not necessary to assign value when initialize
let thirdLet;
console.log(thirdLet);

    // local scope
{
    let fourthLet = 'd';
    console.log(fourthLet);
}
// console.log(fourthLet);

    // can not call above
// console.log(fifthLet);
let fifthLet = 'e';

console.clear()

// 3. const ;
    // can not reinitialize multiple times 
const firstConst = '!';
console.log(firstConst);
// const firstConst = '@';

    // can not be rewritten
const secondConst = '#';
console.log(secondConst);
// secondConst = '$';

    // necessary to assign value when initialize
// const thirdConst;

    // local scope
{
    const fourthConst = '%';
    console.log(fourthConst);
}
// console.log(fourthConst);

    // can not call above
// console.log(fifthConst);
const fourthConst = '^';