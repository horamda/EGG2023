/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia4;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Ejercicio4Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int numero = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = leer.nextInt();
        System.out.println("El numero es primo ? " + esPrimo(numero));

    }

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
