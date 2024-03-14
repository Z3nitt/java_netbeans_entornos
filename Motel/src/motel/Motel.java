/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package motel;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Motel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int habitaciones=20;
        int precio=50;
        boolean bucle=true;
        Scanner sc= new Scanner (System.in);
        Huesped[] array_hab = new Huesped[20];
        
        do{
            System.out.println("1. Insertar Huesped | 2. Nº de habitaciones libres | 3. Calcula precio por noche");
            System.out.println("4. Elimina huesped por nombre | 5. Buscar huesped por nombre | 6. Buscar huesped por habitación | 7.Salir");
            int eleccion=sc.nextInt();
            switch(eleccion){
                case 1:
                    if (estalleno(array_hab)){
                        System.out.println("Esta lleno.");
                    }
                    else{
                        for(int i=0;i<array_hab.length;i++){
                            if(array_hab[i]==null){
                                System.out.println("Introduce el nombre del huesped: ");
                                String nombre=sc.next();
                                System.out.println("Introduce el Nº de noches: ");
                                int num_noches=sc.nextInt();
                                Huesped huesped = new Huesped(nombre,num_noches);
                                i=array_hab.length;
                            }
                        }
                    }
                    break;
                case 2:
                    for(int j=0;j<array_hab.length;j++){
                        if(array_hab[j]==null){
                            System.out.println("Habitacion "+j);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Introduce el nombre del cliente: ");
                    String nombre=sc.next();
                    for(int i=0;i<array_hab.length;i++){
                        if(nombre.equals(array_hab[i].getNombre())){
                            System.out.println(nombre + " tiene que pagar " + array_hab[i].getNum_noches()*precio);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Introduce el nombre del cliente: ");
                    nombre=sc.next();
                    for(int i=0;i<array_hab.length;i++){
                        if(nombre.equals(array_hab[i].getNombre())){
                            array_hab[i]=null;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Introduce el nombre del cliente: ");
                    nombre=sc.next();
                    for(int i=0;i<array_hab.length;i++){
                        if(nombre.equals(array_hab[i].getNombre())){
                            System.out.println("El cliente se llama " + array_hab[i]);
                        }
                        else{
                            System.out.println("No hay ninguna personas con ese nombre.");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Introduce el numero de la habitación: ");
                    int numero=sc.nextInt();
                    if(array_hab[numero]==null){
                        System.out.println("No hay nadie en esa habitación");
                    }
                    else{
                        System.out.println("La persona en la habitacion "+ numero + "se llama: " + array_hab[numero].getNombre());
                    }
                    break;
                case 7:
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
    
    public static boolean estalleno(Huesped[]habitacion){
        boolean respuesta=false;
        int cont=0;
        for(int i=0;i<habitacion.length;i++){
            if(habitacion[i]==null){
                cont++;
            }
        }
        if (cont==20){
            respuesta=true;
        }
        return respuesta;
    }
    
}
