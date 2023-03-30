/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        float altura=0, suma1=0, suma2=0;
        int cont = 0, cont2 = 0, n = 0;

        System.out.println("Ingrese la cantida de personas ");
        n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la altura de la persona " + (i + 1));
            altura = leer.nextFloat();
            
            System.out.println("altura  " + altura );
            if (altura <= 1.6) {
                suma1 = suma1 + altura;
                cont = cont+1;
            } else {
                suma2 = suma2 + altura;
                cont2 = cont2+1;
            }
        }
        System.out.println("El promedio de las personas < 1.60 es : " + (suma1 / cont));
        System.out.println("El promedio de las personas < 1.60 es : " + (suma2 / cont2));
    }
}

    
    

