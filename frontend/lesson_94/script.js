"use strict";

let myParagraph = document.querySelector("#myParagraph");


console.log("Class List (1) => ", myParagraph.classList);

myParagraph.classList.add("bg-info");

myParagraph.setAttribute("baton", "zolotiy");

const myParagraphClass = myParagraph.getAttribute("class");

console.log("myParagraphClass => ", myParagraphClass);

const movieStarImg = document.querySelector("#movieStar");

document.querySelector("#toggleButton").addEventListener("click", function () {
    myParagraph.classList.toggle("bg-danger");

    movieStarImg.setAttribute("alt", "Margo Robo");
    movieStarImg.setAttribute("src", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8xDDSa110aYL3WWitWHgEfX7UAfp0-43KM5MsjIKagafujTa9gTUMuNj5RhI8Dqfkoq_STgDIBT558I-PYT89lSa6IHmVKF1KRMw1Yw&s=10");
    movieStarImg.setAttribute("width", "250px");
});

movieStarImg.addEventListener("click", function () {
    movieStarImg.classList.toggle("border");
    movieStarImg.classList.toggle("border-5");
    movieStarImg.classList.toggle("border-primary");
    movieStarImg.classList.toggle("rounded");
});

