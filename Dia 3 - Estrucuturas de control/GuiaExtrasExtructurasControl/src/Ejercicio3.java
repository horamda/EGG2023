
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author horac
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String vocal = "";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        vocal = leer.next();
        if (vocal.equals("a") || vocal.equals("e") || vocal.equals("i") || vocal.equals("o") || vocal.equals("u")) {
            System.out.println("Vocal");
        } else {
            System.out.println("No vocal");
        }
    }

}
