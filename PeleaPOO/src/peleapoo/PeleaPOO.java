/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peleapoo;

/**
 *
 * @author Medac
 */
public class PeleaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Jugador j1 = new Jugador("Sexo");
        Jugador j2= new Jugador("Aguacate Skeler");
        
        do{
            int a= (int)(Math.random()*2);
            if(a==0){ //Jugador 1 le pega al 2
                j1.luchar(j2);
                System.out.println(j2.getNombre()+" tiene "+ j2.getVida()+" vidas.");
            }
            else{ //Jugador 2 le pega al 1
                j2.luchar(j1);
                System.out.println(j1.getNombre()+" tiene "+ j1.getVida()+" vidas.");
            }
//            System.out.println(j2.getNombre()+" tiene "+ j2.getVida()+" vidas, Y , " + j1.getNombre() + " tiene " + j1.getVida() + " vidas.");
        }
        while(j1.getVida()>0 && j2.getVida()>0);
        
        if(j1.getVida()==0){ //Pierde jugador1
            System.out.println("Ha ganado: "+j2.toString());
        }
        else{ //Pierde jugador2
            System.out.println("Ha ganado: "+ j1.toString());
        }
        
        
        
        
        
        
        
    }
    
}
