/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11guia4;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Ejercicio11Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase = "";
        String letra = "";
        Scanner leer = new Scanner(System.in);

        while (!letra.equals(".")) {
            System.out.println("Ingrese la frase letra por letra con . corta");
            letra = leer.next();
            if (letra.equals(" ")) {
                frase += " ";
            } else {
                frase +=letra;  
            }
        }

        System.out.println("Frase original " + frase);
        frase = invertir(frase);
        System.out.println("Frase cambiada " + frase);
    }

    public static String invertir(String frase) {
        int i = 0;
        String newfrase = "";
        while (i < frase.length()) {
            char caracter = frase.charAt(i);
            if (caracter == 'a') {
                newfrase += '@';
            } else if (caracter == 'e') {
                newfrase += '#';
            } else if (caracter == 'i') {
                newfrase += '$';
            } else if (caracter == 'o') {
                newfrase += '%';
            } else if (caracter == 'u') {
                newfrase += '*';
            } else {
                newfrase += caracter;
            }
            i++;
        }
        return newfrase;
    }
}
