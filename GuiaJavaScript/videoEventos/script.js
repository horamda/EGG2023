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

titulos.forEach((e)=>{
e.style.color="red";
})

for (const e of pes){
    e.innerHTML="EGG";
}

input.onkeydown=()=>{
    if(input.value.length>10) input.value="Chiquito";
}