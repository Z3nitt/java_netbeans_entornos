package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        //Uso del scanner
        System.out.println("Bienvenido a la calculadora de Indice de masa corporal");
        float altura, peso, imc;
        /*Scanner sc es una variable, solo se escribe una vez, si hay que hacer mas de 1
        ejercicio por proyecto añadir numoero. EJ: Scanner sc... Scanner sc1...
        */
        Scanner sc= new Scanner (System.in);
        System.out.println("Introduzca su Altura en metros");
        altura= sc.nextFloat();
        System.out.println("Introduzca su peso en Kg");
        peso= sc.nextFloat();
        imc= peso/(altura*altura);
        System.out.println("Su Indice de masa corporal es: " +imc);
        System.out.println("Si su IMC se encuentra entre 18,5 y 24,9, se considera en peso saludable.");
        
        //Redondeador de numeros
        double real;
        Scanner sc1= new Scanner (System.in);
        System.out.println("Introduzca un numero para el redondeo automático: ");
        real= sc1.nextDouble();
        int redondeo;
        real= real+0.5;
        redondeo= (int)real;
        System.out.println("Su numero redondeado es: " +redondeo);
        
        
        
    }    
}
