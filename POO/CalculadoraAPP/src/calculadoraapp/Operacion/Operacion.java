/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraapp.Operacion;

/**
 *
 * @author horac
 */
public class Operacion {
    private double numero1;
    private double numero2;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    public void crearOperacion(bouble numero1, double numero2){
    numero1=numero1;
    numero2=numero2;
    }
    public double sumar (){
    return (numero1+numero2);
    }
    public double restar(){
    return (numero1-numero2);
    };
    public double multiplicar(){
    return numero1*numero2;
    }
    public double dividir(){
    return numero1/numero2;
    }

    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    
}
