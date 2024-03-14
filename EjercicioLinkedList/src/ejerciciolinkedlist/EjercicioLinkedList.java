/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciolinkedlist;

import java.util.ArrayList;

//esto es pa ordenar
import java.util.Collections;
import java.util.LinkedList;



/**
 *
 * @author Medac
 */
public class EjercicioLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList <String> arrayLink= new LinkedList<>();
        
        arrayLink.add("Skeler");
        arrayLink.add("Wayimbo");
        arrayLink.addLast("Poronga");
        arrayLink.add(1,"Patata");
        arrayLink.remove(0);
        arrayLink.addFirst("Sexo");
        System.out.println(arrayLink);
        
        ArrayList<Persona>personas= new ArrayList<>();
        personas.add(new Persona("Sexo",18));
        personas.add(new Persona("OrtitoRico",69));
        personas.add(new Persona());
        personas.add(new Persona("Skeler",22));
        System.out.println(personas);
        
        //Lo primero es poner el tipo del que sea lo que queramos recorrer, en este caso es una clase, luego una letra inventada
        //y por ultimo el nombre del arrayList que hemos creao
        
        for(Persona p:personas){
            if(p.getNombre()==null){
                p.setNombre("Croqueta");
                p.setEdad(55);
            }
        }
        
        System.out.println(personas);
        
        ArrayList<Integer>numeros=new ArrayList<>();
        numeros.add(7);
        numeros.add(2);
        numeros.add(3);
        System.out.println(numeros);
        
        //Esto es para ordenar numeros
        Collections.sort(numeros);
        System.out.println(numeros);
        
        Collections.shuffle(numeros);
        System.out.println(numeros);
        
        //ORDENAR PERSONAS
        Collections.sort(personas);
        System.out.println(personas);
        
        
        
        
        
    }
    
}
