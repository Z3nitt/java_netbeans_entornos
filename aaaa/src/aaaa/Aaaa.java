/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaaa;

/**
 *
 * @author Medac
 */
public class Aaaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

public class TableroJuegoConLetras {

    private char[][] tablero = new char[3][3];

    public TableroJuegoConLetras() {
        // Inicializar el tablero
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    public void imprimirTablero() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public boolean realizarMovimiento(char ficha, char direccion) {
        int[] posicion = encontrarPosicion(ficha);

        if (posicion == null) {
            System.out.println("Ficha no encontrada");
            return false;
        }

        int nuevaFila = posicion[0];
        int nuevaColumna = posicion[1];

        // Realizar el movimiento
        switch (direccion) {
            case 'W':
                nuevaFila--;
                break;
            case 'A':
                nuevaColumna--;
                break;
            case 'S':
                nuevaFila++;
                break;
            case 'D':
                nuevaColumna++;
                break;
            default:
                System.out.println("Dirección no válida");
                return false;
        }

        // Verificar si la nueva posición es válida
        if (esPosicionValida(nuevaFila, nuevaColumna)) {
            tablero[posicion[0]][posicion[1]] = '-';
            tablero[nuevaFila][nuevaColumna] = ficha;
            return true;
        } else {
            System.out.println("Movimiento no válido");
            return false;
        }
    }

    private int[] encontrarPosicion(char ficha) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ficha) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    private boolean esPosicionValida(int fila, int columna) {
        return fila >= 0 && fila < 3 && columna >= 0 && columna < 3;
    }

    public static void main(String[] args) {
        TableroJuegoConLetras tableroJuego = new TableroJuegoConLetras();
        Scanner scanner = new Scanner(System.in);

        char turno = 'A';

        while (true) {
            tableroJuego.imprimirTablero();
            System.out.println("Turno del jugador " + turno);
            System.out.print("Ingrese la ficha que desea mover: ");
            char ficha = scanner.next().charAt(0);

            System.out.print("Ingrese la dirección (W/A/S/D): ");
            char direccion = scanner.next().charAt(0);

            if (tableroJuego.realizarMovimiento(ficha, direccion)) {
                // Cambiar el turno al siguiente jugador
                turno = (turno == 'A') ? 'B' : ((turno == 'B') ? 'C' : 'A');
            }
        }
    }
}

    }
    
}
