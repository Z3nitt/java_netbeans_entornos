/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocoches;

/**
 *
 * @author Medac
 */
public abstract class Vehiculo {
    String nombre;
    int posx;
    int posy;

    public Vehiculo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }
    
    public abstract void avanzar();
    
    public abstract void retroceder();

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
