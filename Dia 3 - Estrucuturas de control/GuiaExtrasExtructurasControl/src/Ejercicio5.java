
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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int importe = 0;
        String tipo = "";
        System.out.println("Ingrese el tipo de socio A/B/C");
        tipo=  leer.next();
        tipo=tipo.toUpperCase();
        System.out.println("ingrese el importe del tratamiento :");
        importe = leer.nextInt();

        switch (tipo) {
            case "A":
                System.out.println("El socio debera pagar " + (importe * 0.50));
                break;

            case "B":
                System.out.println("El socio debera pagar " + (importe * 0.65));
                break;
            case "C":
                System.out.println("El socio debera pagar " + (importe));
                break;
            default:
                System.out.println("tipo de socio incorrecto");
        }
    }

}
