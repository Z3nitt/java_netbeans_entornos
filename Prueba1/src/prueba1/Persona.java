/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1;

/**
 *
 * @author Medac
 */
public class Persona {
    String nombre;
    int edad;
    static int id = 0;
    
    public Persona(String nombre, int edad){
    this.nombre=nombre;
    this.edad=edad;
    id++;
    }
    
    Persona (Persona persona){
    nombre=persona.nombre;
    edad=persona.edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }   

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Persona.id = id;
    }
    
}
