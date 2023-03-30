/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5ejerciciosextrae6;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author horac
 */
public class Guia5EjerciciosExtraE6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String palabra = "";
        char[][] sopa = new char[20][20];
        int i = 1;
        inizializar(sopa);
        while (i < 6) {
            do {
                System.out.println("Ingrese las palabra " + i + " de 5");
                palabra = leer.next();
                //System.out.println(palabra.length());
            } while (palabra.length() < 3 || palabra.length() > 5);
           
            cargarMatriz(sopa, palabra);
            i++;
        }
        mostrarMatriz(sopa);
    }

    static void cargarMatriz(char matriz[][], String palabra) {
        int fila = (int) (10 * Math.random());
        System.out.println("fila : " + fila);
        for (int j = 0; j < matriz.length; j++) {
            for (int k = 0; k < palabra.length(); k++) {
                char letra = palabra.charAt(k);
                if (matriz[fila][k] != ' ') {
                    matriz[fila][k] = letra;
                }
            }
        }

    }

    static void mostrarMatriz(char matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(  matriz[i][j] );
            }
            System.out.println("");
        }
    }
    static void inizializar(char matriz[][]) {
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //int letra=(int) (10 * Math.random());
                //System.out.println("letra " + letra);
                matriz[i][j]= (char) (rand.nextInt(10) + '0'); // Genera un dígito aleatorio entre '0' y '9'  ;
            }
      
        }
    }
}
