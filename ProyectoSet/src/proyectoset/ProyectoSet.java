/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoset;

import java.util.*;

/**
 *
 * @author Medac
 */
public class ProyectoSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TEORIA: las LIST contienen elementos duplicados, SET no puede. ArrayList se usa para recorrer y
        //LinkedList se usa si vamos a borrar o añadir cosas dentro de la lista
        //HashSet el orden da igual, TreeSet orden segun un critero (peso,altura...), LinkedhashSet segun el orden de inserción
        
        
        HashSet<Integer>numeros=new HashSet<>();
        numeros.add(5);
        numeros.add(3);
        numeros.add(7);
        numeros.add(9);
        System.out.println(numeros);
        numeros.add(3);
        System.out.println(numeros);
        
        HashSet<String>nombres=new HashSet<>();
        nombres.add("Antonio");
        nombres.add("Berto");
        nombres.add("Cacas");
        nombres.add("Vicente");
        nombres.add("Jorge");
        System.out.println(nombres);
        
        //Iterator se usa para recorrer una lista (for 2.0)
        //Aqui creas un iterator String, lo igualas a nombre.iterator (El HashSet que hemos usao antes)
        Iterator<String> it=nombres.iterator();
        //Aqui hace un bucle y para cuando se queda sin nombres que recorrer (Llega al final de la lista)
        while(it.hasNext()){
            System.out.println("nombre es: " +it.next());
        }
        
        String prueba="pepe";
        //Aqui lo que hace es devolver true si la lista contiene el nombre pepe y si no pues devuelve false
        System.out.println(nombres.contains(prueba));
        
        
        HashSet<Integer>conjunto1=new HashSet<>();
        
        conjunto1.add(3);
        conjunto1.add(5);
        conjunto1.add(7);
        //Si el conjunto tiene numeros del 1 al 10 los muestra
        for(int i=1;i<=10;i++){
            if (conjunto1.contains(i)){
                System.out.println("El conjunto contiene: "+i);
            }
        }
        
        
        
        HashSet<Persona>personas=new HashSet<>();
//        personas.add(new Persona("Pepe","777",18));
//        personas.add(new Persona("Juan","111",20));
        Persona p1 = new Persona("Elena","77",30);
        Persona p2 = new Persona("Elena","77",30);
//        personas.add(p1);
//        System.out.println(personas);
        personas.add(p1);
        personas.add(p2);
        System.out.println(personas);
        System.out.println(personas.contains(p1));
        System.out.println(personas.hashCode());
        
        
        
        
        
        
    }
    
}
