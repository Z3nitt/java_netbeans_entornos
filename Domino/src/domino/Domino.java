/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package domino;

import java.util.*;
/**
 *
 * @author Medac
 */
public class Domino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        LinkedList<Ficha>lista= new LinkedList<>();
        LinkedList<Ficha>jug1= new LinkedList<>();
        LinkedList<Ficha>jug2= new LinkedList<>();
        
        //Con esto creamos las fichas y las metemos en el array de lista, el segundo for hace que las fichas no
        //se repitan gracias al j<=i, ya que cuando i=2 crea la ficha 2/0,2/1 y 2/2
        for(int i=0;i<7;i++){
            for(int j=0;j<=i;j++){
                lista.add(new Ficha(i,j));
            }
        }
        
        //Esto desordena las fichas
        Collections.shuffle(lista);
        
        //Esto entrega las fichas a los LinkedList de jugadores y elimina de la LinkedList principal 
        //las fichas ya repartidas, para eso es el pollFirst
        for(int i=0;i<7;i++){
            jug1.add(lista.pollFirst());
            jug2.add(lista.pollFirst());
        }
        
        //Esto ordena las fichas mirando el valor que devuelve el compareTo de la clase Ficha
        Collections.sort(jug1);
        Collections.sort(jug2);
        
        //TEORIA: las LIST contienen elementos duplicados, SET no puede. ArrayList se usa para recorrer y
        //LinkedList se usa si vamos a borrar o añadir cosas dentro de la lista
        //HashSet el orden da igual, TreeSet orden segun un critero (peso,altura...), LinkedhashSet segun el orden de inserción
        
        
        
        
    }
    
}
