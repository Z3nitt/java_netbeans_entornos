/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversorinsultos;

import java.io.*;
import java.util.Arrays;

/**
 *
 * @author Medac
 */
public class ConversorInsultos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file=new File("insultos.txt");
        String[]frase=new String[30];
        int contador=0;
        
        try{
            
            FileReader filereader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(filereader);
            //Guarda la palabra del txt para poder cortarla
            String palabra = bufferedReader.readLine();
            //la corta por espacios y la mete directamente en el array
            frase=palabra.split(" ");
            
            
            
            //diccionario
            File file2=new File("diccionario.txt");
            int i=0;
            String []division;
            String[][]matriz=new String[100][2];
            palabra=bufferedReader.readLine();
            while(palabra!=null){
                division=palabra.split(";");
                palabra=bufferedReader.readLine();
                matriz[i][0]=division[0];
                matriz[i][1]=division[2];
                i++;
                System.out.println(division[0]+division[2]);
            }

            System.out.println(frase[5]);
            
        }
        
        catch(IOException e){
            
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
