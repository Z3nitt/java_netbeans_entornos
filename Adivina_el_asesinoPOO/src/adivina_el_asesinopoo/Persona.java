/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adivina_el_asesinopoo;

/**
 *
 * @author Medac
 */
public class Persona {
    String nombre;
    String lugar;
    boolean asesino;

    public Persona(String nombre, String lugar) {
        this.nombre = nombre;
        this.lugar = lugar;
    }
    
    public String donde_estaba(){
        if(asesino){
        String [] lugares={"hall","dormitorio","jardin","cocina","salon","baño"}; 
        int pos=(int)(Math.random()*6);
        lugar=lugares[pos];
       
        }
        return lugar;
    }
    
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public boolean isAsesino() {
        return asesino;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setAsesino(boolean asesino) {
        this.asesino = asesino;
    }
    

    
    
    
    
    
    
}
