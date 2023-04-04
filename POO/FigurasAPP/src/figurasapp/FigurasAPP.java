/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasapp;

import figurasapp.figuras.Circunferencia;

/**
 *
 * @author horac
 */
public class FigurasAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia c1= new Circunferencia();
        c1.crearCircunferencia(10);
        System.out.println(c1.toString());
        c1.sacarPerimetro();
        c1.area();
        System.out.println(c1.toString());
    }
    
}
