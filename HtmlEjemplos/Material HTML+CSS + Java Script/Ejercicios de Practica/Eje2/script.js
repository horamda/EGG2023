var persona={
    apellido:"pepito", 
    name: "Pepe",
    edad:46,
    DNI:25905707,
    tel: "2257956633",
    mascotas: [
        {
            apodo: "chiquito",
            numeroIdentificatorio: 123412,
            nacimiento: new Date("01-02-2016")
        }, {
            apodo: "chiquito",
            numeroIdentificatorio: 123412,
            nacimiento: new Date("01-02-2016")
        }, {
            apodo: "chiquito",
            numeroIdentificatorio: 123412,
            nacimiento: new Date("01-02-2016")
        }
   ]
};

//var mascota= {
//    apodo:"chiquito",
//    numeroIdentificatorio:123412,
//    nacimiento:new Date("01-02-2016")
//};

console.log(persona.mascotas[0].apodo);
console.log(persona.mascota);

class Mascota{
    apodo;
    numeroIdentificatoria;
}

var m=new Mascota();
m.apodo="Pepe";
console.log(m.apodo);

