/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author horac
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
             int num1=0;
             double num2=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num1=leer.nextInt();
        System.out.println("El doble del numero es : " + num1*2 );
        System.out.println("El triple del numero es : " + num1*3 );
        num2=Math.sqrt(num1);
        System.out.println("La raiz cuadrada del numero es : " + num2 );
      
        
    }
    
}
