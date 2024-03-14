/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domino;

/**
 *
 * @author Medac
 */
public class Ficha implements Comparable<Ficha>{
    int derecha;
    int izquierda;
    int peso;
    
    public Ficha(int izquierda, int derecha){
        if(izquierda==derecha){
            peso=izquierda+derecha+100;
        }
        else{
            peso=izquierda+derecha;
        }
    }
    

    @Override
    public String toString() {
        return "{"+izquierda+" : "+derecha+"]";
    }
    
    //Compara las fichas una por una y devuelve un valor "Oculto"
    @Override
    public int compareTo(Ficha f) {
        return (peso-f.peso);
    }
    
}
