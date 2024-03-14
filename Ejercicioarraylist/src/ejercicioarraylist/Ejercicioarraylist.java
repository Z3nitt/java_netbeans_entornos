/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioarraylist;

import java.util.ArrayList;

/**
 *
 * @author Medac
 */
public class Ejercicioarraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ArrayList de numeros
        ArrayList<Integer> numeros=new ArrayList<>(); //Asi se declara la lista, el primer <> es el tipo: String,Integer...
        System.out.println(numeros.size()); //Muestra el tamaño
        numeros.add(5); //Añade el numero 5
        numeros.add(3);
        numeros.add(8);
        System.out.println(numeros); //Muestra el contenido
        System.out.println(numeros.size()); //Muestra el tamaño
        numeros.add(1,4); //Mete en la posicion 1 el numero 4, primero posicion y luego numero a introducir
        System.out.println(numeros); //Muestra el contenido
        System.out.println(numeros.get(0)); //Muestra el numero en la posicion 0
        
        System.out.println(" ");
        System.out.println("|----------------------------------------------------------------------|"); //Nada relevante, es para separar
        System.out.println(" ");
        
        //ArrayList de nombres
        ArrayList<String> listanombres=new ArrayList<>();
        listanombres.add("Juan");
        listanombres.add("Sexo");
        listanombres.add("Wayimbo");
        listanombres.remove(1); //Borra el nombre en la posicion 1
        System.out.println(listanombres);
        
        //For each
        for(String nombre:listanombres){
            System.out.println(nombre);
        }
    }
    
}
