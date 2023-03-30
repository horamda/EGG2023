/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5ejercicio5;

/**
 *
 * @author horac
 */
public class Guia5Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=3;
        int[][] matriz = new int[n][n], mtranspuesta=new int[n][n];
        
        cargarMatriz(matriz);
        mostrarMatriz(matriz);
        traspuesta(matriz,mtranspuesta);
    }

    static void cargarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (10 * Math.random());
            }
        }
    }

    static void mostrarMatriz(int  matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
      static void traspuesta(int matriz[][],int mtranspuesta[][]) {
          System.out.println("");
          for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                mtranspuesta[i][j]=-matriz[j][i];
                System.out.print("[" + mtranspuesta[i][j] + "]");   
            }
            System.out.println(" ");
        }
    }



}
      
  

  