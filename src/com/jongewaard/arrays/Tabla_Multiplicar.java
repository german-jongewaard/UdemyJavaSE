package com.jongewaard.arrays;

/**
 *
 * @author german
 */
public class Tabla_Multiplicar {

    public static void main(String[] args) {
        // TODO code application logic here
        
        for(int num = 1; num <=5; num++){
            System.out.println("Tabla de multiplicar de: " + num);
            for (int i = 0; i <= 10; i++) {                
                System.out.println(num + " * " + i + " = " + num*i);                
            }
        }
        
        int [][]tablero = new int[5][5];
        int fila;
        int columna;
        for(fila = 0; fila <= 4; fila++){
            for (columna = 0; columna <= 4; columna++) {
                tablero[fila][columna] = 0;                
            }        
    }
        tablero[3][0]=1;
        tablero[2][2]=2;
        tablero[2][3]=3;
        for(fila = 0; fila <= 4; fila++){
                for (columna = 0; columna <= 4; columna++) {
                   if(tablero[fila][columna] == 2){
                       System.out.println("Jugador 2 hallado en la casilla " +fila + 
                               "/" + columna);
                   }               
                }   
        }
    }
    
}
