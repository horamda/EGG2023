/*
Los profesores del curso de programación de Egg necesitan llevar un registro 
de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad 
de aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas,
2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla 
la cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban 
los alumnos con promedio mayor o igual al 7 de sus notas del curso.

 */
package guia5ejercicioextra4;

import java.util.Scanner;

/**
 *
 * @author horac
 */
public class Guia5EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 10, m = 7;
        Object[][] matriz = new Object[n][m];
        Scanner leer = new Scanner(System.in);
        cargarMatriz(matriz, leer, n, m);
        mostrarMatriz(matriz, n, m);
        mostrarAprobados(matriz, n, m);
        mostrarDesaprobados(matriz,n,m);
    }

    static void cargarMatriz(Object matriz[][], Scanner entrada, int n, int m) {
        String nombre = "";
        int nota = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre del alumno : ");
            nombre = entrada.nextLine();
            matriz[i][0] = nombre;
            int suma = 0;
            float suma2 = 0;

            for (int j = 1; j < m - 2; j++) {

                do {
                    System.out.println("Ingrese la nota  N° " + j);
                    nota = entrada.nextInt();
                    matriz[i][j] = nota;
                    suma = suma + nota;
                    matriz[i][5] = Float.valueOf((suma / 4));
                } while (nota < 0 || nota > 10);

            }
            //System.out.println("Ingrese el nombre del alumno : ");
            suma2 = (int) matriz[i][1] * 10 + (int) matriz[i][2] * 15 + (int) matriz[i][3] * 25 + (int) matriz[i][4] * 50;
            matriz[i][6] = (suma2 / 100);
            nombre = entrada.nextLine();

        }
    }

    static void mostrarMatriz(Object matriz[][], int n, int m) {
        System.out.println(" " + "Nombre " + "     Nota1    " + " Nota2    " + " nota3   " + " Nota4   " + " Promedio " + "Ponderado");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[  " + matriz[i][j] + "  ]  ");
            }
            System.out.println("");
        }
    }

    static void mostrarAprobados(Object matriz[][], int n, int m) {
        int cont = 0;
        System.out.println("");
        System.out.println("Informe de notas : APROBADOS ");
        
        for (int i = 0; i < n; i++) {

                if ((float) matriz[i][6] > 7) {
                    cont=cont+1;
                    System.out.print("[  " + matriz[i][0] + "  ]  ");
                    System.out.print("[  " + matriz[i][6] + "  ]  ");
                }
            
            System.out.println("");
        }
        System.out.println("La cantidad de aprobados es : " + cont);
    }
    
      static void mostrarDesaprobados(Object matriz[][], int n, int m) {
        int cont = 0;
          System.out.println("");
        System.out.println("Informe de notas : DESAPROBADOS ");
        
        for (int i = 0; i < n; i++) {

                if ((float) matriz[i][6] <=  7) {
                    cont=cont+1;
                    System.out.print("[  " + matriz[i][0] + "  ]  ");
                    System.out.print("[  " + matriz[i][6] + "  ]  ");
                }
            
            System.out.println("");
        }
        System.out.println("La cantidad de aprobados es : " + cont);
    }
}

