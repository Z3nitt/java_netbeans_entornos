/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba1;

/**
 *
 * @author Medac
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Antonio",17);
        Persona p2 = new Persona(p1);
        
        p1.setNombre("Pepe");
        System.out.println(p2.getNombre());
        System.out.println(p1.getNombre());
        
    }
    
}
