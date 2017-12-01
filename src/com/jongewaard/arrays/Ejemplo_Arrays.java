package com.jongewaard.arrays;

/**
 *
 * @author german
 */
public class Ejemplo_Arrays {

    public static void main(String[] args) {
        // TODO code application logic here
       /* 
        int [] valores = new int[5];
        
        valores[0] = 15;
        valores[1] = 7;
        valores[2] = 1500;
        valores[3] = 9;
        valores[4] = -5;
        
        
        System.out.println(valores[2]);
        */
       int []valores = {15, 7, 1500, 9, -5};
       
       String [] nombre_persona = {"Juan", "María", "Antonio", "Laura"};
       
        /* for (int i = 0; i < 5; i++) {
            System.out.print(valores[i] + " ");
        } */
       
       /* for (int elemento : valores) {
            System.out.print(elemento + " ");
        }*/
       
        /* for (int i = 0; i < nombre_persona.length; i++) {
            System.out.print(nombre_persona[i] + " ");
        }*/
        
        for (String elemento : nombre_persona) {
            System.out.print(elemento + " ");
        }
        
    }
    
}
