/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        int n = 0, m = 0, cont =0 ;
       
        float suma=0,prome=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias  : ");
        n = leer.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese la cantida de hijos ");
            m=leer.nextInt();
            for (int j=1;j<=m;j++){
                  System.out.println("Ingrese altura del hijo " + j);
                  prome=leer.nextFloat();
                  suma=prome+suma;
                  cont=cont+1;
            }
            System.out.println("El promedio de altura es : " + (suma/cont));
        }
    }
}
