/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego_ahorcado_con_array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Juego_ahorcado_con_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int tamaño,turnos;
        char letra;
        //turnos
        
        System.out.println("Introduce los turnos que quieres jugar");
        turnos=sc.nextInt();
        int [] arrayturnos=new int[turnos];
        
        //tamaño
        
        System.out.println("Introduce el tamaño: ");
        tamaño=sc.nextInt();
        int [] arraytamaño=new int[tamaño];
        char arrayletras [] =new char[tamaño];
        
        //Introducir letras para formar la palabra
        
        for (int i=0;i<arrayletras.length;i++){
            System.out.println("Introduce la letra de la posicion " +i+":");
            arrayletras[i]=sc.next().charAt(0);
          }
        
        //Array de adivinar y el fill
        
        System.out.println("Adivina la palabra");
        char arrayadivina []= new char[arrayletras.length];
        Arrays.fill(arrayadivina,'_');
        
        do{
            boolean aux=false;
            System.out.println("Introduce una letra");
            letra=sc.next().charAt(0);
            for (int a=0;a<arrayletras.length;a++){
                if (letra==arrayletras[a]) {
                    arrayadivina[a]=letra;
                    aux=true;
                }
                if (aux){
                    System.out.println("Has acertado");
                    System.out.println(Arrays.toString(arrayadivina));
                }
                else{
                    System.out.println("Letra incorrecta");
                    turnos--;
                }   
            }  
        }
        while (!(turnos==0));
}
}
