/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero.secreto;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class NumeroSecreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int num_random=(int) (Math.random()*100+1);
        int num_escrito;
        System.out.println(num_random);
        System.out.println("Intenta adivinar el número que pienso del 1 al 100");
        num_escrito= sc.nextInt();
        while (num_escrito!=num_random && num_escrito!=-1){
            if (num_escrito==num_random){
                System.out.println("¡Enhorabuena has ganado!");
            }
            if (num_escrito>num_random){
                System.out.println("El número secreto es mas pequeño.");
            }
            if (num_escrito<num_random){
                System.out.println("El número secreto es mas grande.");
            }
            num_escrito= sc.nextInt(); 
        }
            if (num_escrito==num_random){
                System.out.println("¡Enhorabuena has ganado!");
            }
            System.out.println("Saliendo del juego...");
    }   
}
