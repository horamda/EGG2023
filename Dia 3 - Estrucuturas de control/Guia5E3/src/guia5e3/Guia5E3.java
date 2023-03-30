/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5e3;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Guia5E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0, buscar = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de vector : ");
        n = leer.nextInt();
        int[] vector = new int[n];
        cargar(vector);
        System.out.println("Ingrese el numero a buscar : ");
        // buscar = leer.nextInt();
        digitos(vector);
        mostrar(vector);
    }

    static void cargar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100000);
        }
    }

    static void mostrar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }

    static void digitos(int[] vector) {
        int cantidadDigitos = 0;
        int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0;
        for (int i = 0; i < vector.length; i++) {
            cantidadDigitos = (int) Math.floor(Math.log10(vector[i]) + 1);
            if (cantidadDigitos == 1) {
                d1++;
            } else if (cantidadDigitos == 2) {
                d2++;
            } else if (cantidadDigitos == 3) {
                d3++;
            } else if (cantidadDigitos == 4) {
                d4++;
            } else if (cantidadDigitos == 5) {
                d5++;
            }
        }

        System.out.println("cantidad d1 " + d1);
        System.out.println("cantidad d2 " + d2);
        System.out.println("cantidad d3 " + d3);
        System.out.println("cantidad d4 " + d4);
        System.out.println("cantidad d5 " + d5);
    }
}
