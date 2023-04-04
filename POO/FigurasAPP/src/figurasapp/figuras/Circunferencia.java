/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasapp.figuras;

/**
 *
 * @author horac
 */
public class Circunferencia {

    private double radio;
    private double area;
    private double perimetro;

    public Circunferencia() {
    }
    
    public Circunferencia(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia(double radio) {
        this.radio = radio;
    }

    public double area() {

        area = ((Math.PI * radio) * (Math.PI * radio));
        return area;
    }

    public double sacarPerimetro() {
        return perimetro = 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    
    
}
