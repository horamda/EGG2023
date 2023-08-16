const ul = document.getElementById("lista");
const boton = document.getElementById("btn");

async function getAllCharacters() {
    let response = await fetch("https://rickandmortyapi.com/api/character");
    let { results } = await response.json();
    return results;
}

function agregar(nombre, imagenUrl) {
    let li = document.createElement("li");
    li.innerHTML = `<img src="${imagenUrl}" alt="${nombre}"> ${nombre}`
    divi=document.getElementById("tarjeta");
    tarjeta.innerHTML = `<img src="${imagenUrl}"`
   
    ul.append(li);
}



boton.onclick = async function () {
    try {
        let results = await getAllCharacters(); // Espera a que la promesa se resuelva
        results.forEach(e => {
            agregar(e.image);
        });
    } catch (error) {
        console.error("Error al obtener los personajes:", error);
    }
}