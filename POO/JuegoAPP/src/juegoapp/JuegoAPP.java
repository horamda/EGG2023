/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoapp;

import java.util.Scanner;
import juegoapp.juego.Juego;

/**
 *
 * @author horac
 */
public class JuegoAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        Juego j1 = new Juego(8,4);
        Juego j2 = new Juego(1,4);
        j1.iniciar_juego(j2);
        System.out.println("Jugador N° " + j2.getJugador()+  " gano : " + j2.getWin() + " Veces");
        j2.iniciar_juego(j1);
        System.out.println("Jug1ador N° " + j1.getJugador() +  " gano : " + j1.getWin() + " Veces");         
        System.out.println(j1.toString());
        System.out.println(j2.toString());
   
    }

}
