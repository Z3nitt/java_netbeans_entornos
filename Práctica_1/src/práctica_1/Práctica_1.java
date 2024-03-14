/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package práctica_1;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Práctica_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 1
        Scanner sc= new Scanner (System.in);
        char inicial;
        int edad;
        int jubilacion=65;
        System.out.println("Introduzca la inicial de su nombre.");
        inicial= sc.next().charAt(0);
        System.out.println("Introduzca su edad.");
        edad= sc.nextInt();
        jubilacion= jubilacion-edad;
        if (edad>=18 && edad<=65) {
            System.out.println("Para su jubilación quedan " + jubilacion);
            }
        else if (edad>65){
            System.out.println("Usted lleva "+ (edad-65)+ " años jubilado.");
                }
        else if (edad<18) {
            System.out.println("Usted no es mayor de edad Sr. "+inicial);
        }
        
        //Ejercicio 2
        double euros;
        //En caso de cambie el valor del dolar cambiar este valor.
        double dolares=1.16;
        System.out.println("Introduzca los euros a convertir." );
        euros= sc.nextDouble();
        dolares= dolares*euros;
        System.out.println(euros+ " Euros equivalen a "+ dolares + " dólares americanos.");
        
        //Ejercicio 3
        int num=3;
        int resultado=1;
        while (num<100){
            System.out.print(num+ " , ");
            num=num+3;
        }
        for (int a=3; a<99; a=a+3){
        resultado= resultado+a;
        }
            System.out.println("resultado = " + resultado);
        
        //Ejercicio 4
        int notas=0;
        int nota_inicial=1;
        int suspenso=0;
        int aprobado=0;
        int notable=0;
        int sobresaliente=0;
        while (nota_inicial<11){
            System.out.println("Introduce una nota");
            notas= sc.nextInt();
            switch(notas){
                case 0:
                    suspenso++;
                    break;
                case 1:
                    suspenso++;
                    break;
                case 2:
                    suspenso++;
                    break;
                case 3:
                    suspenso++;
                    break;
                case 4:
                    suspenso++;
                    break;
                case 5:
                    aprobado++;
                    break;
                case 6:
                    aprobado++;
                    break;
                case 7:
                    notable++;
                    break;
                case 8:
                    notable++;
                    break;
                case 9:
                    sobresaliente++;
                    break;
                case 10:
                    sobresaliente++;
                    break;
                default:
                    System.out.println("Ese numero no está comprendido entre el 1  el 10.");
                    break;
            }  
            nota_inicial=nota_inicial+1;
        }
        System.out.println("En las notas introducidas hay "+suspenso+" suspensos, "+aprobado+" aprobados, "+notable+" notables y "+sobresaliente+" sobresalientes.");


        //Ejercicio 5
        char producto,respuesta;
        float precio;
        
        do{
        System.out.println("Introduzca la inicial del producto.");
        producto= sc.next().charAt(0);
        System.out.println("Introduzca el precio del producto.");
        precio= sc.nextFloat();
        System.out.println("Supermercado Estoy Enmayao");
        System.out.println("----------");
        System.out.println("Producto "+producto);
        System.out.println("Precio " +precio+ " €");
        
        System.out.println("¿Desea introducir mas productos?");
        respuesta= sc.next().charAt(0);
        }
        while (respuesta=='s');
        while (respuesta!='s' && respuesta!='n'){
        System.out.println("Introduzca la inicial del producto.");
        producto= sc.next().charAt(0);
        System.out.println("Introduzca el precio del producto.");
        precio= sc.nextFloat();
        System.out.println("Supermercado Estoy Enmayao");
        System.out.println("----------");
        System.out.println("Producto "+producto);
        System.out.println("Precio " +precio+ " €");
        
        System.out.println("¿Desea introducir mas productos?");
        respuesta= sc.next().charAt(0);
        }
        
        
        if (respuesta=='n'){
            System.out.println("Cerrando programa...");
        }
        
        
        
        
        
        
        
        
        
    }
    
}
