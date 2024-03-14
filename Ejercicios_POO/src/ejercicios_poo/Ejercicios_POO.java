/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_poo;

/**
 *
 * @author Medac
 */
public class Ejercicios_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        CuentaCorriente cc1 = new CuentaCorriente("Patata","48596324J");
//        cc1.ingresar(5);
//        cc1.ingresar(500);
//        cc1.retirar(0);
//        cc1.mostrar();
//        CuentaCorriente cc2 = new CuentaCorriente(100.0);
//        CuentaCorriente cc3 = new CuentaCorriente("pene","5149646k",100.0,-50);
//        
//        cc2.mostrar();
//        cc3.mostrar();
          
          Persona persona1 = new Persona("sexo",15,"6541654j");
          CuentaCorriente cc1 = new CuentaCorriente(persona1,500,50);
          cc1.mostrar();
        
        
        
        
    }
    
}
