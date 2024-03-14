/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granja;

/**
 *
 * @author Medac
 */
public abstract class Animal {
    int patas;
    String nombre;

    public int getPatas() {
        return patas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void comer();
    public abstract void dormir();
    
    public void prueba(){
        System.out.println("Hola");
    }
    
}
