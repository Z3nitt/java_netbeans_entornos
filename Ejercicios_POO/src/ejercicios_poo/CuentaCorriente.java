/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_poo;

/**
 *
 * @author Medac
 */
public class CuentaCorriente {
    //private String nombre;
    //private String dni;
    private double saldo;
    private double limite;
    Persona persona;
    
    
    
//    CuentaCorriente(String nombre, String dni){
//        this.nombre=nombre;
//        this.dni=dni;
//        saldo=0.0;
//        limite=-50.0;
//    }
    
    CuentaCorriente(Persona persona, double saldo, double limite){
        this.persona=persona;
        this.saldo=saldo;
        this.limite=limite;
    }
//    public CuentaCorriente(double saldo){
//        this.saldo=saldo;
//        nombre="no name";
//        dni="0";
//        limite=-50;
//    }
//    
//    CuentaCorriente(String nombre, String dni, double saldo,double limite){
//        this.nombre=nombre;
//        this.dni=dni;
//        this.saldo=saldo;
//        this.limite=limite;
//    }
    
    
    void ingresar(double ingreso){
        saldo=saldo + ingreso;
    }
    
    void retirar(double sacar){
        if(saldo-sacar<limite){
            System.out.println("No se puede retirar mas dinero");
        }
        else{
            saldo=saldo-sacar;
        }
    }
    void mostrar(){
        System.out.println("--------***--------");
        System.out.println("Nombre: " + persona);
        //System.out.println("Dni: " + dni);
        System.out.println("Dinero en cuenta: " +saldo+"€");
    }
    
    
    
}
