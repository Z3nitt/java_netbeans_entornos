/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintonizadordigital_poo;

/**
 *
 * @author Medac
 */
public class SintonizadorFM {
    //80 a 108 mhz
    private double frecuencia=80;
    
   SintonizadorFM(double frecuencia){
       this.frecuencia=frecuencia;
   }
   
   void subir(){
       if(frecuencia<108){
       frecuencia=frecuencia+0.5;
       }
       else{
           frecuencia=90;
       }
   }
    
   void bajar(){
       if(frecuencia>90){
       frecuencia=frecuencia-0.5;
       }
       else{
           frecuencia=108;
       }
   }
   void mostrar(){
       System.out.println("----------*_*----------");
       System.out.println("↻ ◁◁  "+frecuencia +" MHz " +"▷▷ ↺ ");
       System.out.println("----------*_*----------");
   }
}
