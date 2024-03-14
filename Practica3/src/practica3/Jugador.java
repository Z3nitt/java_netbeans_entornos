/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 *
 * @author Medac
 */
public class Jugador {
    private String nombre;
    private String posicion;
    private double precio;

    public Jugador(String nombre, String posicion, double precio) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    @Override public String toString(){
        return " Nombre: " + nombre + '\n' +" Posición: " + posicion + '\n' + "Precio: " + precio +'\n' + " ";
    }
    
    
    
    
    
}
