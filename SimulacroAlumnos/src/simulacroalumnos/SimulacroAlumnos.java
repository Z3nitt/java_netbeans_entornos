/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacroalumnos;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class SimulacroAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        Persona[] alumnos=new Persona [100];
        int pos=0;
        boolean salir=false;
        do{
            System.out.println("1. Insertar alumno | 2. Mostrar alumno | 3. Mostrar alumnas | 4. Mostrar suspensos | 5. Estadisticas | 6. Salir");
            int respuesta=sc.nextInt();
            switch (respuesta) {
                case 1:
                    System.out.println("1. Alumno | 2. Alumna");
                    int res=sc.nextInt();
                    System.out.println("Escribe el nombre");
                    
                    if(res==1){
                        alumnos[pos]=new Alumno(sc.next());
                        alumnos[pos].instertarNotas();
                        
                        
                    }
                    else{
                        alumnos[pos]=new Alumna(sc.next());
                        alumnos[pos].instertarNotas();
                    }
                    pos++;
                    break;
                case 2:
                    for(int i=0;i<alumnos.length;i++){
                        if(alumnos[i] instanceof Alumno){
                            System.out.println(alumnos[i]);
                        
                        }
                    }
                    
                    break;
                case 3:
                    for(int i=0;i<alumnos.length;i++){
                        if(alumnos[i] instanceof Alumna){
                            System.out.println(alumnos[i]);
                        
                        }
                    }
                    
                    break;
                case 4:
                    System.out.println("1. Alumno | 2. Alumna");
                    int resps=sc.nextInt();
                    for(int i=0;i<pos;i++){
                        alumnos[i].estaAprobado();
                        if(resps==1){
                            if(alumnos[i] instanceof Alumno && alumnos[i].suspenso){
                                System.out.println(alumnos[i]);
                            }
                        }
                        else{
                            if(alumnos[i] instanceof Alumna && alumnos[i].suspenso){
                                System.out.println(alumnos[i]);
                            }
                        }
                    }
                    
                    
                    break;
                case 5:
                    int contmasc= 0; 
                    int contfem= 0;
                    for(int i=0;i<pos;i++){
                        if(alumnos[i].suspenso && alumnos[i] instanceof Alumno){
                            contmasc++;
                        }
                        else if(alumnos[i].suspenso && alumnos[i] instanceof Alumna){
                            contfem++;
                        }
                    }
                    System.out.println("Alumnos masculinos: "+contmasc + " Alumnas Femeninas: "+ contfem);
                   break;
                default:
                    salir=true;
                    System.out.println("Saliendo...");
                    break;
            }
        
        }
        while(salir==false);
    }
    
}
