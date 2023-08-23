
//variables globales 
const formulario = document.getElementById("formulario");
const listaActividades = document.getElementById("listaActividades");

let arrayActividades = [];

let item = {
  actividad: 'trotar',
  estado: false
}

// funciones 
const crearItem = (actividad) => {
  let item = {
    actividad: actividad,
    estado: false
  }
  arrayActividades.push(item);
  return item;
}

let correr = crearItem("trotar");
console.log(correr);

formulario.addEventListener("submit", (e) => {
  e.preventDefault();
  let actividadUI = document.getElementById("actividad").value;

  crearItem(actividadUI);
  formulario.actividad.value = "";
   arrayActividades.snap 
}


function guardarDB(actividad) { };




function pulsar()
{
  var nombre = document.getElementById("input2").value; 
  console.log(nombre);
  if(nombre == "") {
  alert("El nombre está vacio"); 
}
}