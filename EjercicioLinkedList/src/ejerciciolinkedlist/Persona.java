/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciolinkedlist;

/**
 *
 * @author Medac
 */
public class Persona implements Comparable<Persona>{
    String nombre;
    int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    

    @Override
    public String toString() {
        return "nombre: "+nombre+" edad: "+edad;
    }
    
    //Esto es para ordenar personas, lo primero es arriba meter el comparable y eso
    //luego haces esto y en return pones por el parametro que los quieres ordenar
    @Override
    public int compareTo(Persona p){
        return(edad-p.edad);
    }
    
    
}
