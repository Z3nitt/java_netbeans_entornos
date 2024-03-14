/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacroalumnos;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public abstract class Persona {
    Scanner sc= new Scanner (System.in);
    protected String Nombre;
    protected double [] notas;
    boolean suspenso=false;

    public Persona(String Nombre) {
        this.Nombre = Nombre;
        notas= new double [6];
    }
    
    public void instertarNotas(){
        String [] nombreasignatura={"Programacion","LLMM","BBDD","Fol","Entorno","Sistemas"};
        for(int i=0;i<notas.length;i++){
            System.out.println("¿Cual es la nota de " +nombreasignatura[i]+" ?");
            notas[i]=sc.nextDouble();
        }
    }
    
    public void estaAprobado(){
        for(int i=0;i<notas.length;i++){
            if(notas[i]<5){
                suspenso=true;
//                System.out.println("1 o mas suspensas");
            }
            else{
//                System.out.println("No tiene ninguna suspensa");
            }
        }
    }

    @Override
    public String toString() {
        String respuesta= " ";
        for(int i=0;i<notas.length;i++){
            respuesta= respuesta+notas[i]+"||";
        }
        return Nombre + respuesta;
    }
    
    
    
    
    
    
    
    
}
