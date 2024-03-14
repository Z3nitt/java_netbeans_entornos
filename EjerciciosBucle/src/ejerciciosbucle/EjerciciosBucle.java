/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosbucle;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class EjerciciosBucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner (System.in);
        System.out.println("Introduce un número");
        num= sc.nextInt();
        while (num!=0){
            if (num%2==0){
                System.out.println("Es par");
            }
            else{
                System.out.println("Es impar");
            }
            System.out.println("El 0 no es válido");
            num= sc.nextInt();
        }

        
        
    }
    
}
