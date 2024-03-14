package segundo.gradoe.ecuacion;
import java.util.Scanner;
/**
 *
 * @author Juanlu
 */
public class SegundoGradoeEcuacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b,c,aux,x1,x2;
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora de ecuaciones de segundo grado.");
        System.out.println("Introduzca el valor de aX2");
        a= input.nextDouble();
        System.out.println("Introduzca el valor de bX");
        b= input.nextDouble();
        System.out.println("Introduzca el valor de c");
        c= input.nextDouble();
        
        aux= b*b-4*a*c;
        if (aux<0){
            System.out.println("No se ha podido calcular la ecuación, ya que la raiz es negativa.");
        
        }
        else{
            x1= (-b+Math.sqrt(aux))/(2*a);
            x2= (-b-Math.sqrt(aux))/(2*a);
            System.out.println("El resultado de x1 es: " + x1 + "y el resultado de x2 es: " + x2);
        }
    
    }
    
}
