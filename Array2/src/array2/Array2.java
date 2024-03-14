/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        char a [] =new char[5];
//        Arrays.fill(a,'a');
//        System.out.println(Arrays.toString(a));
          Scanner sc= new Scanner (System.in);
          int num_tabla;
          int [] array1={1,2,3};
          System.out.println("Introduce el tamaño: ");
          num_tabla=sc.nextInt();
          int [] array2=new int[num_tabla];
          
          for (int i=0;i<num_tabla;i++){
              System.out.println("Introduce los numeros ");
              array2[i]=sc.nextInt();
          }
          //Es lo mismo que el chorro codigo de abajo
          System.out.println(Arrays.equals(array1,0,2,array2,0,2));
        
        
        
        
    }
//    public static boolean comparaArrays(int[]array1,int[]array2){
//        boolean aux=true;
//        for (int a=0;a<array1.length;a++){
//            if (array1[a]!=array2[a]){
//                aux=false;
//            }    
//        }
//        return aux;
//    }
    
    
}
