
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
       Escribir una app que pida el año actual y el de nacimiento del usuario
        debe calcular su edad suponiendo que en el año en curso el usuario en curos ya ha cumplido años
        */
        
        System.out.println("Introduzca su fecha de nacimiento: " );
        Scanner año_nacimiento = new Scanner(System.in);
        int año_nacido = año_nacimiento.nextInt();
        System.out.println("Introduzca el año actual: " );
        Scanner año_act = new Scanner(System.in);
        int año_actual = año_act.nextInt();
        int edad_actual= (año_actual-año_nacido);
        System.out.println("La edad del usuario es: " + edad_actual);
        
        
    }
    
}
