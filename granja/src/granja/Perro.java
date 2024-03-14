/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granja;

/**
 *
 * @author Medac
 */
public class Perro extends Animal{
    @Override
   public void comer(){
        System.out.println("Pienso");
   }
   
   @Override
   public void dormir(){
       System.out.println("Sexo");
   }
   
   public Perro(){
   
       patas=4;
       nombre="Perro";
   }
   
}


