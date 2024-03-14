/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5_serrano_leal_juanluis;

/**
 *
 * @author Medac
 */
public class Paciente {
    
    int id=0;
    String nombre;
    String primer_apellido;
    int edad;

    public Paciente(int id, String nombre, String primer_apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "ID: "+id+" NOMBRE Y APELLIDO: "+nombre+" "+primer_apellido;
    }
    
    
}
