package evaluador;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Evaluador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int num;
        System.out.println("Introduce un numero para evaluar.");
        num= sc.nextInt();
        if (num<5){
            System.out.println("Tu nota es un Insuficiente.");
        }
        else if (num==5){
            System.out.println("Tu nota es un Suficiente.");
        }
        else if (num==6){
            System.out.println("Tu nota es un Bien.");
        }
        else if (num==7 || num==8){
            System.out.println("Tu nota es un Notable.");
        }
        else if (num==9 || num==10){
            System.out.println("Tu nota es un Sobresaliente.");
        }
        else {
            System.out.println("El número introducido no es correcto, prueba otra vez.");
        }
    }
    
}
