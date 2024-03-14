/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Medac
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
      
        boolean bucle=true;
        Jugador j1 = new Jugador("Nyland","Portero",1000000.0);
        Jugador j2 = new Jugador("Dimitrovic","Portero",600000.0);
        Jugador j3 = new Jugador("Fernando","Defensa",1000000.0);
        Jugador j4 = new Jugador("Sergio Ramos","Defensa",1600000.0);
        Jugador j5 = new Jugador("Badé","Defensa",1050000.0);
        Jugador j6 = new Jugador("Juanlu","Defensa",1000000.0);
        Jugador j7 = new Jugador("Pedrosa","Defensa",1200000.0);
        Jugador j8 = new Jugador("Gudelj","Defensa",1600000.0);
        Jugador j9 = new Jugador("Rakitic","Centrocampista",5000000.0);
        Jugador j10 = new Jugador("Suso","Centrocampista",3500000.0);
        Jugador j11 = new Jugador("Acuña","Defensa",1800000.0);
        Jugador j12 = new Jugador("Ocampos","Centrocampista",8000000.3);
        Jugador j13 = new Jugador("Mariano","Delantero",1000000.0);
        Jugador j14 = new Jugador("Rafa Mir","Delantero",1000000.0);
        Jugador j15 = new Jugador("En-nesyri","Delantero",1000000.0);
        Jugador j16 = new Jugador("Lukebakio","Centrocampista",9500000.0);
        Jugador j17 = new Jugador("Sow","Centrocampista",3008000.0);
        Jugador j18 = new Jugador("Soumare","Centrocampista",1030700.1);
        Jugador j19 = new Jugador("Jesus Navas","Defensa",10500000.0);
        Jugador j20 = new Jugador("Kike","Defensa",600000.0);
        Jugador j21 = new Jugador("Fulanito","Delantero",12000000.0);
        Jugador j22 = new Jugador("Menganito","Centrocampista",15000000.0);
        
        Jugador[] jugadores= {j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,j12,j13,j14,j15,j16,j17,j18,j19,j20,j21,j22};
        
        Jugador[] plantilla = new Jugador[11];

        
        for(int i=0;i<11;i++){
            int numRandom=(int)(Math.random()*22);
            if(jugadores[numRandom]!=null){
            plantilla[i]=jugadores[numRandom];
            jugadores[numRandom]=null;
            }
            else{
                i--;
            }
        }
        
        do{
            System.out.println("1.Mostrar plantilla | 2.Cambiar jugador | 3.Valor del equipo | 4.Salir");
            int eleccion=sc.nextInt();
            switch(eleccion){
                case 1:
                    System.out.println("__________Plantilla_________");
                    System.out.println(Arrays.toString(plantilla));
                    System.out.println("____________________________");
                    break;
                    
                case 2:
                    System.out.println("Jugadores disponibles:");
                    if(jugadores==null){
                        
                    }
                    else{
                    System.out.println(Arrays.toString(jugadores));
                    }
                    System.out.println("-------------------------------");
                    System.out.println("Tu plantilla");
                    for(int i=0;i<plantilla.length;i++){
                        System.out.println(plantilla[i]);
                    }
                    System.out.println("-------------------------------");
                    System.out.println("Tu lista");
                    for(int i=0;i<jugadores.length;i++){
                        System.out.println(jugadores[i]);
                                }
                    System.out.println("Elige la posicion del jugador que quieres cambiar de tu lista: ");
                    int cambiolista=sc.nextInt();
                    System.out.println("Elige la posicion del jugador que quieres cambiar de tu plantilla: ");
                    int cambioplantilla=sc.nextInt();
                    for(int i=0;i<plantilla.length;i++){
                        System.out.println(plantilla[i]);
                    }
                    break;
                case 3:
                    double total=0;
                    for(int i=0;i<plantilla.length;i++){
                        total=total+plantilla[i].getPrecio();
                    }
                    System.out.println("El precio total de tu equipo es: "+total);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    bucle=false;
                    break;
                
                default:
                    System.out.println("Esta opción no existe introduzca una valida: ");
                    break;
            }
            
        }
        while(bucle);
        
    }
    
}
