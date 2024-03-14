/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2_ahora_es_personal;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Array2_ahora_es_personal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
        int [] c;
        int [] d={2,4,7,8,9};
        c= Arrays.copyOf(d,7);
        System.out.println(Arrays.toString(d));
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));
        
        int [] a={3,4,2,7};
        int [] b=new int [5];        
        for (int i=0;i<2;i++){
            b[i]=a[i];
        }
        System.out.println("dime un numero");
        b[2]=sc.nextInt();
        for(int i=3;i<b.length;i++){
            b[i]=a[i-1];
        }
        System.out.println(Arrays.toString(b));
        
    }
    
}
