/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sintonizadordigital_poo;

/**
 *
 * @author Medac
 */
public class SintonizadorDigital_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SintonizadorFM fm = new SintonizadorFM(90);
        fm.subir();
        fm.bajar();
        fm.subir();
        fm.mostrar();
    }
    
}
