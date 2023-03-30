/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int n = 0, max = 0, minimo = 0, num = 0, i = 0 ;
        float suma=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos : ");
        n = leer.nextInt();
        do {
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            if (num != 0 && num > max) {
                max = num;

            } else {
                minimo = num;
            }
            i = i + 1;
            suma = suma + num;
        } while (i < n);
        System.out.println("El promedio es : " + (suma/i));
        System.out.println("eL MINIMO es : " + minimo);
        System.out.println("el Maximo es : " + max);
    }
}
