/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio6estructurascontrol;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Ejercio6EstructurasControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        {
            // TODO code application logic here
            int num1 = 0, num2 = 0, opcion = 0;
            String respuesta = "N";
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el primer numero : ");
            num1 = leer.nextInt();
            System.out.println("Ingrese el segundo numero : ");
            num2 = leer.nextInt();
            while (!respuesta.equalsIgnoreCase("S")) {
                do {
                    System.out.println("Menu");
                    System.out.println("1.Sumar");
                    System.out.println("2.Restar");
                    System.out.println("3.Multiplicar");
                    System.out.println("4.Dividir");
                    System.out.println("5.Salir");
                    System.out.println("Elija su opcion : ");
                    opcion = leer.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("suma = " + (num1 + num2));
                            break;
                        case 2:
                            System.out.println("resta = " + (num1 - num2));
                            break;
                        case 3:
                            System.out.println("multiplicacion = " + (num1 * num2));
                            break;
                        case 4:
                            System.out.println("Division = " + (num1 / num2));
                            break;
                        case 5:
                            System.out.println("Desea salir S/N");
                            respuesta = leer.next();
                            break;
                        default:
                            System.out.println("opcion erronea");
                    }
                } while (opcion != 5);
            };
        }
    }
}
