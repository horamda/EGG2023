/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia5;

/**
 *
 * @author horac
 */
public class Ejercicio1Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 100;
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = i;
        }
        mostrar(vector);
    }

    public static void mostrar(int[] vector) {
        for (int i = 99; i >= 0; i--) {
            if (i % 10 != 0) {
                System.out.print(vector[i] + " ");
            } else {
                System.out.println(" ");
            }
        }
    }
}
