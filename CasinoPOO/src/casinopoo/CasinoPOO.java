/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casinopoo;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class CasinoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        Jugador j1 = new Jugador("sexo","1234",100,18);
        Jugador j2 = new Jugador("Pimiento Skeler","123",100,35);
        
        System.out.println("1. Jugar a la ruleta | 2.Jugar al blackjack | 3.Insultar | 4.Salir");
        int opcion=sc.nextInt();
        
        switch(opcion){
            case 1:
                int num= (int)(Math.random()*9);
                System.out.println("J1 escoge un número del 1 al 9");
                int respuestanum= sc.nextInt();
                
                String Blanco, Negro;
                int color= (int) (Math.random()*2);
                System.out.println("J1 escoge color");
                int respuestacol= sc.next;
                
        }
        
    }
    
}
