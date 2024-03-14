/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplofor;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class EjemploFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int num;
        System.out.println("patata");
        num= sc.nextInt();
        for (int i= 1; i<11; i++){
            System.out.print(num +"*"+i+"="+(num*i)+" ");
    }
    }

    
}
