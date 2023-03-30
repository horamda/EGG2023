/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecicio8guiaestructuracontrol;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Ejecicio8GuiaEstructuraControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = leer.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("x");
            for (int j = 0; j < num; j++) {
                       if (i == 0 || i ==num ){
                       System.out.print("*"+j);
            } else
                { System.out.print(" ");}
                
            }            
        }
        System.out.println("");
   }

}
