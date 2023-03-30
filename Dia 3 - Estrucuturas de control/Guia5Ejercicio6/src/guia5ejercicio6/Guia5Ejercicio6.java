/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5ejercicio6;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Guia5Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 3, s=0,s1=0;
        boolean f=false;
        int[][] matriz = new int[n][n];
        Scanner entrada = new Scanner(System.in);
        cargarMatriz(matriz, entrada);
        mostrarMatriz(matriz);
        System.out.println("La suma de la diagonal principal es : "+ (s=principal(matriz)));
        System.out.println("La suma de la diagonal segundaria es : "+ (s1=segundaria(matriz)));
        System.out.println("Las suma de las filas es igual :  "+ (f=filas(matriz)));
        System.out.println("Es una matriz magica : " + (s==s1 && f));
    }
    static void cargarMatriz(int matriz[][], Scanner entrada) {
        int num = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                do {
                    System.out.println("Ingrese un numero : ");
                    num = leerDato(entrada);
                    matriz[i][j] = num;
                } while (num <= 0 || num > 9);
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
    public static int principal(int matriz[][]) {
       int suma =0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i==j){
                 suma= matriz[i][j]+suma;
                }
            }
        }
        return suma;
    }
      public static int segundaria(int matriz[][]) {
       int suma =0;
        for (int i = 0; i < matriz.length; i++) {
                 suma= +suma +matriz[i][matriz.length-1-i];   
            }
        return suma;
    }
    public static boolean filas(int matriz[][]) {
       boolean f=false;
       for (int i = 0; i < matriz.length; i++) {
      int suma =0 ;
            for (int j=0; j< matriz.length; j++){
                suma=suma+matriz[i][j];           
                }
            int sumaf=suma;   
            f=suma==sumaf;
            }
        return f;
    }     
}

