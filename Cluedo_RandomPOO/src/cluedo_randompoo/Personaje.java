/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cluedo_randompoo;

/**
 *
 * @author Medac
 */
public class Personaje {
    private String nombre;
    public boolean asesino;
    private String lugar;

    public Personaje(String nombre) {
        this.nombre = nombre;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isAsesino() {
        return asesino;
    }

    public String getLugar() {
        return lugar;
    }


    public void setAsesino(boolean asesino) {
        this.asesino = asesino;
    }

    
    public void DondeEstaba(String nombre){
       switch(nombre){
            case "Mayordomo":
                lugar = "Entrada";
                System.out.println("Estaba en el Hall de entrada");
                break;
            case "Ama de llaves":
                lugar = "Dormitorio";
                System.out.println("Estaba en el dormitorio");
                break;
            case "Jardinero":
                lugar="Jardin";
                System.out.println("Estaba en el jardin");
            case "Cocinero":
                lugar="Docina";
                System.out.println("Estaba en en la cocina");
            case "Propietario":
                lugar = "Salon";
                System.out.println("Estaba en el salon");
            case "Esposa del propietario":
                lugar = "Baño";
                System.out.println("Estaba en el baño");
            
        }
        
    }
    public void hablar(){
        if (asesino=true){
       switch(nombre){
            case "Mayordomo":
                lugar = "Dormitorio";
                System.out.println("Estaba en el Hall de entrada");
                break;
            case "Ama de llaves":
                lugar = "Dormitorio";
                System.out.println("Estaba en el dormitorio");
                break;
            case "Jardinero":
                lugar="Jardin";
                System.out.println("Estaba en el jardin");
            case "Cocinero":
                lugar="Docina";
                System.out.println("Estaba en en la cocina");
            case "Propietario":
                lugar = "Salon";
                System.out.println("Estaba en el salon");
            case "Esposa del propietario":
                lugar = "Baño";
                System.out.println("Estaba en el baño");
            
        }
       }
        else{
            switch(nombre){
            case "Mayordomo":
                lugar = "Entrada";
                System.out.println("Estaba en el Hall de entrada");
                break;
            case "Ama de llaves":
                lugar = "Dormitorio";
                System.out.println("Estaba en el dormitorio");
                break;
            case "Jardinero":
                lugar="Jardin";
                System.out.println("Estaba en el jardin");
            case "Cocinero":
                lugar="Docina";
                System.out.println("Estaba en en la cocina");
            case "Propietario":
                lugar = "Salon";
                System.out.println("Estaba en el salon");
            case "Esposa del propietario":
                lugar = "Baño";
                System.out.println("Estaba en el baño");
            
        }
        }
        
    }

    
    
    
    
}
