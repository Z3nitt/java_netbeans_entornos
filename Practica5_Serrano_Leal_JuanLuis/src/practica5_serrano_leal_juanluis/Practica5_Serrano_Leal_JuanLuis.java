/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5_serrano_leal_juanluis;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

/**
 *
 * @author Medac
 */
public class Practica5_Serrano_Leal_JuanLuis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        Paciente[] array_pacientes=new Paciente[20];
        boolean bucle=true;
        int cont=0;
        int id=0;
        int a=0;
        
        //TIENES QUE USAR LA OPCION 1 PARA EJECUTAR LA 2 PORQUE EL ARRAY ESTA CREADO A PARTIR DE LA OPCION 1
        
        do {
            System.out.println("Elige una opción:");
            System.out.println("1. Crear paciente | 2. Ver paciente | 3. Sondaje | 4. Salir");
            int menu=sc.nextInt();
            
            try{
                File file_pacientes=new File("pacientes.txt");
                File file_config=new File("config.txt");
                File file_sondaje=new File("sondaje.txt");
                switch (menu) {
                    case 1:
                        System.out.println("Introduce el nombre del paciente: ");
                        String nombre=sc.next();
                        System.out.println("Introduce el primer apellido: ");
                        String primer_apellido=sc.next();
                        System.out.println("Introduce la edad del peciente: ");
                        int edad=sc.nextInt();
                        
                        
                        id=0+cont;
                        int id_config=id+1;
                        Paciente paciente = new Paciente(id,nombre,primer_apellido,edad);
                        
                        
                        array_pacientes[a]= paciente;
                        a++;
                        FileWriter filewriterpacientes =new FileWriter(file_pacientes,true);
                        BufferedWriter bufferedWriterpacientes=new BufferedWriter(filewriterpacientes);
                        bufferedWriterpacientes.write(id+" "+nombre+" "+primer_apellido+" "+edad);
                        
                        bufferedWriterpacientes.newLine();
                        bufferedWriterpacientes.close();
                        
                        FileWriter filewriterconfig =new FileWriter(file_config,false);
                        BufferedWriter bufferedWriterconfig=new BufferedWriter(filewriterconfig);
                        bufferedWriterconfig.write(String.valueOf(id_config));
                        
                        bufferedWriterconfig.newLine();
                        bufferedWriterconfig.close();
                        
                        cont++;
                        
                        break;
                    case 2:
                        for(int i=0;i<array_pacientes.length;i++){
                            if(array_pacientes[i]!=null){
                                System.out.println(array_pacientes[i]);
                            }
                        }
                        break;
                    case 3:
                        //NO FUNCIONA BIEN
                        FileReader fileReader_sondaje = new FileReader(file_sondaje);
                        BufferedReader bufferedReader_sondaje=new BufferedReader(fileReader_sondaje);
                        String linea=bufferedReader_sondaje.readLine();
                        
                        String[] dientes=new String[5];
                        while(linea!=null){
                            dientes=linea.split(" ");
                            
                        }
                        
                        if(linea.contains(" +")){
                            for(int i=0;i<dientes.length;i++){
                                dientes[i]=linea;
                            }
                        }
                        System.out.println(Arrays.toString(dientes));
                        
                        bufferedReader_sondaje.close();
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        bucle=false;
                        break;
                    default:
                        System.out.println("Error, el numero introducido no es correcto, prueba otra vez.");
                        break;
                }
            }
            
            catch(IOException e){
                System.out.println("Error de lectura");
            }
            
            
        } 
        while (bucle);
        
        
    }
    
}
