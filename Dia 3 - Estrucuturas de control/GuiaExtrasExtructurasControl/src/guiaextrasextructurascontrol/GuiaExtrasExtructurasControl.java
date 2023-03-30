/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaextrasextructurascontrol;

import java.util.Scanner;
/**
 *
 * @author horac
 */
public class GuiaExtrasExtructurasControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer= new Scanner (System.in);
       int minutos=0;
       double dia=0;
       double hora =0;
        System.out.println("Ingrese los minutos");
        minutos=leer.nextInt();
        dia = (minutos/60/24);
        hora = (minutos/60 % 24);
        System.out.println("dias : " + dia);
        System.out.println("Horas : " + hora);
       
    }
    
}
