/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cluedo_randompoo;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Cluedo_RandomPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int turnos = 3;
        Personaje mayordomo = new Personaje("Mayordomo");
        Personaje ama_llaves = new Personaje("Ama de llaves");
        Personaje jardinero = new Personaje("Jardinero");
        Personaje cocinero = new Personaje("Cocinero");
        Personaje propietario = new Personaje("Propietario");
        Personaje esposa = new Personaje("Esposa del propietario");
        Personaje[] array_personaje ={mayordomo,ama_llaves,jardinero,cocinero,propietario,esposa};
        int asesino_random= (int)(Math.random()*6);
        array_personaje[asesino_random].setAsesino(true);
        
        do{
            System.out.println("Elija una opcion: 1.Preguntar");
            int opcion=sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("¿A quien le quiere preguntar? | 1.Mayordomo | 2.Ama de llaves | 3.Jardinero | 4.Cocinero | 5.Propietario | 6.Esposa del propietario");
                    int hablar=sc.nextInt();
                    switch(hablar){
                        case 1:
                            p1.DondeEstaba("Mayordomo");
                            turnos--;
                            break;
                        case 2:
                            p2.DondeEstaba("Ama de llaves");
                            turnos--;
                            break;
                        case 3:
                            p3.DondeEstaba("Jardinero");
                            turnos--;
                            break;
                        case 4:
                            p4.DondeEstaba("Cocinero");
                            turnos--;
                            break;
                        case 5:
                            p5.DondeEstaba("Propietario");
                            turnos--;
                            break;
                        case 6:
                            p6.DondeEstaba("Esposa del propietario");
                            turnos--;
                            break;
                    }
                    
                    
                    
                
            }
            
        }
        while(!(turnos==0));
    }
    
}
