/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4ejercicio2;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Guia4Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0, i = 0, edad = 0;
        String opcion = "", nombre = "";

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas : ");
        n = leer.nextInt();
        while (i < n && !opcion.equals("no")) {
            datos();
            System.out.println("desea seguir ingresando : si/no ? ");
            opcion = leer.next();
        }
    }

    public static void datos() {
        int edad = 0;
        String nombre = "";
        boolean mayor=false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona ");
        nombre = leer.next();
        System.out.println("Ingrese el Edad de la persona ");
        edad = leer.nextInt();
        mayor= edad > 18;
        System.out.println("El nombre de la persona es " + nombre + " su edad : " + edad);
        if (mayor) {
            System.out.println("Es mayor de edad"); 
        }  else {
            System.out.println("No es mayor de edad"); 
        }
    }
}
