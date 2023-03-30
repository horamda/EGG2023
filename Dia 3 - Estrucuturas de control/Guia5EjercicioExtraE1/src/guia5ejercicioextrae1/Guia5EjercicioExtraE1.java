/*
 *Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
con los valores ingresados por el usuario
 */
package guia5ejercicioextrae1;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Guia5EjercicioExtraE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0, s=0;

        Scanner leer = new Scanner(System.in);
        System.out.println("ingresar el valor de n: ");
        n=leer.nextInt();
        int[][] matriz = new int[n][n];
        cargarMatriz(matriz, leer);
        mostrarMatriz(matriz);
        System.out.println("La suma de matriz es  : "+ (s=sumar(matriz)));
       }
    static void cargarMatriz(int matriz[][], Scanner entrada) {
       
        for (int i = 0; i < matriz.length; i++) {
            int n=0;
            for (int j = 0; j < matriz.length; j++) {
                    System.out.println("Ingrese un numero : ");
                    n = leerDato(entrada);
                    matriz[i][j] = n;
              }
        }
    }
    static void mostrarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    public static int leerDato(Scanner entrada) {
        int num = entrada.nextInt();
        return num;
    }
    
    public static int sumar(int matriz[][]) {
        int suma=0;
       for (int i = 0; i < matriz.length; i++) {
            for (int j=0; j< matriz.length; j++){
                suma=suma+matriz[i][j];           
                }
            }
        return suma;
    }     
}

