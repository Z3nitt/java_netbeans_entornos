/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz_con_array;
import java.util.Arrays;
/**
 *
 * @author Medac
 */
public class Matriz_con_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //primer numero FILA y segundo COLUMNA
        int [][] matriz=new int [3][3];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                //numero de la matriz
                matriz[i][j]=3;
            }
        }
        //mostrar
        for(int fila=0;fila<matriz.length;fila++){
            System.out.println(Arrays.toString(matriz[fila]));
        }
        
        
        //matriz letras
        char [][] matriz3=new char [3][4];
        for(int i=0;i<matriz3.length;i++){
            for(int j=0;j<matriz3[0].length;j++){
                matriz3[i][j]=3;
            }
        }
        for(int fila=0;fila<matriz.length;fila++){
            System.out.println(Arrays.toString(matriz3[fila]));
        }
        
        
        

        int[][] matriz2={{3,3},{4,5},{6,7}};
            for(int i=0;i<matriz2.length;i++){
                System.out.println(Arrays.toString(matriz2[i]));
            }
        mostrar(matriz2);
        
        
    }
    //mostrarArray es el nombre de la variable, a es el array
    public static void mostrar(int [][]a){
        for(int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }
}
}
