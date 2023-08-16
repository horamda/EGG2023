let letras=["a","b","c","d","e","f",];

let persona={
    nombre: "Agustin",
    apellido:"Fiorde",
    dni:33232,
    mascota:"Chiquito"
};

function coolName(name="dato por defecto") {
    name= `--**${name}**--`;
    console.log(name);  
}
coolName();
console.log(coolName("pepe"));
coolName("pepito");

let imprimirNombre= function(name){
   return  name= `--//${name}//--`;
} 

console.log(imprimirNombre("pedro"));


let coolLastName= ()=>console.log("juancito");

console.log(coolLastName());   

let array="agustin".split("");

console.log(array);

array.forEach((e)=>{console.log("-"+e)});;

const f = (e)=> console.log("---"+e);
array.forEach(f); 

array=array.map((e)=>{console.log("....."+e)});

console.log(array);