/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistpacientes;

import java.util.*;
/**
 *
 * @author Medac
 */
public class ArrayListPacientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //id unico,nombre,edad. por consola se meten los datos menos la id, que se va sumando sola y luego se ordena por edad
        Scanner sc= new Scanner (System.in);
        ArrayList<Paciente>pacientes= new ArrayList<>();
        int id=0;
        boolean salir=false;
        
        do {
            System.out.println("Elige una opcion:");
            System.out.println("1.Introducir paciente | 2.Ver pacientes | 3.Salir");
            int menu=sc.nextInt();
            
            switch (menu) {
                case 1:
                    System.out.println("Introduce el nombre del paciente: ");
                    String nombre=sc.next();
                    System.out.println("Introduce la edad del paciente: ");
                    int edad=sc.nextInt();
                    pacientes.add(new Paciente(id,nombre,edad));
                    id++;
                    break;
                case 2:
                    Collections.sort(pacientes);
                    System.out.println(pacientes);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    salir=true;
                    break;
                default:
                    System.out.println("Ese numero no está entre 1 y 2, prueba otra vez");
                    break;
            }
        } while (salir==false);
        
        
    }
    
}
