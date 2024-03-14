/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.string;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class EjerciciosString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String texto4 = "hola ";
        String texto1 = "hola ";
        String texto2 = "que tal";
        String texto3 = texto1 + texto2;
        String texto5 = "SEXO";
        
        System.out.println(texto1);
        System.out.println(texto2);
        System.out.println(texto3);
        
        System.out.println(texto1.equals(texto4));//para comparar strings se usa equals NO==
        System.out.println(texto3.length());//longitud del texto
        System.out.println(texto1.indexOf('h')); //posicion donde esta la letra esa
        System.out.println(texto3.indexOf('a'));
        System.out.println(texto2.charAt(2));//te devuelve la letra depende de la posicion
        System.out.println(texto1.substring(0,3));//coge las palabras desde una posicion a otra
        System.out.println(texto1.toUpperCase());//todo mayuscula
        System.out.println(texto5.equalsIgnoreCase(texto5));
        
        System.out.println("Introduce la primera palabra");
        String palabra1=sc.nextLine();
        System.out.println("Introduce la segunda palabra");
        String palabra2=sc.nextLine();
        if(palabra1.length()>palabra2.length()){
            System.out.println("La palabra"+palabra1+" es mas larga que la palabra "+palabra2);
        }
        else{
            System.out.println("La palabra"+palabra2+" es mas larga que la palabra "+palabra1);
        }
        
    }
    
}
