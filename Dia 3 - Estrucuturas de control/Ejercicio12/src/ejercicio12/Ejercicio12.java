/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String contador = "";

        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (Integer.toString(i).equals("3")) 
                    {
                           contador = "E" + "-" + Integer.toString(j) + "-" + Integer.toString(k);
                    } else if (Integer.toString(j).equals("3")) 
                    {
                          contador = Integer.toString(i) + "-" + "E" + "-" + Integer.toString(k);
                    } else if (Integer.toString(k).equals("3"))
                    {
                          contador = Integer.toString(i) + "-" + Integer.toString(j) + "-" + "E";
                    
                         
                         //  contador = Integer.toString(i) + "-" + Integer.toString(j) + "-" + Integer.toString(k);
                    }
                    System.out.println(contador);
                }
            }
        }
    }
    }