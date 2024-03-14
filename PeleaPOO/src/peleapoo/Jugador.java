/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peleapoo;

/**
 *
 * @author Medac
 */
public class Jugador {
    
    private int vida;
    private String nombre;
    
    
    public Jugador(){
        
    }
    public Jugador(String nombre){
        this.nombre=nombre;
        vida=5;
    }
    
    public String getNombre (){
        return nombre;
    }
    
    public int getVida (){
        return vida;
    }
    
    public void luchar(Jugador jugador){
        int v = jugador.getVida();
        jugador.setVida(v-1);
        
    }
    public void setVida(int vida){
        this.vida=vida;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
        
    }
    
    @Override public String toString(){
        return nombre + " con " + vida + " vidas";
    }
    
}
