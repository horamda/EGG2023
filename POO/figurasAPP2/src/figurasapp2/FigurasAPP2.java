/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasapp2;

import figurasapp2.figura.Rectangulo;

/**
 *
 * @author horac
 */
public class FigurasAPP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangulo rectangulo1=new Rectangulo(10,10);
        System.out.println("area ; " + rectangulo1.calcular_area());
        System.out.println(rectangulo1.toString());
    }
    
}
