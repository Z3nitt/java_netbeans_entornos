/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3_en_ralla;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Medac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int posX=0, posY=0;
        char [][] tablero=new char [10][10];
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[0].length;j++){
                tablero[i][j]=' ';
            }
        }
        
        tablero [0][1]=1;
        tablero [0][2]=1;
        tablero [0][3]=1;
        tablero [0][4]=1;
        tablero [0][5]=1;
        tablero [0][6]=1;
        tablero [0][7]=1;
        tablero [0][8]=1;
        tablero [0][9]=1;
        
        System.out.println(tablero);
        rellenartablero(tablero);
        mostrar(tablero);
        
        
        
        
        
        
        
    }
    public static void mostrar(char [][]a){
        for(int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }
    }
    
     public static void rellenartablero (char[][]a){
        for (int fila=0; fila<a.length;fila++){
        Arrays.fill(a[fila], 'X');
        }
            
    }
}
