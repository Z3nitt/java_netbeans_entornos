/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starwars;

/**
 *
 * @author Medac
 */
public class Starwars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Darthvader dv = new Darthvader();
        Luke lk = new Luke();
        Leia la = new Leia();
        Kyloren kr = new Kyloren();
        
        dv.hablar();
        lk.hablar();
        la.hablar();
        la.volar_espacio();
        kr.hablar();
    }
    
}
