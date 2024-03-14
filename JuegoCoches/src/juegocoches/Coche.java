/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocoches;

/**
 *
 * @author Medac
 */
public class Coche extends Vehiculo{
    
    public Coche() {
        super();
        nombre="coche";
        posx=0;
        posy=0;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    @Override
    public void avanzar() {
        posy=posy+3;
        if(posy>9){
            posy=9;
        }
    }

    @Override
    public void retroceder() {
        if(posy-3>0){
            posy=0;
        }
        else{
            posy=posy-3;
        }
    }
    
    
}
