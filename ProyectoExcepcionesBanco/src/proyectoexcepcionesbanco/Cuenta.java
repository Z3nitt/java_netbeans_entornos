/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoexcepcionesbanco;

/**
 *
 * @author Medac
 */
public class Cuenta {
    //Atributos
    String nombre;
    int numero;
    double saldo;
    
    //Constructores
    public Cuenta(String nombre, int numero, double saldo) throws SaldoInsuficienteException{
        if (saldo<0){
            throw new SaldoInsuficienteException("saldo inicial negativo");
        }
    

        else{
            this.nombre = nombre;
            this.numero = numero;
            this.saldo = saldo;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", numero=" + numero + ", saldo=" + saldo + '}';
    }
    
    //Metodos
    
    public void movimiento(double valor)throws SaldoInsuficienteException{
        if(saldo+valor <0){
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
        saldo=+valor;
    }
    
}
