/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doblefor;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class DobleFor {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
//        int contador=0;
//        for(int f=0;f<3;f++){
//            for(int c=0;c<3;c++){
//                contador++;
//                System.out.print(contador);
//            }
//            System.out.println("");
//            contador=0;
//        }
        for(int i=0;i<4;i++){
            for(int j=3;j>i;j--){
                System.out.print("*");
            }
            System.out.println("*");
        }
        
//     Ejercicio practicar   
//        *
//       ***
//      *****     
//     *******
        
        
        
    }
    
}
