/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=0, num2=0, resultado = 0;
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el Primer numero");
        num1=leer.nextInt();
        System.out.println("Ingrese el Segundo numero");
        num2=leer.nextInt();
        resultado=num1+num2;
        System.out.println("El resultado es : " + resultado);
        
    }
    
}
