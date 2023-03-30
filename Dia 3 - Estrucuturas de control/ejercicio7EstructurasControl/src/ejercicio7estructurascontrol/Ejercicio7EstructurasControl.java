/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7estructurascontrol;


import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Ejercicio7EstructurasControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String rs = "";
        int exito = 0, fracc = 0;
        Scanner leer;
        leer = new Scanner(System.in);
        while (!rs.equals("&&&&&")) {
            rs = leer.next();
            if ("x".equals(rs.substring(0, 1)) && rs.length() == 5 && "o".equals(rs.substring(4, 5))) {
                exito = exito + 1;
            } else {
                fracc = fracc + 1;
            }
        }
        System.out.println("Lecturas correctas :   " + exito );
        System.out.println("Lecturas incorrectas : " + (fracc-1));
    }
}
