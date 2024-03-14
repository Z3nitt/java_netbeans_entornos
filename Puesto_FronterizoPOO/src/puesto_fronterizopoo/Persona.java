/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puesto_fronterizopoo;

/**
 *
 * @author Medac
 */
public class Persona {
    private String nombre;
    private String dni;
    private String apellido;
    
    public Persona(String nombre, String dni, String apellido){
        this.nombre= nombre;
        this.dni=dni;
        this.apellido=apellido;
    }
    
    public String getNombre (){
        return nombre;
    }
    
    public String getApellido (){
        return apellido;
    }
    
    public String getDni (){
        return dni;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDni(String dni){
        this.dni=dni;    
    }
    
    public void setApellido(String apellido){
        this.apellido=apellido;    
    }
    
    @Override public String toString(){
        return " Nombre: " + nombre + '\n' +" Apellido: " + apellido + '\n' + " Dni: " + dni;
    }
    
    
    
    
    
    
}
