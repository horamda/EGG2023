/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;
/**
 *
 * @author horac
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
             double cent=0, faren=0;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados");
        cent=leer.nextDouble();
        faren=32+(9*cent/5);
        
        System.out.println("los grados en fahrenheit : " + faren);
    }
    
}
