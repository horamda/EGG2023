/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int num1=0, num2=0 ;
    Scanner leer=new Scanner(System.in);
    System.out.println("Ingrese el primer numero");
    num1 = leer.nextInt();
    System.out.println("Ingrese el segundo numero ");
    num2=leer.nextInt();
    if (num1 > 25 || num2 > 25 ){
        System.out.println("Uno de los numeros es mayor a 25");
    } else {
        System.out.println("Ninguno de los numeros es mayor a 25");
    }
    }
}
