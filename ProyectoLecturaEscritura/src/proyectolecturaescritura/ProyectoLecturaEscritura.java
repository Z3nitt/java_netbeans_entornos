/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectolecturaescritura;

import java.io.*;

/**
 *
 * @author Medac
 */
public class ProyectoLecturaEscritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file=new File("inspector.txt");
        String frase;
        String frase2="";
        
        try{
            FileReader filereader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(filereader);
            frase=bufferedReader.readLine();
//            System.out.println(frase);
            while(frase!=null){
                frase2=frase2+frase+'\n';
                frase=bufferedReader.readLine();
            }
            System.out.println(frase2);
            bufferedReader.close();
        }
        
        catch(IOException e){
            System.out.println("Error de lectura");
        }
        try{
            File file2=new File("sexo.txt");
            FileWriter filewriter =new FileWriter(file2,false);
            
            //True mantiene lo que tenia escrito el archivo
            //False te borra todo y empieza desde 0
            BufferedWriter bufferedWriter=new BufferedWriter(filewriter);
            bufferedWriter.write("aaaaaa");
            bufferedWriter.newLine();
            bufferedWriter.write("no aaaaaaaa molestar");
            
            bufferedWriter.close();
        }
        catch(IOException e){
            System.out.println("Error de lectura");
        }
        
        
        
        //archivo guardado en otro sitio
        //File file=new File("aqui va la ruta /user/desktop...");
//        try{
//            if(file.canRead()){
//                //System.out.println("Sexo");
//                FileReader filereader=new FileReader(file);
//                
//                int num=filereader.read();
//                char letra=(char)num;
//                
//                char[]arrayletras=new char[20];
//                int i=0; //contador
//                while(num!=-1){
//                    
//                    letra=(char)num;
//                    System.out.println(letra);
//                    num=filereader.read();
//                    
//                    arrayletras[i]=letra;
//                    i++;
//                }
//                
//                
//            }
//            else{
//                //System.out.println("Sexon't");
//            }
//        }
//        catch(IOException e){
//            System.out.println("Error de lectura");
//        }
        
        
        
    }
    
}
