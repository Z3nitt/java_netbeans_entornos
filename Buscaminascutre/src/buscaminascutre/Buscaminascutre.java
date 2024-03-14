/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscaminascutre;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Medac
 */
public class Buscaminascutre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
        int turnos;
        System.out.println("Introduce los turnos que quieres jugar");
        turnos=sc.nextInt();
        
        
        char [][] tablero=new char [3][3];
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[0].length;j++){
                tablero[i][j]=' ';
            }
        }
        char [][] copiatablero=new char [3][3];
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[0].length;j++){
                tablero[i][j]=' ';
            }
        }
        
        
        rellenartablero(tablero);
        rellenartablero(copiatablero);
        bomba(tablero,1,'B');
        mostrar(tablero);
     
        int bomba_explota=1;
        
         do{
            mostrar(copiatablero);
            System.out.println("Introduce la coordenada X");
            int coordX=sc.nextInt();
            System.out.println("Introduce la coordenada Y");
            int coordY=sc.nextInt();
            char letra= tablero[coordX][coordY];
            switch(letra){
                case ' ':
                    System.out.println("Vacio");
                    copiatablero[coordX][coordY]='O';
                    tablero[coordX][coordY]='O';
                    turnos--;
                    break;
                case 'B':
                    System.out.println("BOOM");
                    copiatablero[coordX][coordY]='B';
                    tablero[coordX][coordY]='T';
                    bomba_explota--;
                    break;
                
            }
            if (turnos==0){
                System.out.println("Has perdido :c");
                break;
            }

        }
        while(!(bomba_explota==0));
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
   public static void bomba (char[][]m, int tam, char letra){
        boolean condicion;
        int posX,posY;
        do{
        condicion=false;
        posX= (int)(Math.random()*3);
        posY= (int)(Math.random()*3);
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