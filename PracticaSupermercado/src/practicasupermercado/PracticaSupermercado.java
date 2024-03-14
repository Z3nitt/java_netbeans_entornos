/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicasupermercado;

import java.io.*;
/**
 *
 * @author Medac
 */
public class PracticaSupermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file=new File("chinofeliz.txt");
        File file2=new File("mercacoca.txt");
        String nombre;
        String precio="0";
        int pre;
        String frase;
        
        try{
            FileReader filereader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(filereader);
            frase=bufferedReader.readLine();
            
            
            while(frase!=null){
               frase=bufferedReader.readLine(); 
               pre=Integer.parseInt(precio);
               
               Producto p1=new Producto(frase,pre);
               
               
               
            }
            
            
        }
        
        
        catch(IOException e){
            System.out.println("Error de lectura");
        }
    }
    
}
