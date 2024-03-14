package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {


    public static void main(String[] args) {
//        double radio, area, longitud;
        Scanner sc= new Scanner(System.in);
//        System.out.println("Introduza el radio del círculo: ");
//        radio= sc.nextDouble();
//        area= Math.PI*(radio*radio);
//        System.out.println("El area del círculo es: " +Math.round(area));
//        longitud= 2*Math.PI*radio;
//        System.out.println("La longitud del círculo es "+Math.round(longitud));
        
        int segundos, minutos, horas;
        System.out.println("Introduce los segundos: ");
        segundos=sc.nextInt();
        minutos= segundos/60;
        segundos %= 60; 
        horas= minutos/60;
        minutos %=60;
        System.out.println("La hora completa es: "+horas+(" horas ")+minutos+(" minutos ")+segundos+(" segundos"));
        
        
    }
    
}
