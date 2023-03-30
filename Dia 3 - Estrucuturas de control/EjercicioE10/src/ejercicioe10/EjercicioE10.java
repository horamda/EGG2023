/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioe10;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class EjercicioE10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int num1 = 0, num2 = 0, cont = 0;
        String respuesta = "";
        Scanner leer = new Scanner(System.in);

        int upperBound = 0;
        int lowerBound = 10;

        // upperBound 20 will also be included
        int range = (upperBound - lowerBound) + 1;
        do {
            System.out.println(" Ingrese un   numero : ");
            num1 = leer.nextInt();
            System.out.println(" Ingrese otro numero : ");
            num2 = leer.nextInt();
            int random = (int) (Math.random() * range) + lowerBound;
            if (num1 * num2 == random) {
                
                System.out.println("Exito");
            }else 
                System.out.println("El numero elegido aleatorio es : " + random);    
                System.out.println("Desea continuar s/n");
               respuesta=leer.next();
        } while (respuesta.equalsIgnoreCase("S"));
   

    }
}
