let letras = ["a", "b", "c", "d", "e", "f",];

let persona = {
    nombre: "Agustin",
    apellido: "Fiorde",
    dni: 33232,
    mascota: "Chiquito"
};

function coolName(name = "dato por defecto") {
    name = `--**${name}**--`;
    console.log(name);
}
coolName();
console.log(coolName("pepe"));
coolName("pepito");

let imprimirNombre = function (name) {
    return name = `--//${name}//--`;
}

console.log(imprimirNombre("pedro"));


let coolLastName = () => console.log("juancito");

console.log(coolLastName());

let array = "agustin".split("");

console.log(array);

array.forEach((e) => { console.log("-" + e) });;

const f = (e) => console.log("---" + e);
array.forEach(f);

array = array.map((e) => { console.log("....." + e) });

console.log(array);
/*
// Ejercicio N°1 
console.log("soleado");
console.log("nublado");
console.log("lloviendo");
const estado = prompt("como esta el dia de hoy : ");
console.log("el dia de hoy esta " + estado);

// Ejercicio N°2
const pi = 3.14;
let radio = prompt("ingrese el valor del rario");
let area = pi * (radio * radio);
console.log("El area es : " + area);
let perimetro = 2 * pi * radio;
console.log("el perimetro es : " + perimetro);

//ejercicio N3

const edad = prompt("ingrese la edad");
if (edad >= 18) {
    console.log("Mayor de Edad");
} else {
    console.log("Menor de Edad");
}

//Ejercicio 4
//Realiza un programa que sólo permita introducir los caracteres ‘S’ y ‘N’. 
//Si el usuario ingresa alguno de esos dos 
//caracteres se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
//en caso contrario, se deberá imprimir “INCORRECTO”.  
/*

do{
    var caracter = prompt("Ingrese una letra S/N : ");
    console.log(" INGRESO : " + caracter);
    if (caracter == "S" || caracter =="N"){
        console.log("Correcto !!! ");
    } else {
        console.log("Incorrecto !!! ")
    }
    
}while (caracter !="S" && caracter !="N");
*/

const texto= document.getElementById("texto");
const palabras= texto.innerText.split(' ');
for (const palabra of palabras){

    if (palabra.length > 8){
      console.log("palabra de mas de 8 caracteres: "+ palabra);
      const span = document.createElement('span');
            span.textContent = palabra;
            span.style.backgroundColor = 'yellow';
            texto.innerHTML = texto.innerHTML.replace(palabra, span.outerHTML);
    }
}
