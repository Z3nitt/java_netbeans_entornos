/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlexcepciones;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class ControlExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
//        int b=0;
//        int a=5;
//        
//        try{
//            System.out.println(a/b);
//            System.out.println("Entrando por el final del try");
//        }
//        catch(ArithmeticException e){
//            System.out.println("No se puede dividir entre 0");
//        }
//        System.out.println("Saliendo del programa");
        
        int num;
        int[]array={2,3,7};
        System.out.println("Introduce un número");
//        try{
//            num=sc.nextInt();
//            System.out.println(array[num]/num);
//            System.out.println("final del try");
//        }
//        catch(ArithmeticException e1){
//            System.out.println("error por dividir entre 0");
//        }
//        catch(ArrayIndexOutOfBoundsException e2){
//            System.out.println("error tamaño array");
//        }
//        catch(Exception e3){
//            System.out.println(e3.toString());
//        }
//        finally{
//            System.out.println("Entrando en el finally");
//        }
//            try{
//                division(array);
//            }
//            catch(ArithmeticException e){
//                System.out.println("por dividir");
//            }
//            catch(ArrayIndexOutOfBoundsException e1){
//                System.out.println("Por pasarse del array");
//            }
        
        int edad=17;
        
        if(edad<18){
            throw new EdadException();
        }
        

        
    }

    public static void division(int[]array) throws ArithmeticException{
        Scanner sc= new Scanner (System.in);
        int num=sc.nextInt();
        System.out.println(array[num]/num);
        
            System.out.println("error por division");
        if(num>2){
            throw new ArrayIndexOutOfBoundsException();
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
