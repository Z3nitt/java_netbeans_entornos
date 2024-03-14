/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package puesto_fronterizopoo;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Puesto_FronterizoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean bucle=true;
        Scanner sc= new Scanner (System.in);
        int i=0;
        Persona[] array_personas = new Persona[100];
        do{
            System.out.println("1. Paso de persona | 2.Mostrar todas las personas | 3.Búsqueda por apellido | 4.Búsqueda por dni | 5.Salir");
            int opcion=sc.nextInt();
            switch(opcion){
                case 1: //crear personas
                    System.out.println("Introduce el nombre");
                    String nombre=sc.next();
                    System.out.println("Introduce el primer apellido");
                    String apellido=sc.next();
                    System.out.println("Introduce el dni");
                    String dni=sc.next();
                    //Lo primero es la clase "Persona"
                    Persona persona = new Persona(nombre,dni,apellido);
                    array_personas[i]= persona;
                    i++;
                    break;
                case 2: //mostrar array
                    for(int a=0;a<i;a++){
                        System.out.println(array_personas[a]);
                    }
                    break;
                case 3: //buscar por apellido
                    System.out.println("Introduzca el apellido de la persona a buscar: ");
                    apellido=sc.next();
                    for(int a=0;a<i;a++){
                        if(apellido.equals(array_personas[a].getApellido())){
                            System.out.println("La persona con apellido " + apellido + " es " + array_personas[a]);
                        }
                        else{
                            System.out.println("No hay ninguna personas con ese apellido.");
                        }
                    }
                    break;
                case 4: //buscar por dni
                    System.out.println("Introduzca el dni de la persona a buscar: ");
                    dni=sc.next();
                    for(int a=0;a<i;a++){
                        if(dni.equals(array_personas[a].getDni())){
                            System.out.println("La persona con dni" + dni + "es" + array_personas[a]);
                        }
                        else{
                            System.out.println("No hay ninguna personas con ese dni.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    bucle=false;
                    break;
                default:
                    System.out.println("Esa opcion no existe, introduzca una opcion: ");
                    break;
            }
        }
        while(bucle);
    }
    
}
