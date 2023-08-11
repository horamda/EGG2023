var numeros=[1,2,3,4,5,6,7,8];
console.log(numeros);

var personas =[
{
    nombre:"pepe",
    apellido:"jose"
},
{
    nombre:"Juan",
    apellido:"Peroror"
},
{
    nombre:"ZZZZZ",
    apellido:"ssss"
}
]
console.log(JSON.stringify(personas[2]));

var longitud = personas.length;
console.log(longitud);

personas.reverse();

console.log(personas);

personas.forEach( (e)=>console.log(e.apellido));

personas.forEach( (e)=>console.log(e));

personas.forEach( (e)=>console.log(e.apellido));

personas.forEach((e)=>console.log("Nombre : " + e.nombre));

numeros.filter((e)=> e%2 ==0 )

console.log(numeros);

numeros.map((e)=>e*30);