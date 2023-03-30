/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3guia4;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Ejercicio3Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float dinero = 0;
        String moneda = "";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero :");
        dinero = leer.nextFloat();
        System.out.println("Ingrese la Moneda a la que desea convertir : ");
        System.out.println(" L - libras");
        System.out.println(" D - dolares");
        System.out.println(" Y - yenes");
        moneda = leer.next().toUpperCase();
        convertir(dinero, moneda);
    }

    public static void convertir(float d, String m) {

        if (m.equals("L")) {
            System.out.println("La cantidad de libras es : " + (d * 0.86));
        } else if (m.equals("D")) {
            System.out.println("La cantidad de dolares es : " + (d * 1.28611));
        } else if (m.equals("Y")) {
            System.out.println("La cantidad de Yenes es : " + (d * 129.852));
        }
    }
}
