/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegodamas;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class JuegoDamas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        //se crea el tablero
        char [][]tablero=new char[5][5];
        rellenar(tablero);
        mostrar(tablero);
        int turnos=10;
        do {
            System.out.println("Juegan negras");
            System.out.println("Elije la dama");
            int posx;
            int posy;
            do {
                posx=sc.nextInt();
                posy=sc.nextInt();
            }
            while (tablero[posx][posy]!='N');
            if(tablero[posx+1][posy]=='*'){
                //lo que hay en la casilla que el user quiera mover es igual a la ficha
                tablero[posx+1][posy]=tablero[posx][posy];
                //reemplazas la casilla vacia por un *
                tablero[posx][posy]='*';
                
            }
        } 
        while (turnos<=10);
                
    }
    //se rellenan las posiciones con lo que queremo
    public static void rellenar(char tablero[][]){
        for(int i=0;i<tablero.length;i++){
            tablero[0][i]='N';
            tablero[4][i]='B';
            tablero[1][i]='*';
            tablero[2][i]='*';
            tablero[3][i]='*';
        }
    }
    //se muestra el tablero
    public static void mostrar(char tablero[][]){
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[i].length;j++){
                System.out.print(tablero[i][j]+" ");
                }
            System.out.println(" ");
            }
        
        }
}
