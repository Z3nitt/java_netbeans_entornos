/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegocoches;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class JuegoCoches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
        Coche coche= new Coche();
        Moto moto= new Moto();
        Camion camion= new Camion();
        
        String[]cartas_objetivos={"1.Camion 2.Moto","1.Moto 2.Camion","1.Coche 2.Moto"};
        System.out.println("El coche tiene que "+cartas_objetivos[2]);
        System.out.println("La moto tiene que "+cartas_objetivos[1]);
        System.out.println("El camión tiene que "+ cartas_objetivos[0]);
        
        //Se crea un tablero con la clase al principio para meter a sus hijos (coche, moto...)
        Vehiculo [][]tablero=new Vehiculo[3][10];
        
        //Introducir las clases en el tablero
        tablero[coche.getPosx()][coche.getPosy()]=coche;
        tablero[moto.getPosx()][moto.getPosy()]=moto;
        tablero[camion.getPosx()][camion.getPosy()]=camion;
        
        //Se crea un metodo para poder ver el tablero
        mostrar(tablero);
        
        //Se actualiza el tablero para mostrar todo
        actualizar(tablero,coche,moto,camion);
        
        Carta[]mazo=new Carta[10];
        
        for(int i=0;i<mazo.length;i=i+2){
            mazo[i]=new Carta("avance",i);
        }
        
        for(int i=0;i<mazo.length;i=i+2){
            mazo[i]=new Carta("retrocede",i);
        }
        
        Vehiculo[]vehiculos={coche,moto,camion};
        
        do {
            for(int i=0;i<3;i++){
                System.out.println(vehiculos[i].getNombre()+"coge una carta");
                int random=(int)(Math.random()*10);
                System.out.println(mazo[random].getNombre());
                System.out.println("¿A quien quieres mover? 1. Coche | 2. Moto | 3. Camión");
                int resp=sc.nextInt();
                switch (resp) {
                    case 1:
                        if(mazo[random].getEstado()%2==0){
                            coche.avanzar();
                        }
                        else{
                            coche.retroceder();
                        }
                        break;
                    case 2:
                        if(mazo[random].getEstado()%2==0){
                            moto.avanzar();
                        }
                        else{
                            moto.retroceder();
                        }
                        break;
                    case 3:
                        if(mazo[random].getEstado()%2==0){
                            camion.avanzar();
                        }
                        else{
                            camion.retroceder();
                        }
                        break;
                    default:
                        System.out.println("El número introducido no está entre el 1 y 3, prueba de nuevo.");
                }
            }
        } 
        while (tablero[0][9]==null && tablero[1][9]==null && tablero[2][9]==null);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    public static void mostrar(Vehiculo[][] tablero){
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[j].length;j++){
                if(tablero[i][j]==null){
                    System.out.print("_ ");
                }
                else{
                    System.out.println(tablero[i][j].getNombre()+" ");
                }
                
            }
        }
    }

    private static void actualizar(Vehiculo[][] tablero, Coche coche, Moto moto, Camion camion) {
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[i].length;j++){
                tablero[i][j]=null;
            }
        }
        tablero[coche.getPosx()][coche.getPosy()]=coche;
        tablero[moto.getPosx()][moto.getPosy()]=moto;
        tablero[camion.getPosx()][camion.getPosy()]=camion;
    }
    
}
