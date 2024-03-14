/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrolotr;

/**
 *
 * @author Medac
 */
public class Jugador {
    //Atributos
    
    protected int vida;
    protected int ataque;
    protected boolean vivo;
    
    protected Carta[]cartas;
    
    //Constructor
    public Jugador(){
        vivo=true;
        cartas=new Carta[100];
    }
    
    public void robarCarta(Carta carta){
        for(int i=0;i<cartas.length;i++){
            if(cartas[i]==null){
                cartas[i]=carta;
                break;
            }
        }
    }
    
    public void verCartas(){
        for (int i = 0; i < cartas.length; i++){
            if(cartas[i]!=null){
                System.out.println(cartas[i] +" Posición: "+ i);
            }
        }
    }
    
    public void usarCarta(int posCarta){
        vida=vida+cartas[posCarta].getVida();
        ataque=ataque+cartas[posCarta].getAtaque();
    }

    //Metodos

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

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Vida: "+vida;
    }

    
    

}
