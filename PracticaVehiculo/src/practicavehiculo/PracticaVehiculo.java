/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavehiculo;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class PracticaVehiculo {

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
                    break;
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
        int turnos=8;
        
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
        tablero[5][5] = '?'; //Bomba
        tablero[2][5] = '?'; //Curacion +1 vida
        tablero[1][6] = '?'; //Bomba
        tablero[8][5] = '?'; //Persona herida
        tablero[5][3] = '?'; //Bomba
        tablero[9][5] = '?'; //Bomba
        tablero[3][5] = '?'; //Bomba
        
        //---------META-------------
        tablero[9][0] = 'S';
        tablero[9][1] = 'S';
        tablero[9][2] = 'S';
        tablero[9][3] = 'S';
        tablero[9][4] = 'S';
        
        
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
                        turnos--;
                    }
                    else{
                        System.out.println("No puedes moverte en esta dirección.");
                    }
                    break;
                case 'a':
                case 'A':
                    if (columnaActual > 0) {
                        columnaActual--;
                        turnos--;
                    }
                    else{
                        System.out.println("No puedes moverte en esta dirección.");
                    }
                    break;
                case 's':
                case 'S':
                    if (filaActual < filas - 1) {
                        filaActual++;
                        turnos--;
                    }
                    else{
                        System.out.println("No puedes moverte en esta dirección.");
                    }
                    break;
                case 'd':
                case 'D':
                    if (columnaActual < columnas - 1) {
                        columnaActual++;
                        turnos--;
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
            
            if(tablero[filaActual][columnaActual]==tablero[5][5] || tablero[filaActual][columnaActual]==tablero[1][6] || tablero[filaActual][columnaActual]==tablero[5][3] || tablero[filaActual][columnaActual]==tablero[9][5] || tablero[filaActual][columnaActual]==tablero[3][5]){
                System.out.println("Oh no, has pisado una mina oculta con la rueda, mala suerte, pierdes 1 de vida");
                j1.setVida(j1.getVida()-1);
            }
            else if(tablero[filaActual][columnaActual]==tablero[2][5]){
                System.out.println("Has encontrado herramientas para reparar tu vehículo, obtienes +1 de vida");
                j1.setVida(j1.getVida()+1);
            }
            else if(tablero[filaActual][columnaActual]==tablero[8][5]){
                int tipofinal=0;
                System.out.println("Has encontrado a una persona alta y famelica con un abrigo de color negro, parece que está herida...");
                System.out.println("Desconocido: ¿Podrias llevarme a un hospital? Por favor");
                System.out.println("1. No, no te conozco de nada | 2. Si, sube | 3. Atropellarla y rematarla");
                int respuestafinal=sc.nextInt();
                
                switch (respuestafinal) {
                    case 1:
                        System.out.println("Desconocido: Eres una mala persona...");
                        tipofinal=1;
                        break;
                    case 2:
                        System.out.println("Desconocido: Muchas Gracias joven...");
                        tipofinal=2;
                        break;
                    case 3:
                        System.out.println("Desconocido:Cab...ron");
                        tipofinal=3;
                        break;
                    case 4:
                        System.out.println("Desconocido: ¡Por favor, ayuda!");
                        tipofinal=4;
                        break;
                    default:
                        System.out.println("Ese numero no está entre el 1 y el 4, prueba de nuevo.");
                        break;
                }
                if(tipofinal==1){
                    System.out.println("Has abandonado a una persona a su suerte... Dirigete a la salida...");
                }
                if(tipofinal==2){
                    System.out.println("Desconocido: Gracias por recogerme...");
                    System.out.println("El desconocido te da las gracias de una manera siniestra...");
                    System.out.println("Desconocido: Ahora baja del coche");
                    System.out.println("De repente saca un revolver de su abrigo.");
                    System.out.println("Bajas del coche temblando.");
                    System.out.println("El desconocido te dedica una mirada y dispara contra tu pierna el arma.");
                    System.out.println("Desconocido: No deberias fiarte de personas que no conoces chico.");
                    System.out.println("Dice con una mirada oscura, y te tira el revolver con el que te ha disparado");
                    System.out.println("Desconocido: Ahora tu seras el siguiente desconocido herido...");
                    System.out.println("Oyes el motor de tu vehiculo alejarse mientras te lamentas por haber subido al extraño en tu coche.");
                    break;
                }
                if(tipofinal==3){
                    System.out.println("Decides atropellar al desconocido");
                    System.out.println("Escuchas a lo lejos unas sirenas, pertenecen a la policia");
                    System.out.println("Huye hacia la meta antes de que te maten...");
                }
            }
            if(tablero[filaActual][columnaActual]==tablero[9][0] || tablero[filaActual][columnaActual]==tablero[9][4] || tablero[filaActual][columnaActual]==tablero[9][3] || tablero[filaActual][columnaActual]==tablero[9][2] || tablero[filaActual][columnaActual]==tablero[9][1]){
                System.out.println("GG, has ganado");
                break;
            }
            
            
  
        }
        while(j1.getVida()!=0 || turnos>0);
 
    }
    
}


