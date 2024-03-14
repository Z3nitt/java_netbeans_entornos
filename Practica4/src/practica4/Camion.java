/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 practicavehiculo */
package practica4;

/**
 *
 * @author Medac
 */
public class Camion extends Vehiculo{

    public Camion() {
        super();
        velocidad=1;
        nombre="Camion";
        vida=3;
    }
    @Override
    public void info(){
        System.out.println("Este vehículo es tiene mucha salud pero poca velocidad.");
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
        return "Camion: " + " Velocidad: "+velocidad+" Salud: "+vida;
    }
}
