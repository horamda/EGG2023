/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioe8;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class EjercicioE8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int par = 0, num = 1, i = 0 , impar=0;
        
        Scanner leer = new Scanner(System.in);
    
        do {
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            if (num % 2 ==0) {
                par=par+1;}
            else{
                impar=impar+1;
            } 
            
            i = i + 1;
        } while (num % 5 != 0);
        System.out.println("La cantidad  de numeros es : " +(i - 1));
        System.out.println("La cantidad de numeros pares es   : " + par);
        System.out.println("La cantidad de numeros impares es : " + impar);
    }
}