
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author horac
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner (System.in);
        int num =0 ;
        System.out.println("Ingrese un numero de1 1 al 10");
        num =leer.nextInt();
        switch (num) {
            case 1: System.out.println("I");
                break;
                     case 2: System.out.println("II");
                break;
                     case 3: System.out.println("III");
                break;
                     case 4: System.out.println("IV");
                break;
                     case 5: System.out.println("V");
                break;
                     case 6: System.out.println("VI");
                break;
                     case 7: System.out.println("VII");
                break;
                     case 8: System.out.println("VIII");
                break;
                     case 9: System.out.println("IX");
                break;
                case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("error al ingresar el numero");;
        }
          
        
    }
    
}
