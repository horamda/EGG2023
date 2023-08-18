const PI = 3.14159;
const boton = document.getElementById("btn");

btn.addEventListener('click', function(event) {
    event.preventDefault();

    // Obtén el valor del diámetro ingresado por el usuario.
    var diametro = parseFloat(document.getElementById("diametro").value);

    // Calcula el radio utilizando el diámetro.
    var radio = diametro / 2;

    // Calcula la circunferencia utilizando la fórmula C = 2 * π * r.
    var circunferencia = 2 * PI * radio;

    // Muestra la circunferencia calculada en la consola.
    console.log("Circunferencia:", circunferencia);

    var resultado = document.getElementById("resultado");
    resultado.innerText = `Circunferencia: ${circunferencia}`;
});



