/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase="";
    Scanner leer=new Scanner(System.in);
    System.out.println("ingrese su nombre");
    frase=leer.nextLine();
    System.out.println("La frase es  : " + frase.toUpperCase());
    }
    
}
