/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancionesapp;

import cancionesapp.cacion.Cancion;

/**
 *
 * @author horac
 */
public class CancionesAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Cancion c1=new Cancion("","");
    c1.setAutor("pepe");
    c1.setTitulo("cancion1");
        System.out.println(c1.toString());
    }
    
}
