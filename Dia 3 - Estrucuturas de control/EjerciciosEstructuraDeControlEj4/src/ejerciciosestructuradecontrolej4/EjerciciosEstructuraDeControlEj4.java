/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’.
*Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
*en caso contrario, se deberá imprimir “INCORRECTO”.
*Nota: investigar la función Substring y equals() de Java.
*String s = "Manual Web"</pre>
*s.substring(7); // Nos devuelve "Web". 
*/
package ejerciciosestructuradecontrolej4;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class EjerciciosEstructuraDeControlEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase : ");
        frase = leer.next();
        frase=frase.toUpperCase();
        frase=frase.substring(0,1);
         System.out.println(frase);
        if (frase.substring(0,1).equals("A")) {  
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
