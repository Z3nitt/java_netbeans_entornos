/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casinopoo;

/**
 *
 * @author Medac
 */
public class Jugador {
    
    private String nombre;
    private String dni;
    private int fichas;
    private int edad;
    
    public Jugador(String nombre, String dni, int fichas, int edad){
        this.nombre= nombre;
        this.dni=dni;
        this.fichas=fichas;
        this.edad=edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFichas() {
        return fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override public String toString(){
        return " Nombre: " + nombre + '\n' +" Dni: " + dni + '\n' + " Fichas: " + fichas + '\n' + "edad" + edad;
    }
    
    
    
    
    
    
    
}
