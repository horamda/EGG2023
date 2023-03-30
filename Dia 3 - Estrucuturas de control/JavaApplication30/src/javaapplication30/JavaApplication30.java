/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=0,num2=0, cont =0;    
        Scanner leer = new Scanner(System.in);
            System.out.println(" Ingrese un   numero : ");
            num1=leer.nextInt();
            System.out.println(" Ingrese otro numero : ");
            num2=leer.nextInt();
            while (num1>=num2){
            num1=num1-num2;
            cont++;
            }
        System.out.println("residuo " + num1);
        System.out.println("cociente " + cont);
    }
    
}