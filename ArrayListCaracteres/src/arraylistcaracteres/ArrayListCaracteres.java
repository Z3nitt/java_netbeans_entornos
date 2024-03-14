/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistcaracteres;

import java.util.*;
/**
 *
 * @author Medac
 */
public class ArrayListCaracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creas arraylist para el primer texto
        ArrayList<Character>texto1= new ArrayList<>();
        Scanner sc= new Scanner (System.in);
        System.out.println("Introduce el primer texto: ");
        String palabra=sc.next();
        
        //Recorres la palabra y la conviertes a char dentro del array list
        for(int i=0;i<palabra.length();i++){
            texto1.add(palabra.charAt(i));
        }
        
        //Repito los pasos de antes creando un nuevo arraylist para la palabra 2
        ArrayList<Character>texto2= new ArrayList<>();
        System.out.println("Introduce el segundo texto: ");
        String palabra2=sc.next();
        
        for(int i=0;i<palabra2.length();i++){
            texto2.add(palabra2.charAt(i));
        }
        
        texto1.addAll(texto2);
        System.out.println(texto1);
        
    }
    
}
