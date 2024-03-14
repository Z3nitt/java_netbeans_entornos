/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioswhiled;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class EjerciciosWhileD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int min_rango,max_rango,num_escrito;
        System.out.println("Introduce un valor mínimo.");
        min_rango=sc.nextInt();
        System.out.println("Introduce un valor máximo.");
        max_rango=sc.nextInt();
        do{
            System.out.println("Introduce un numero dentro del rango que previamente has definido.");
            num_escrito=sc.nextInt();
        }
        while (num_escrito>=min_rango && num_escrito<=max_rango);
        System.out.println("Ese número no está en el rango entre " + min_rango + " y " + max_rango+".");
    }
    
}
