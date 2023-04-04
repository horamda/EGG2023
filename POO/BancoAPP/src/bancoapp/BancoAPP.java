/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoapp;

import bancoapp.banco.Cuenta;

/**
 *
 * @author horac
 */
public class BancoAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuenta c1=new Cuenta("pedro",15000);
        System.out.println(c1.toString());
        c1.retirarDinero(16000);
        System.out.println(c1.toString());
    }
    
}
