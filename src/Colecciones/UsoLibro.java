/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

/**
 *
 * @author german
 */
public class UsoLibro {
    
      public static void main(String[] args) {
        // TODO code application logic here
        
       
        Libro libro1 = new Libro("Java SE", "Juan", 10);
        Libro libro2 = new Libro("Java SE", "Juan", 10);
        
        //libro1=libro2;
        
        if(libro1.equals(libro2)){
         
            System.out.println("Son iguales");
            
            System.out.println(libro1.hashCode());
            System.out.println(libro2.hashCode());
            
            
            
        }else {
            
            
            System.out.println("No son iguales");
            
            System.out.println(libro1.hashCode());
            System.out.println(libro2.hashCode());
            
            
        }
        
      }    
}
