/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicavehiculos;

/**
 *
 * @author Medac
 */
public abstract class Vehiculo {
    String nombre;
    int velocidad;
    int vida;

    public Vehiculo() {
        velocidad=1;
        vida=3;
    }
    
    public void info(){
        System.out.println("Vehiculo por defecto con los puntos de caracteristica al minimo.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "nombre=" + nombre + ", velocidad=" + velocidad + ", vida=" + vida + '}';
    }
    
    
    
}
