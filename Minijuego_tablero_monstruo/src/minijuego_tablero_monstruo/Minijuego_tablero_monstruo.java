/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minijuego_tablero_monstruo;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Minijuego_tablero_monstruo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int filas=10;
        int columnas=10;
        int fila_actual=0;
        int columna_actual=0;
        
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                if(i==fila_actual && j==columna_actual){
                    System.out.print("X");
                }
                else{
                    System.out.print("_ ");
                }
            }
            System.out.println("");
        }
        
        char movimiento;
        Scanner sc= new Scanner (System.in);
        
        do{
            System.out.println("Introduce la direcion a la que te quieres mover w|a|s|d");
            movimiento=sc.next().charAt(0);
            switch(movimiento){
                
                case 'W':
                case 'w':
                    
                
            }
            
            
            
            
            
            
        }
        while(true);
        
        
        
        
        
    }
    
}
