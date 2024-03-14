/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motel;

/**
 *
 * @author Medac
 */
public class Huesped {
    private String nombre;
    private int num_noches;

    public Huesped(String nombre, int num_noches) {
        this.nombre = nombre;
        this.num_noches = num_noches;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNum_noches() {
        return num_noches;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNum_noches(int num_noches) {
        this.num_noches = num_noches;
    }
    
    
    @Override public String toString(){
        return " Nombre: " + nombre + '\n' +" Nº noches: " + num_noches;
    }
    
    
    
    
}
