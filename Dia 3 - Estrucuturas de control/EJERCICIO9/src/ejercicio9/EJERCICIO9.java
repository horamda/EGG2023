/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class EJERCICIO9 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        int num, cont =0,sum=0 ;
        Scanner leer;
        leer = new Scanner(System.in);
        do{     
            System.out.println("Ingrese una numero");
            num= leer.nextInt();
            if (num==0){
              System.out.println("Se capturo el numero cero");
              break;
            } else if (num >=0){
              sum=num+sum;
            }
              cont=cont+1 ;
        } while (cont <20);
     System.out.println("La suma es : "+  sum);
    }
        
}
    
