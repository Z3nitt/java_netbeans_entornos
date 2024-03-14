/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Medac
 */
public class Persona {
    //atributo o campos
    String nombre;
    int edad;
    String dni;
    //String email;
    
    //constructores
    
//    Persona(){
//        System.out.println("Has creado una persona");
//    }
//    
//    Persona(String nombre, int e){
//        //siempre poner this.
//        this.nombre=nombre;
//        this.edad=e;
//    }
//    
//    Persona(int edad){
//        //siempre poner this.
//        this.edad=edad;
//    }
    
//    Persona(String nombre){
//        this.nombre=nombre;
//        
//    }
    
    Persona(String nombre, int edad,String dni){
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;
        
    }
    
    //método
//    void saludar (){
//        System.out.println(nombre + " te dice hola");
//    }
//    void comer (){
//        System.out.println("Estoy comiendo");
//    }
//    
//    void incremento(int num){
//        edad=edad+num;
//    }
//      
      void pintar(){
          System.out.print(nombre);
          System.out.print(edad);
          System.out.println(dni);
      }
    
    
      boolean mayor_edad(){
          boolean resp;
          if (edad<18){
              resp=false;
          }
          else{
              resp=true;
          }
        
          return resp;
    }
    
}
