/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package creaciondefuncion;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Creaciondefuncion {

public static double media(double num1,double num2){
    double res= (num1+num2)/2;
    return res;
}




public static int potencia(int base,int exponente){
    int resultado =1;
    for (int i=1;i<=exponente;i++){
        resultado=resultado*base;
    }
        
    return resultado;
}

public static int factorial(int numero){
    int resultado1= 1;
    for (int a=numero;a>0;a--){
        resultado1=resultado1*a;
    }
    return resultado1;
}

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        double a=5,b=8;
        System.out.println(media(a,b));
        a=8;
        b=15;
        System.out.println(media (a,b));
        
        
        
        int base=5,exponente=2;
        System.out.println(potencia(base,exponente));
        
        
        System.out.println("Escribe un Nº para calcular su factorial.");
        int numero;
        numero= sc.nextInt();
        System.out.println("El Nº Factorial de " +numero+ " es " +factorial (numero));
    }
    
}
