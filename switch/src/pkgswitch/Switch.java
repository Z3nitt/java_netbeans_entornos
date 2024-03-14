package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int nota;
        nota= sc.nextInt();
       
       switch(nota){
           case 0:
               System.out.println("Cero");
               break;
           case 1:
               System.out.println("Uno");
               break;
           case 2:
               System.out.println("Dos");
               break;
           default:
               System.out.println("pene");
               break;
       } 
        
        
        
    }
    
}
