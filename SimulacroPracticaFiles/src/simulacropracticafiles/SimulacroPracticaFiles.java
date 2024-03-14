/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacropracticafiles;

import java.util.Arrays;
import java.io.*;
/**
 *
 * @author Medac
 */
public class SimulacroPracticaFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        File file=new File("codigo.txt");
//        String frase2="";
//        int pos=0;
//        
//        try{
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader=new BufferedReader(fileReader);
//            String guardarCodigo = bufferedReader.readLine();
//            
//            while(guardarCodigo!=null){
//                String []codigo=guardarCodigo.split(" ");
//                frase2=frase2+guardarCodigo+'\n';
//                guardarCodigo=bufferedReader.readLine();
//                System.out.println(Arrays.toString(codigo));
//                
//                for(int i=0;i< codigo.length;i++){
//                    if(codigo[i].equals("//") || codigo[i].equals("/*")){
//                        guardarCodigo=" ";
//                        System.out.println(Arrays.toString(codigo));
//                    }
//                }
//            }
//            
//            
//        }
//        
//        catch(IOException e){
//            System.out.println("Fallo de lectura");
//        }
        

        




         File file=new File("codigo.txt");
         
         try{
             FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader=new BufferedReader(fileReader);
             String linea=bufferedReader.readLine();
             boolean comentadotodo=false;
             while(linea!=null){
                 if(!linea.contains("//")&&(!linea.contains("/*"))&&(!linea.contains("*/"))&&(!comentadotodo)){
                     if(!linea.endsWith(";")&&(!linea.endsWith("{"))&&(!linea.endsWith("}"))){
                         throw new ExcepctionSinPuntoComa("Se ha producido un error porque falta añadir el punto y coma al final de la frase");
                     }
                     else{
                         System.out.println(linea);
                     }
                 }
                 else if(linea.contains("/*")){
                     comentadotodo=true;
                 }
                 else if(linea.contains("*/")){
                     comentadotodo=false;
                 }
                 linea=bufferedReader.readLine();
             }
             
             
         }
         catch(IOException e){
             System.out.println("Fallo de lectura");
         }
         catch(ExcepctionSinPuntoComa e1){
             System.out.println(e1.getMessage());
         }
                         
            
        
         
    }
    
}
