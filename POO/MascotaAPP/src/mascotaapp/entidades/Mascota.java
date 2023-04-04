/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp.entidades;

/**
 *
 * @author horac
 */
public class Mascota {

    private String nombre;
    String apodo;
    // Conejo, Gato, Perro, Loro, Carpincho
    private String tipo;
    private int edad;
    private boolean cola;
    private String color;
    private String Raza;
    private int energia;

    public Mascota() {
        energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        if (tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Conejo") || tipo.equals("Carpicho")) {
            this.tipo = tipo;
        }
        energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo, int edad, boolean cola, String color, String Raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.edad = edad;
        this.cola = cola;
        this.color = color;
        this.Raza = Raza;
        this.energia = 1000;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        }
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return Raza;
    }

    /**
     *
     * @param energiaRestar
     * @return
     */
    public int pasear(int energiaRestar) {
        //  this.energia = energia - energiaRestar;
        energia -= energiaRestar;
        return energia;
    }

    /**
     *
     * @param energiaRestar
     * @param vueltas
     * @return
     */
    public int pasear(int energiaRestar, int vueltas) {
        for (int i = 0; i < vueltas; i++) {
            energia -= energiaRestar;
        }
        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", edad=" + edad + ", cola=" + cola + ", color=" + color + ", Raza=" + Raza + ", energia=" + energia + '}';
    }

}
