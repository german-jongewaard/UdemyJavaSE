package com.jongewaard.flujo;

/**
 *
 * @author german
 */
public class Ejemplo_For_II {

    public static void main(String[] args) {
        // TODO code application logic here
        
        for(int i=0; i<20; i+=2){
            
            System.out.println("Aviso " + i);
            
            if(i==6) break;
        }
        System.out.println("Has salido del bucle for...");
        
        for(int i=0; i<10; i++){
            
            for(int j=0; j<10; j++){
           
                System.out.println("Hola alumnos... " + "i vale: " + i +
                        " J vale: " + j);
            
            
            }
            
        }
        System.out.println("Has salido del bucle for..."); 
    
    }
    
}
