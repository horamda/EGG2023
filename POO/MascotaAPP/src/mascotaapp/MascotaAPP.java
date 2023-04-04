/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;

/**
 *
 * @author horac
 */
public class MascotaAPP {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Mascota m1 = new Mascota("fernando", "pedro", "8");

        m1.setNombre("pepe chiquito");
        System.out.println("nombre" + m1.getNombre());
        System.out.println("----------------------------------------");
        System.out.println(m1.toString());
        m1.pasear(100);
        System.out.println(m1.toString());
        m1.pasear(180);
        System.out.println(m1.toString());
        m1.pasear(130);
        System.out.println(m1.toString());

//       public String nombre;
//    public String apodo;
//    // Conejo, Gato, Perro, Loro, Carpincho
//    public String tipo;
//    public int edad;
//    public boolean cola;
//    public String color;
//    public String Raza;
    }
}
