package com.jongewaard.entradasalida;

/**
 *
 * @author german
 */
import javax.swing.JOptionPane;

public class EntradaJOptionPane {
    
     public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre por favor");
        
        //paso el numero que pone el usuario (texto) a entero
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad por favor"));
        
         System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años.");
        
     }
    
}
