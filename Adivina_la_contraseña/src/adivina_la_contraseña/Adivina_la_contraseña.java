/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivina_la_contraseña;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Adivina_la_contraseña {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Introduce la palabra secreta");
        String PalabraS = sc.nextLine();
        System.out.println("Intenta adivinar la palabra secreta");
        String PalabraE = sc.nextLine();
        while (!(PalabraS.equals(PalabraE))){
            if(PalabraS.equals(PalabraE)){
                System.out.println("Palabra correcta, enhorabuena");
            }
            if (!(PalabraS.equals(PalabraE))){
                System.out.println("La palabra introducida es incorrecta...");
                System.out.println("La pista es:"+PalabraS.charAt(0)+" _ "+" _ "+PalabraS.charAt(3));
                PalabraE = sc.nextLine();
            }
        }
        System.out.println("SEXOO");
        
        
    }
    
}
