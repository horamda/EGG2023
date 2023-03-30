/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12g4;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Ejercicio12G4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=0,num2=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num1=leer.nextInt();
        System.out.println("Ingrese el primer numero");
        num2=leer.nextInt();
        esMultiplo(num1,num2);
    }
    
    public static void esMultiplo(int n1,int n2){
        if (n1 % n2 ==0) {
            System.out.println("El numero : " + n1 + " es multiplo de " + n2 );
        } else 
            System.out.println("No son multiplos");
    }
}
