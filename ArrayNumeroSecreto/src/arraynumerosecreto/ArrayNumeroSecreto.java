/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraynumerosecreto;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class ArrayNumeroSecreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        //El numero detras del corchete es el numero de digitos que hay
        int [] clave=new int [3];
        
        int num1= (int) (Math.random()*10);
        int num2= (int) (Math.random()*10);
        int num3= (int) (Math.random()*10);
        clave[0]=num1;
        clave[1]=num2;
        clave[2]=num3;
        
        System.out.println(Arrays.toString(clave));
        int [] usuario= new int [3];
        usuario[0]=sc.nextInt();
        usuario[1]=sc.nextInt();
        usuario[2]=sc.nextInt();
        
        boolean respuesta= Arrays.equals(usuario,clave);
        while (!respuesta){
            System.out.println("Respuesta incorrecta, prueba otra vez.");
            usuario[0]=sc.nextInt();
            usuario[1]=sc.nextInt();
            usuario[2]=sc.nextInt();
            
                    
        }
        System.out.println("Clave correcta.");
        
        
        
        
        }
        
        
        
        
        
        
        
    }
    

