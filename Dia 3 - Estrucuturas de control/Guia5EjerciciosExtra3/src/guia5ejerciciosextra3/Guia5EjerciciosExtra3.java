/*
Crear una función rellene un vector con números aleatorios, 
pasándole un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 */
package guia5ejerciciosextra3;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Guia5EjerciciosExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int n = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de N : ");
        n = leerDato(leer);
        int v1[] = new int[n] ;
        cargarVector(v1);
        mostrarVector(v1);
    }

    static void cargarVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (10 * Math.random());
        }
    }

    static void mostrarVector(int vector[]) {
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" | " + vector[i]);
        }
    }

    public static int leerDato(Scanner entrada) {
        int num = entrada.nextInt();
        return num;
    }

}