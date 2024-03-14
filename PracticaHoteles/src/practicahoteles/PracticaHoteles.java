/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicahoteles;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class PracticaHoteles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String nombre;
        int turnos=0;
        
        Hotel_Boom hotelboom= new Hotel_Boom("Hotel Boom",1100000);
        Hotel_Chinatow hotelchinatow= new Hotel_Chinatow("Hotel Chinatow",2000000);
        Hotel_Blue hotelblue= new Hotel_Blue("Hotel Blue",6000000);
        Hotel_Fontaine hotelfontaine= new Hotel_Fontaine("Hotel Fontaine",5000000);
        Hotel_President hotelpresident= new Hotel_President("Hotel President",3000000);
        Hotel_Waikiki hotelwaikiki= new Hotel_Waikiki("Hotel Waikiki",4000000);
        
        Hoteles[] array = {hotelboom,hotelchinatow,hotelblue,hotelfontaine,hotelpresident,hotelwaikiki};
        
        
        Jugador j=new Jugador();
        
        do{
            System.out.println("Introduce tu nombre:");
            nombre= sc.next();
        
            System.out.println("__________Comienza el juego__________");
        
            System.out.println("Nombre del jugador: " + nombre);
        
            System.out.println("Turno 1:");
        
            System.out.println(nombre + " tienes " + j.getDinero() + " €");
        
            System.out.println("1.Jugar | 2.Pasar");
            int resp= sc.nextInt();
            if(resp==1){
                int dado= (int)(Math.random()*6);
                array[dado].getNombre();
            }
            else{
            
            }
        }
        while(turnos<12);
    }
    
}
