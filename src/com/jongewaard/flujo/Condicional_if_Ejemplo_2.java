package com.jongewaard.flujo;

import javax.swing.JOptionPane;

/**
 *
 * @author german
 */
public class Condicional_if_Ejemplo_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int edad;
        
        edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor"));
        
        if(edad < 18){
            
            System.out.println("Eres muy joven");
        }else if(edad <= 40 ){
            System.out.println("Eres Joven");
        }else if(edad <= 65 ){
            System.out.println("Madura");
        }else if(edad > 65){
            System.out.println("Muy madura");
        }
        
    }
    
}
