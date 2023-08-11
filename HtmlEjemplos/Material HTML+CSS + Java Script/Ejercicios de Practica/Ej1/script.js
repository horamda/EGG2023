

/*function showAlert() {alert('Hola esta es un alerta desde java script'  );
}
function handleClick(){alert('tocaste el boton2')};
let boton=document.getElementById('boton');
boton.addEventListener('click', handleClick);    
*/
const form=document.getElementById('myForm');

function validateEmail(email){
const regex=/^[^\s@]+@[^\s@]+\.[^\s@]{2,7}$/
return regex.test(email);

}
function validateForm() {
const input=document.getElementById('email');
const inputValue=input.value;

if(!validateEmail(inputValue)){
    alert('Porfavor ingrese correo valido');
} else{
    alert('Correo electronico valido!!!');
}};

form.addEventListener('submit',function(event){
event.preventDefault();
validateForm();
});

window.prompt("ingrese su nombre");
alert("saludos desde java script");

function varPrueba() {
    var x = 31;
    if (true) {
    var x = 71; // Misma variable!
    console.log(x); // Imprime el valor 71
    }
    console.log(x); // Imprime el valor 71
    };
    function letPrueba() {
    let x = 31;
    if (true) {
    let x = 71; // variable diferente
    console.log(x); // Imprime el valor 71
    }
    console.log(x); // Imprime el valor 31
    };
    numero =1;
    alert("el tipo de dato es " + typeof numero)
