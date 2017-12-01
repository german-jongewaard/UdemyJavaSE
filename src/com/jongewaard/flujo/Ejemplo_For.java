package com.jongewaard.flujo;

/**
 *
 * @author german
 */
public class Ejemplo_For {

    public static void main(String[] args) {
        // TODO code application logic here
        
         
         System.out.println("----------------- for int i=0; i<10;i++ -----------------");         
          
        for(int i=0; i<10;i++){
             
            System.out.println("Hola alumnos " + i);
        }
         System.out.println("----------------- for int i=10; i>0;i-- -----------------");         
         
        for(int i=10; i>0;i--){
             
            System.out.println("Hola alumnos al reves " + i);
        }
         System.out.println("----------------- for int i= 0; i<20; i+=2 -----------------");
        
        for(int i= 0; i<20; i+=2){
        
             System.out.println("Hola alumnos al reves " + i);
             
        }
    }
    
}
