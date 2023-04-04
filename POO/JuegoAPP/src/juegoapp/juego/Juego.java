/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoapp.juego;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Juego {

    private int jugador;
    private int numero;
    private int intentos;
    private int win;
    Scanner leer = new Scanner(System.in);

    public Juego() {

    }

    public Juego(int numero, int intentos) {
        this.numero = numero;
        this.intentos = intentos;
        this.win = 0;
        jugador = jugador + 1;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getWin() {
        return win;
    }

    public int getJugador() {
        return jugador;
    }

    public void iniciar_juego(Juego otro) {

        for (int i = 0; i <= intentos; i++) {
            System.out.println("Ingrese un numero : ");
            otro.numero = leer.nextInt();
            if (otro.numero < this.numero) {
                System.out.println("El numero es menor ");
                otro.intentos++;
            } else if (otro.numero > this.numero) {
                System.out.println("El numero es mayor");
                otro.intentos++;
            } else if (otro.numero == this.numero) {
                System.out.println("win");
                otro.win++;
                otro.intentos++;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Juego{" + "jugador=" + jugador + ", numero=" + numero + ", intentos=" + intentos + ", win=" + win + ", leer=" + leer + '}';
    }
    
    
}
