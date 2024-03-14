/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioexcepciones;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class EjercicioExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws EdadException {
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Ingresa nombre");
        String nombre=sc.next();
        
        System.out.println("Ingresa edad");
        int edad=sc.nextInt();
        
        System.out.println("Ingresa tu dinero");
        double dinero=sc.nextDouble();
        
        Persona persona=new Persona(edad,nombre,dinero);
        
        System.out.println("Discoteca sexo, se permite todo menos calvos");
        
        try{
            if(persona.getEdad()<18){
                throw new EdadException();
            }
            else{
                persona.sacarDinero(50);
                System.out.println("Dinero sacado, te queda:"+persona.getDinero());
            }
        }
        catch(EdadException e){
            System.out.println("Error por edad");
        }
        
        catch(SaldoNegativo e1){
            System.out.println("Error por pobre");
        }
   
    
    }

        
        
        
    
    
}
