/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriaapp;

import java.util.Scanner;
import libreriaapp.entidades.Libro;

/**
 *
 * @author horac
 */
public class LibreriaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer=new Scanner(System.in);
        Libro l1=new Libro();
        l1.setLibroCompleto("3268DDD", "Libro1", "pep", 1110);
        System.out.println(l1);
        System.out.println("-------------------------------");
        System.out.println(l1.toString());
    }
    
}
