/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria2app;

import java.util.Scanner;
import libreria2app.libreria.Libro;

/**
 *
 * @author horac
 */
public class Libreria2APP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        Libro lib=new Libro();
        System.out.println("Ingrese el ISBN ");
        lib.setISBN(leer.nextInt());
        System.out.println("Ingrese titulo ");
        lib.setTitulo(leer.next());
        System.out.println("Ingrese autor ");
        lib.setAutor(leer.next());
        System.out.println("Ingrese numero de paginas ");
        lib.setNumPaginas(leer.nextInt());
        System.out.println(lib.toString());
        
    }
    
}
