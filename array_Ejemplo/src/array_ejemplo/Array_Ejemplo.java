
package array_ejemplo;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Array_Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
//        int [] array={5,3,2,1,7};
//        char [] letras={'a','b','c'};
//        int [] array2=new int[5];
//        array2[0]=2;
//        array2[1]=3;
//        array2[2]=4;
//        System.out.println(array2[0]+","+array2[1]+","+array2[2]);
        int [] array=new int [4];
        //rellena con el teclado
        for (int i=0;i<4;i++){
            System.out.println("Introduce el valor");
            array[i]=sc.nextInt();  
        }
        //mostrar en consola
        for (int i=0;i<4;i++){
            System.out.print("Valor escrito: ");
            System.out.println(array[i]);  
        }
    }
    
}
