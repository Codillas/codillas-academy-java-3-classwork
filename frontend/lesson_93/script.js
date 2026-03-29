"use strict";

// let name = prompt("What's your name?");
//
// while (name === null || name === "") {
//     console.log("Name:", name);
//     name = prompt("What's your name?");
// }
//
// console.log("Name:", name);


let isHappy = confirm("Are you happy?");

while (!isHappy) {
    console.log("isHappy:", isHappy);
    isHappy = confirm("Are you happy?");
}

console.log("isHappy:", isHappy);

const randomNumber = Math.floor(Math.random() * 10);

console.log("randomNumber:", randomNumber);


// alert(name);
