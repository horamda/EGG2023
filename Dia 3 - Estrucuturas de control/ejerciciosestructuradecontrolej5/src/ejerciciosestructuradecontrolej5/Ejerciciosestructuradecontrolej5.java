/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, 
*y a continuación solicite números al usuario hasta que la suma de los números 
*introducidos supere el límite inicial.
 */
package ejerciciosestructuradecontrolej5;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Ejerciciosestructuradecontrolej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite = 0, num = 0, suma = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el limite superior : ");
        limite = leer.nextInt();

        do {
            System.out.println("Ingrese los numeros a sumar ");
            num = leer.nextInt();
            suma = suma + num;
        } while (limite >= suma);
        System.out.println("El limite es " + limite + " La suma de los numeros ingresados es : " + suma);
        System.out.println("suma = " + suma);

        //Atajo1  soutv + Tab --> System.out.println("suma = " + suma);
        //atajo2  sout + Tab --> System.out.println("");
    }
}
