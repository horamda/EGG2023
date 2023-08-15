function saludar(){
    console.log("Bienvenido!!!");
}

function retar(tipo) {
    console.log(tipo);
    console.log("Epa! sali de arriba !!!!");
}

function meHicisteClick() {
    console.log("me hiciste Click ");
}

window.onload = saludar;

document.getElementById("123").onmouseover = function(){
    retar("soy un input");
}
document.getElementById("btn").onclick=meHicisteClick;

let titulos = document.getElementsByName("titulo");
let pes= document.getElementsByTagName("p");
let input= document.getElementById("123");
let boton= document.getElementById("btn");

boton.onclick=function(){
titulos.forEach((e)=>{
e.style.color="red";
e.hidden=!e.hidden;
})

for (const e of pes){
    e.innerHTML="EGG";
}

input.onkeydown=function(){
    if(input.value.length>10) 
    input.value="Chiquito";
}
}

const ul=document.getElementById("lista");
const boton = document.getElementById("btn");


