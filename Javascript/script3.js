/* Arithmetic operators */
var num1 = 2;
var num2 = 3;

//      +
var num3 = num1 + num2;
console.log(num3);

//      -
var num4 = num1 - num2;
console.log(num4);

//      *
var num5 = num1 * num2;
console.log(num5);

//      /
var num6 = num1 / num2;
console.log(num6);

//      **
var num7 = num1 ** num2;
console.log(num7);

//      %
var num8 = num1 % num2;
console.log(num8);

//      ++
var num9 = num1++;
console.log(num9);

//      --
var num10 = num2--;
console.log(num10);

//      +=       
num1 += num2;
console.log(num1);

//      -=      
num1 -= num2;
console.log(num1);

//      *=      
num1 -= num2;
console.log(num1);

//      /=
num1 -= num2;
console.log(num1);



/* Assignment */
var num;
num = num1;
num = num2;
console.log(num);

/* Swapping */
var a = 10;
var b = 20;
var c;

console.log(a);
console.log(b);

c = a;
a = b;
b = c;

console.log(a);
console.log(b);



/* Comparison operators */

//      == 
var num11 = 100;
var num12 = "100";

console.log(num11 == num12);

//      !=
var num13 = 200;
var num14 = 300;

console.log(num13 != num14);

//      ===
console.log(num11 === num12);

//      !==
console.log(num11 !== num12);

//      >
console.log(num13 > num14);

//      <
console.log(num13 < num14);

//      >=
console.log(num13 >= num14);

//      <=
console.log(num13 <= num14);



/* Logical operators */

// &&
var log1 = true && true && true && true;
console.log(log1);

var log2 = true && true && true && false;
console.log(log2);


// ||
var log3 = false || false || false || false;
console.log(log1);

var log4 = true || false || false || false;
console.log(log2);


// !
var log5 = !true;
console.log(log5);

var log6 = !false;
console.log(log6);