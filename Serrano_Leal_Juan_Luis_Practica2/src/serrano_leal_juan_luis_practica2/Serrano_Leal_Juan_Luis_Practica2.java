/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serrano_leal_juan_luis_practica2;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Medac
 */
public class Serrano_Leal_Juan_Luis_Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int filas = 10;
        int columnas = 10;
        int filaActual = 0;
        int columnaActual = 0;
        char movimiento;
        int vidas =20;
        
        
        
        char[][] tablero = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == filaActual && j == columnaActual) {
                    tablero[i][j] = 'O'; //Ficha jugador
                }
                else {
                    tablero[i][j] = '_'; //Fichas laberinto
                }
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        
        do {
            System.out.print("Ingresa un movimiento (W/A/S/D para moverte, 0 para salir): ");
            movimiento = sc.next().charAt(0);

            if (movimiento == '0') {
                System.out.println("¡Has perdido por abandono!");
                break;
            }
            
            tablero[filaActual][columnaActual] = '_';
            switch (movimiento) {
                case 'w':
                case 'W':
                    if (filaActual > 0) {
                        filaActual--;
                    }
                    else{
                        System.out.println("No puedes moverte en esta dirección.");
                        vidas--;
                        System.out.println("Has perdido 1 vida, te quedan " + vidas + " vidas");
                    }
                    break;
                case 'a':
                case 'A':
                    if (columnaActual > 0) {
                        columnaActual--;
                    }
                    else{
                        System.out.println("No puedes moverte en esta dirección.");
                        vidas--;
                        System.out.println("Has perdido 1 vida, te quedan " + vidas +" vidas");
                    }
                    break;
                case 's':
                case 'S':
                    if (filaActual < filas - 1) {
                        filaActual++;
                    }
                    else{
                        System.out.println("No puedes moverte en esta dirección.");
                        vidas--;
                        System.out.println("Has perdido 1 vida, te quedan " + vidas +" vidas");
                    }
                    break;
                case 'd':
                case 'D':
                    if (columnaActual < columnas - 1) {
                        columnaActual++;
                    }
                    else{
                        System.out.println("No puedes moverte en esta dirección.");
                        vidas--;
                        System.out.println("Has perdido 1 vida, te quedan " + vidas +" vidas");
                    }
                    break;
                default:
                    System.out.println("Movimiento no válido.");
                    vidas--;
                    System.out.println("Te quedan "+ vidas +" vidas" );
            }

            tablero[filaActual][columnaActual] = 'O';
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println(""); 
            }
            
            
            
            
        }
        while (vidas>0);
        System.out.println("Has perdido, te has quedado sin vidas");
        
        
        
        
        
        
        
    }
    
}
