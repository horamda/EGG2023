/*
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
* Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
* en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java
 */
package ejerciciosestructuradecontrolej3;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class EjerciciosEstructuraDeControlEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase="";
    Scanner leer=new Scanner (System.in);
    System.out.println("Ingrese una frase : ");
    frase=leer.next();
    if (frase.length()==8) {
    System.out.println("Correcto");
    } else {
    System.out.println("Incorrecto");
    }
    }
    }
    

