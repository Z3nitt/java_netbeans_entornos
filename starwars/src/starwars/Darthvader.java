/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starwars;

/**
 *
 * @author Medac
 */
public class Darthvader {
    protected boolean lado_oscuro;
    protected int habilidad_pilotar;
    protected int habilidad_espadalaser;
    protected int habilidad_poderfuerza;
    protected int habilidad_convencer;
    
    public Darthvader(){
    lado_oscuro=true;
    habilidad_pilotar=5;
    habilidad_espadalaser=5;
    habilidad_poderfuerza=5;
    habilidad_convencer=4;
    }
    
    public void hablar(){
        System.out.println("Hola, soy tu papasito.");
    }
    
    
}
