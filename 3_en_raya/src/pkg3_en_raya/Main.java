/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3_en_raya;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Juanlu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int filas = 5;
        int columnas = 5;
        int filaActual = 2; // Posición inicial en fila
        int columnaActual = 2; // Posición inicial en columna

        char[][] tablero = new char[filas][columnas];
        
        

        // Inicializamos el tablero
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == filaActual && j == columnaActual) {
                    tablero[i][j] = 'X'; // Posición actual
                } else {
                    tablero[i][j] = '_'; // Celdas vacías
                }
            }
        }

        // Imprimimos el tablero
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        char movimiento;

        while (true) {
            System.out.print("Ingresa un movimiento (W/A/S/D para moverte, Q para salir): ");
            movimiento = scanner.next().charAt(0);

            if (movimiento == 'Q' || movimiento == 'q') {
                System.out.println("¡Adiós!");
                break;
            }

            // Borramos la posición actual
            tablero[filaActual][columnaActual] = '_';

            // Realizamos el movimiento
            switch (movimiento) {
                case 'W':
                case 'w':
                    if (filaActual > 0) {
                        filaActual--;
                    }
                    break;
                case 'A':
                case 'a':
                    if (columnaActual > 0) {
                        columnaActual--;
                    }
                    break;
                case 'S':
                case 's':
                    if (filaActual < filas - 1) {
                        filaActual++;
                    }
                    break;
                case 'D':
                case 'd':
                    if (columnaActual < columnas - 1) {
                        columnaActual++;
                    }
                    break;
                default:
                    System.out.println("Movimiento no válido.");
            }

            // Colocamos la posición actual actualizada
            tablero[filaActual][columnaActual] = 'X';

            // Imprimimos el tablero
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
        }
        
        
        
    }
    
}
