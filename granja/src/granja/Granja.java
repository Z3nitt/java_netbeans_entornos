/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package granja;

/**
 *
 * @author Medac
 */
public class Granja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro p = new Perro();
        Gato g = new Gato();
        
        p.comer();
        p.dormir();
        g.comer();
        g.dormir();
        
        Animal[] array={p,g};
    }
    
}
