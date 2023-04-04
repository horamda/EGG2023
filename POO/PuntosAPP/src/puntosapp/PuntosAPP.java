/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntosapp;

import puntosapp.punto.Punto;

/**
 *
 * @author horac
 */
public class PuntosAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Punto p1=new Punto(10,5);
    Punto p2=new Punto (15,25);
    
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println("La distancia del punto 1 al punto 2 es de : "+ p1.calcular(p2));
    }
    
}
