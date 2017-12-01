package com.jongewaard.flujo;

import javax.swing.JOptionPane;

/**
 *
 * @author german
 */
public class EjemploWhile_1 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        String clave = "Germán";
        
        String acceso = "";
        
        
        acceso = JOptionPane.showInputDialog("Introduce la clave de acceso, por favor.");
        //operador negación
        //con '!' invierto el sentido, digo: Mientras la clave NO sea igual que el acceso.
        while(!clave.equals(acceso)){
            
            
            acceso = JOptionPane.showInputDialog("Clave erronea - Introduce la clave de acceso, por favor.");
            
            if(!clave.equals(acceso)){
                
                System.out.println("la clave es incorrecta.");
            }
            
        }
        
        System.out.println("Bienvenido a la zona de usuarios");
    }
    
}
