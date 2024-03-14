/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacrolotr;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class SimulacroLOTR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        Aragorn aragorn= new Aragorn();
        Legolas legolas= new Legolas();
        Gimli gimli= new Gimli();
        Orco orco= new Orco();
        
        Jugador[] jugadores={aragorn,legolas,gimli};
        
        Carta[]mazo=new Carta[10];
        
        for(int i=0;i<mazo.length;i++){
            int ataque=(int)(Math.random()*10);
            int vida=(int)(Math.random()*10);
            mazo[i]=new Carta(ataque,vida);
        }
        
        do{
            for (int i = 0; i < jugadores.length; i++) {
                int robar=(int)(Math.random()*10);
                jugadores[i].robarCarta(mazo[robar]);
                jugadores[i].verCartas();
                System.out.println("1. Atacar | 2. Usar carta");
                int resp=sc.nextInt();
                switch (resp) {
                    case 1:
                        orco.setVida(orco.getVida()-jugadores[i].getAtaque());
                        System.out.println("Has hecho "+jugadores[i].getAtaque()+" puntos de daño");
                        break;
                    case 2:
                        System.out.println("¿Que carta quieres usar?");
                        int respuestaC=sc.nextInt();
                        jugadores[i].usarCarta(respuestaC);
                        break;
                    default:
                        System.out.println("El número no está entre 1 o 2, prueba de nuevo.");
                }
            }
            int orcoataque=(int)(Math.random()*3);
            jugadores[orcoataque].setVida(jugadores[orcoataque].getVida()-orco.getAtaque());
            System.out.println("El orco ha hecho "+orco.getAtaque() +" puntos de daño a "+ jugadores[orcoataque] );
            
        }
        while (!(orco.getVida()<0) || aragorn.getVida()<0 || legolas.getVida()<0 || gimli.getVida()<0);
        
        System.out.println("a");
        
    }
    
}
