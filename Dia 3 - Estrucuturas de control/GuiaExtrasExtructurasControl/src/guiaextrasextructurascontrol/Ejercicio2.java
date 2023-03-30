/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaextrasextructurascontrol;

/**
 *
 * @author horac
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a=1,b=2,c=3,d=4, aux=0;
        System.out.println("A" + a);
        System.out.println("B" + b);
        System.out.println("C" + c);
        System.out.println("D" + d);
        System.out.println("intercambio");
        
        aux = a;
        
        a=d;
        d=b;
        b=c;
        c=aux;
        System.out.println("A" + a);
        System.out.println("B" + b);
        System.out.println("C" + c);
        System.out.println("D" + d);
    }
    
}
