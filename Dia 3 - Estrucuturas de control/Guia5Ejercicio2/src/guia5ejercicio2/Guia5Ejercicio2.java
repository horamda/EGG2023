/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5ejercicio2;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Guia5Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=0, buscar=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño de vector : ");
        n=leer.nextInt();        
        int [] vector = new int[n];
        cargar(vector);
        System.out.println("Ingrese el numero a buscar : ");
        buscar=leer.nextInt();
        buscar(vector,buscar);
        mostrar(vector);
    }

    static void cargar(int [] vector){
      for (int i = 0; i < vector.length; i++) {
            vector[i]= (int) (Math.random()*10);
        }
    }
    static void mostrar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
    static void buscar(int[]vector, int b){
       
        int pos=0, cont=0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]==b){
               cont++;
               pos=i;
            }
        }
        if (cont>0) {
        System.out.println("elemento encontrado");
            System.out.println(" en la posicion " + pos);
            System.out.println(" y esta repetido " + cont + " vez/veces");
      } else {
            System.out.println("Elemento no encontrado ");}
    }
}
