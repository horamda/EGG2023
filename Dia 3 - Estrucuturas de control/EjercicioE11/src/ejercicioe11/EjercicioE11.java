/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioe11;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class EjercicioE11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int num1=0,cont =0;    
        Scanner leer = new Scanner(System.in);
            System.out.println(" Ingrese un   numero : ");
            num1=leer.nextInt();
            
            while (num1>10){
            num1=num1/10;
                System.out.println(num1);
            if (num1>=1){
            cont=cont+1;
            }
            }
        System.out.println("numero " + num1);
        System.out.println("cantidad de digitos es : " + (cont+1));
    }
    
}
