/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicavehiculo;

/**
 *
 * @author Medac
 */
public class Moto extends Vehiculo{

    public Moto() {
        super();
        velocidad=3;
        nombre="Moto";
        vida=1;
    }
    
    @Override
    public void info(){
        System.out.println("Este vehículo tiene mucha velocidad pero poca salud.");
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
        return "Moto: " + " Velocidad: "+velocidad+" Salud: "+vida;
    }
    
    
}
