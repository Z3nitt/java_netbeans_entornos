/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
        Vehiculo j1 = null;
        
        boolean confirmar=false;
        
        //-----------------------SELECCIÓN DE VEHICULO-----------------        
        do {
             System.out.println("Selecciona tu vehiculo");
             System.out.println("1. Coche | 2. Moto | 3. Camión");
             int seleccion= sc.nextInt();
             int SN;
             
             switch (seleccion) {
                case 1:
                    j1=new Coche();
                    j1.info();
                    System.out.println(j1.toString());
                    System.out.println("¿Quieres elegir este vehículo?");
                    System.out.println("1. Si | 2. No");
                    SN=sc.nextInt();
                    if(SN==1){
                        confirmar=true;
                        break;
                    }
                    else if(SN==2){
                        System.out.println("Volviendo...");
                    }
                    else{
                        System.out.println("Opción no válida, vuelve a intentarlo");
                    }
                    
                case 2:
                    j1=new Moto();
                    j1.info();
                    System.out.println(j1.toString());
                    System.out.println("¿Quieres elegir este vehículo?");
                    System.out.println("1. Si | 2. No");
                    SN=sc.nextInt();
                    if(SN==1){
                        confirmar=true;
                        break;
                    }
                    else if(SN==2){
                        System.out.println("Volviendo...");
                    }
                    else{
                        System.out.println("Opción no válida, vuelve a intentarlo");
                    }
                    break;
                case 3:
                    j1=new Camion();
                    j1.info();
                    System.out.println(j1.toString());
                    System.out.println("¿Quieres elegir este vehículo?");
                    System.out.println("1. Si | 2. No");
                    SN=sc.nextInt();
                    if(SN==1){
                        confirmar=true;
                        break;
                    }
                    else if(SN==2){
                        System.out.println("Volviendo...");
                    }
                    else{
                        System.out.println("Opción no válida, vuelve a intentarlo");
                    }
                    break;
                default:
                    System.out.println("El número no está entre 1 y 3, prueba otra vez");
                    break;
            }
        } 
        while (confirmar==false);
        
        //-------------TABLERO---------------------
        
        int filas = 10;
        int columnas = 10;
        int filaActual = 0;
        int columnaActual = 0;
        char movimiento;
        
        
        char[][] tablero = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == filaActual && j == columnaActual) {
                    tablero[i][j] = 'O'; //Vehiculo
                }
                else {
                    tablero[i][j] = '_'; //Tablero vacio
                }
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        
        //-------TRAMPAS VARIAS----------
        tablero[5][5] = '?';
        
        //-----------------MOVIMIENTO--------------------------
        
        do {
            System.out.print("Ingresa un movimiento (W/A/S/D para moverte, Q para salir): ");
            movimiento = sc.next().charAt(0);

            if (movimiento == 'Q' || movimiento == 'q') {
                System.out.println("¡Has perdido por abandono!");
                break;
            }
            
            tablero[filaActual][columnaActual] = '_';
            switch (movimiento) {
                case 'w':
                case 'W':
                    if (filaActual > 0) {
                        filaActual--;
                    }
                    else{
                        System.out.println("No puedes moverte en esta dirección.");
                    }
                    break;
                case 'a':
                case 'A':
                    if (columnaActual > 0) {
                        columnaActual--;
                    }
                    else{
                        System.out.println("No puedes moverte en esta dirección.");
                    }
                    break;
                case 's':
                case 'S':
                    if (filaActual < filas - 1) {
                        filaActual++;
                    }
                    else{
                        System.out.println("No puedes moverte en esta dirección.");
                    }
                    break;
                case 'd':
                case 'D':
                    if (columnaActual < columnas - 1) {
                        columnaActual++;
                    }
                    else{
                        System.out.println("No puedes moverte en esta dirección.");
                    }
                    break;
                default:
                    System.out.println("Movimiento no válido.");
            }

            tablero[filaActual][columnaActual] = 'O';
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println(""); 
            }
        
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        while(j1.getVida()>0);
        
        
        
        
    }
    
}


