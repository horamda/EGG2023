/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraapp;

import calculadoraapp.Operacion.Operacion;

/**
 *
 * @author horac
 */
public class CalculadoraAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Operacion op1=new Operacion(10,2);
        System.out.println(op1.toString());
        System.out.println(op1.sumar());
        System.out.println(op1.restar());
        System.out.println(op1.multiplicar());
        System.out.println(op1.dividir());
    
    }
    
}
