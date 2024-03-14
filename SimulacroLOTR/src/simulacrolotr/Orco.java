/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrolotr;

/**
 *
 * @author Medac
 */
public class Orco {
    
    protected int vida;
    protected int ataque;
    
    public Orco(){
        vida=50;
        ataque=10;
    }
    
    public Orco(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    

    @Override
    public String toString() {
        return "Orco{" + "vida=" + vida + '}';
    }
    
    
}
