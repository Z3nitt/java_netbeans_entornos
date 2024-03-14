/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granja;

/**
 *
 * @author Medac
 */
public class Gato extends Animal{
    @Override
   public void comer(){
        System.out.println("Pescado");
   }
   
   @Override
   public void dormir(){
       System.out.println("Sexo duro");
   }
   
   public Gato(){
   
       patas=4;
       nombre="Litten";
   }
}
