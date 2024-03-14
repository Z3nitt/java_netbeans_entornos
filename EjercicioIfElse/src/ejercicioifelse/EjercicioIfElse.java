package ejercicioifelse;

import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class EjercicioIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner (System.in);
        System.out.println("Introduce el número");
        num= sc.nextInt();
        if (num%2==0){
            System.out.println("El número es par");
        }
        else{
            System.out.println("Es impar");
        }
        }
}
        
        
    

