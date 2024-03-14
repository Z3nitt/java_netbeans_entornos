/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hunde_la_flota;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Hunde_la_flota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        //TABLERO
        char [][] tablero=new char [10][10];
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[0].length;j++){
                tablero[i][j]=' ';
            }
        }
        
        char [][] copiatablero=new char [10][10];
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[0].length;j++){
                tablero[i][j]=' ';
            }
        }
        
        rellenartablero(tablero);
        rellenartablero(copiatablero);
        introducir_barco(tablero,5,'B');
        introducir_barco(tablero,3,'C');
        introducir_barco(tablero,1,'D');
        mostrar(tablero);
        
        int barcoB=5,barcoC=3,barcoD=1;
        
        do{
            mostrar(copiatablero);
            System.out.println("Introduce la coordenada X");
            int coordX=sc.nextInt();
            System.out.println("Introduce la coordenada Y");
            int coordY=sc.nextInt();
            char letra= tablero[coordX][coordY];
            switch(letra){
                case ' ':
                    System.out.println("Agua");
                    copiatablero[coordX][coordY]='A';
                    tablero[coordX][coordY]='A';
                    break;
                case 'B':
                    System.out.println("Tocado");
                    copiatablero[coordX][coordY]='B';
                    tablero[coordX][coordY]='T';
                    barcoB--;
                    break;
                case 'C':
                    System.out.println("Tocado");
                    copiatablero[coordX][coordY]='B';
                    tablero[coordX][coordY]='T';
                    barcoC--;
                    break;
                case 'D':
                    System.out.println("Tocado");
                    copiatablero[coordX][coordY]='D';
                    tablero[coordX][coordY]='T';
                    barcoD--;
                    break;
            }
            
            
            
        }
        while(!(barcoB==0 && barcoC==0 && barcoD==0));
            System.out.println("GG");
        
        
   
    }
    public static void mostrar(char [][]a){
        for(int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }
}
    public static void rellenartablero (char[][]a){
        for (int fila=0; fila<a.length;fila++){
        Arrays.fill(a[fila], ' ');
        }
            
    }
    public static void introducir_barco (char[][]m, int tam, char letra){
        boolean condicion;
        int posX,posY;
        do{
        condicion=false;
        posX= (int)(Math.random()*10);
        posY= (int)(Math.random()*10);
        if(posY+tam<m[0].length){
        condicion=true;
        
        for (int i=0;i<tam;i++){
            if (m[posX][posY+i]!=' '){
            condicion=false;
            }
            if(condicion=true){
                for(int a=0;a<tam;a++){
                m[posX][posY+a]=letra;
                
                }
            }
            
        }

        }
        }
        
        while(!condicion);
        
    }
    
}
