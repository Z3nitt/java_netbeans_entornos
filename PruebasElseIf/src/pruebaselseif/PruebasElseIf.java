package pruebaselseif;

import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class PruebasElseIf {
    public static void main(String[] args) {
//        int num1;
//        int num2;
        
        Scanner sc= new Scanner (System.in);
//        System.out.println("Introduce dos numero y compararé si son iguales. Introduce el primer número");
//        num1= sc.nextInt();
//        System.out.println("Introduce el segundo número.");
//        num2= sc.nextInt();
//        if (num1==num2){
//            System.out.println("Los numeros son iguales");
//            
//        }
//        else{
//            System.out.println("Son distintos");
//            if (num12>num21){
//                System.out.println("El numero: " +num1 + " es mayor que " + num2);
//            }
//            System.out.println("El numero: " +num2+ " es mayor que " + num1);
//        }
        
        int num1;
        int num2;
        int num3;
        
        System.out.println("Escribe 3 numeros y los ordenaré de mayor a menor");
        System.out.println("Escribe el primer numero.");
        num1= sc.nextInt();
        System.out.println("Escribe el segundo número.");
        num2= sc.nextInt();
        System.out.println("Escribe el tercer número.");
        num3= sc.nextInt();
        
        if (num1>num2 && num3<num1){
            System.out.println("El orden es: "+num1+ " > "+ num2+ " > " + num3);
        }
        else if (num1<num2 && num3<num1){
                System.out.println("El orden es: "+num2+ " > "+ num1+ " > " + num3);
            }
        else if (num1<num2 && num3>num1){
                System.out.println("El orden es: "+num3+ " > "+ num2+ " > " + num1);
            }
        else if (num1>num2 && num3<num1){
                System.out.println("El orden es: "+num1+ " > "+ num3+ " > " + num2);
            }
        else if (num1<num2 && num3>num1){
                System.out.println("El orden es: "+num2+ " > "+ num3+ " > " + num1);
            }
        else if (num1>num2 && num3>num1){
                System.out.println("El orden es: "+num3+ " > "+ num1+ " > " + num2);
            }
        else if (num1==6 && num2==6 && num3==6){
                System.out.println("Joder, el anticristo");
            }
        else if (num1==7 && num2==7 && num3==7){
                System.out.println("Hola a todos guapisimos aqui vegetta777...");
            }
        else if (num1==num2 && num3==num1){
                System.out.println("Los tres numeros son iguales.");
            }
        else if (num1==num2 || num3==num1 || num2==num3){
                System.out.println("Dos de los tres numeros son iguales, no puedo ordenarlos.");
            }
            
        }
        
        
        
        
    }
  
