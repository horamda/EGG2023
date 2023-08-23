/*
//local storage
localStorage.setItem("mascota", "chiquito");
let miMascota1=localStorage.getItem("mascota");
localStorage.removeItem("mascota");
localStorage.length;
localStorage.clear();

//Session Storage

sessionStorage.setItem("mascota", "filomena");
let miMascota2= sessionStorage.getItem("mascota");
sessionStorage.removeItem("mascota");
sessionStorage.length;
sessionStorage.clear();

// Cookies

document.cookie = "mascota=Malva";
let cookie$=document.cookie;
document.cookie = cookie$;
*/
console.log("entre");
save_localStorage();

function obtener_localStorage() {
    if (localStorage.getItem("persona")) {
        let nombre = localStorage.getItem("nombre");
        let persona = localStorage.getItem("persona");
        console.log("Nombre : " + nombre);
        console.log("Objeto persona" + persona);
    } else {
        console.log("No hay entredas en el local storage");
    }
}

obtener_localStorage();
function save_localStorage() {
    let persona = {
        nombre: "Horacio",
        edad: 31,
        correo: "ora@mda.com.ar",
        coords: {
            lat: 10,
            lng: -10,
        }
    };

    let nombre = "juan";
    localStorage.setItem("nombre", nombre);
    localStorage.setItem("persona", JSON.stringify(persona));
}
