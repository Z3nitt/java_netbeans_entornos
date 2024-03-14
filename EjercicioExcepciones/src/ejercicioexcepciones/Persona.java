/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioexcepciones;

/**
 *
 * @author Medac
 */
public class Persona {
    //atributos
    int edad;
    String nombre;
    double dinero;

    public Persona(int edad, String nombre, double dinero) {
        this.edad = edad;
        this.nombre = nombre;
        this.dinero = dinero;
    }
    
    
    public void sacarDinero(double dinero) throws SaldoNegativo{
        dinero=this.dinero-dinero;
        if(dinero<0){
            throw new SaldoNegativo();
        }
        
        
        
    }
    
    public void meterDinero(double dinero){
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + ", dinero=" + dinero + '}';
    }
    
    
    
}
