/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Guia4Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 0, n2 = 0, opcion = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero : ");
        n1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = leer.nextInt();
        do {
            System.out.println("Menu");
            System.out.println("1 Sumar");
            System.out.println("2 Restar");
            System.out.println("3 Multiplicar");
            System.out.println("4 Dividir");
            System.out.println("5 Salir");
            System.out.println("Elija su opcion");
            opcion = leer.nextInt();
            calculo(opcion, n1, n2);
        } while (opcion != 5);
    }

    public static void calculo(int opcion, int n1, int n2) {
        switch (opcion) {
            case 1:
                System.out.println("La suma es : " + sumar(n1,n2));
                break;
            case 2:
                System.out.println("La resta es : " + restar(n1,n2));
                break;
            case 3:
                System.out.println("La multiplicacion es : " + multiplicar(n1,n2));
                break;
            case 4:
                System.out.println("La division es : " +dividir(n1,n2));
                break;
            case 5:
                System.out.println("Salimos del programa");
                break;
        }
    }

    public static int sumar(int n1, int n2) {
        return n1 + n2;
    }

    public static int restar(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    public static float dividir(int n1, int n2) {
        return n1 / n2;
    }

}
