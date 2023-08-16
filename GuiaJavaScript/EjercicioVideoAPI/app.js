
const express = require('express');
const app = express();
const port = 3000; // Puerto en el que escuchará el servidor

// Configuración para servir archivos estáticos
app.use(express.static('public')); // Aquí asumimos que los archivos están en la carpeta 'public'

// Ruta para la página principal
app.get('/', (req, res) => {
    res.sendFile(__dirname + '/public/index.html'); // Cambia la ruta si es necesario
});

// Iniciar el servidor
app.listen(port, () => {
    console.log("Entre al servidor!!!");
    console.log(`Servidor escuchando en http://localhost:${port}`);
});