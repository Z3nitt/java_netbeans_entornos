/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacrochungo;

import java.io.*;
import java.util.Arrays;
/**
 *
 * @author Medac
 */
public class SimulacroChungo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
//        String lista="2";
//        int a=Integer.valueOf(lista);
//        System.out.println(a+4);
        
        File file=new File("objetos2.txt");
        String[]objetos;
        Articulo[]articulos=new Articulo[100];
        int cont=0;
        
        try{
            
            FileReader filereader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(filereader);
            
            String palabras = bufferedReader.readLine();
            while(palabras!=null){
                objetos=palabras.split(":");
                
                if(palabras.contains("/")){
                    throw new ExceptionBarra("No se puede leer correctamente");
                }
                else{
                    String item=objetos[0];
                    String precio=objetos[1];
                    String cantidad=objetos[2];
                    int precio_num=Integer.parseInt(precio);
                    int cantidad_num=Integer.parseInt(cantidad);
                    Articulo articulo = new Articulo(item,precio_num,cantidad_num);
                    articulos[cont]=articulo;
                    cont++;
//                    System.out.println(articulo);
                }
                palabras=bufferedReader.readLine();
            }
            
            bufferedReader.close();
            
            
        }
        catch(IOException e){
            System.out.println("Fallo de lectura");
        }
        
        catch(ExceptionBarra e1){
            System.out.println(e1.getMessage());
       }
        int contador1=1;
        for(int i=0;i<articulos.length;i++){
            if(articulos[i]!=null){
                System.out.println("__________OBJETO "+contador1+"__________");
                contador1++;
                System.out.println(articulos[i]);
                
            }
            
        }
        
    }
    
}
