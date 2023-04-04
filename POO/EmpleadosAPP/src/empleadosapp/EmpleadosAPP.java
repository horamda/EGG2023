/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadosapp;

import empleadosapp.empleado.Empleado;

/**
 *
 * @author horac
 */
public class EmpleadosAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Empleado e1 = new Empleado("PEPE", 31, 55);
        System.out.println(e1.toString());
        e1.calcularAumento();
        System.out.println(e1.toString());
    }

}
