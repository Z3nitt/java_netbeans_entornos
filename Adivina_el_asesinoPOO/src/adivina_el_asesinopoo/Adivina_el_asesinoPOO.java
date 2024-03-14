/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivina_el_asesinopoo;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Adivina_el_asesinoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean ganar;
        Scanner sc= new Scanner (System.in);
        Persona[] personajes=new Persona[6];
        Persona p1= new Persona("Mayordomo","hall");
        Persona p2= new Persona("Ama de llaves","dormitorio");
        Persona p3= new Persona("Jardinero","jardin");
        Persona p4= new Persona("Cocinero","cocina");
        Persona p5= new Persona("Propietario","salon");
        Persona p6= new Persona("Esposa","baño");
        int turnos=3;
        int asesino_random=(int)(Math.random()*6);
        Persona[] personaje ={p1,p2,p3,p4,p5,p6};
        do{
            System.out.println("1.Advina el personaje | 2.");
            int respuesta=sc.nextInt();
            switch(respuesta){
                case 1:
                    System.out.println("¿Quien es el asesino?");
                    String nombre_asesino=sc.next();
                    if(nombre_asesino.equalsIgnoreCase(personajes[asesino_random].getNombre())){
                        System.out.println("Has ganado");
                        turnos=0;
                        ganar=true;
                    }
                    else{
                        turnos=0;
                        ganar=false;
                    }
                    break;
                case 2: 
                    System.out.println("¿A quien le quieres preguntar?");
                    int respuesta2=sc.nextInt();
                    personajes[respuesta2].donde_estaba();
                    break;
            }
            boolean asesinar=false;
            while (asesinar){
            int random_matar=(int)(Math.random()*6);
            if(asesino_random==random_matar){
                asesinar=false;
            }
            else{
                personajes[random_matar]=null;
                asesinar=true;
            }
            }
        }
        while(!(turnos==0));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
