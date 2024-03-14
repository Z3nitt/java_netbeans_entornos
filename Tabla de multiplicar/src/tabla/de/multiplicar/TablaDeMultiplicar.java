/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabla.de.multiplicar;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class TablaDeMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int num_escrito;
        int a=1;
        do{
            System.out.println("Introduce un número entre 1 y 10.");
            num_escrito= sc.nextInt();
        }
        while (!(num_escrito>0 && num_escrito<11));
            while (a<11){
                System.out.print(num_escrito + "x" + a + "=" + (num_escrito*a)+" ");
                a++;
            }
//        System.out.println("Introduce un numero entre 1 y 10.");
//        num_escrito= sc.nextInt();
//        while (num_escrito>=1 || num_escrito<=10){
//            System.out.print("1*" + num_escrito + "=" +num_escrito*1);
//            num_escrito= sc.nextInt();
//            while (num_escrito<=1 || num_escrito>=10){
//                System.out.println("Introduce otro numero.");
//                num_escrito= sc.nextInt();
            }
        }
