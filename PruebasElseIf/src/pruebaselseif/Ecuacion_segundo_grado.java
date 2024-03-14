package pruebaselseif;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Ecuacion_segundo_grado {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        double a, b, c, aux;
        double x1, x2;
        System.out.println("Bienvenido a la calculadora de ecuaciones de segundo grado");
        System.out.println("Introduzca al valor de aX2");
        a= sc.nextDouble();
        System.out.println("Introduzca el valor de bX");
        b= sc.nextDouble();
        System.out.println("Introduzca el valor de c");
        c= sc.nextDouble();
        
        aux= b*b-4*a*c;
        if (aux<0){
            System.out.println("No se puede resolver la ecuación. La raíz es negativa.");
        }
        
        else{
            x1= (-b+Math.sqrt(aux))/(2*a);
            x2= (-b-Math.sqrt(aux))/(2*a);
            System.out.println("El valor de es x1: " + x1 + "y el valor de x2 es: "+ x2);
            
        }
            
            
            
            
            
            
            
            
            
        }
    
}
