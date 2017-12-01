package com.jongewaard.flujo;

import javax.swing.JOptionPane;

/**
 *
 * @author german
 */
public class Condicional_if_Ejemplo_1 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int edad;
        
        edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor"));
        
        if(edad >= 18){
            
            System.out.println("Eres mayor de edad, puedes pasar");
            
        }else{
            
            System.out.println("Eres menor de edad, no puedes pasar");
            
        }
        
    }
    
}
