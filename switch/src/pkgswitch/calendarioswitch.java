package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class calendarioswitch {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
//        int num;
//        int nota;
//        System.out.println("Introduce un numero del 1 al 7 para ver un dia de la semana.");
//        num= sc.nextInt();
//        
//        switch (num){
//            case 1:
//                System.out.println("Lunes");
//                break;
//            case 2:
//                System.out.println("Martes");
//                break;
//            case 3:
//                System.out.println("Miercoles");
//                break;    
//            case 4:
//                System.out.println("Jueves");
//                break;    
//            case 5:
//                System.out.println("Viernes");
//                break;    
//            case 6:
//                System.out.println("Sabado");
//                break;    
//            case 7:
//                System.out.println("Domingo");
//                break;    
//            default:
//                System.out.println("El número introducido no es valido");
//                break;        
//        }
//        System.out.println("Introduce un numero del 1 al 10 para ver tu nota.");
//        nota= sc.nextInt();
//        switch (nota){
//            case 0,1,2,3,4:
//                System.out.println("Insuficiente");
//                break;
//            case 5:
//                System.out.println("Suficiente");
//                break;
//            case 6:
//                System.out.println("Bien");
//                break;
//            case 7,8:
//                System.out.println("Notable");
//                break;
//            case 9, 10:
//                System.out.println("Sobresaliente");
//                break;
//            default:
//                System.out.println("El número no es correcto");
//                break;
//        }
        
        
        char semana;
        System.out.println("Introduce una letra para ver un dia de la semana.");
        semana= sc.next().charAt(0);
        switch (semana){
            case 'l':
                System.out.println("Lunes");
                break;
            case 'm':
                System.out.println("Martes");
                break;
            case 'x':
                System.out.println("Miercoles");
                break;    
            case 'j':
                System.out.println("Jueves");
                break;    
            case 'v':
                System.out.println("Viernes");
                break;    
            case 's':
                System.out.println("Sabado");
                break;    
            case 'd':
                System.out.println("Domingo");
                break;    
            default:
                System.out.println("El número introducido no es valido");
                break;        
        }
        
        
 
    }    
    
    
    
    
    
}
