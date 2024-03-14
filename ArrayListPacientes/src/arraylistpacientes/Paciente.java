/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylistpacientes;

/**
 *
 * @author Medac
 */
public class Paciente implements Comparable<Paciente>{
    int id;
    String nombre;
    int edad;

    public Paciente() {
    }

    public Paciente(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public int compareTo(Paciente p){
        return(edad-p.edad);
    }

    @Override
    public String toString() {
        return "|________________DATOS DEL PACIENTE________________|"+'\n'+"Id: "+id+'\n'+"Nombre: "+nombre+'\n'+"Edad: "+edad+'\n'+"|________________--------------------________________|"+'\n'+"    "+'\n';
    }
    
    
}
