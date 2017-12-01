package com.jongewaard.flujo;

import javax.swing.JOptionPane;

/**
 *
 * @author german
 */
public class Ejemplo_Do_while {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        JOptionPane.showMessageDialog(null,"Este programa cuenta los caracteres de la palabra o frase introducida \n"
            + "Para terminar escribe salir");
        /*
        String texto="";
        
        while(!texto.equals("salir")){
            
            texto= JOptionPane.showInputDialog("Introduce el texto");
            
            JOptionPane.showMessageDialog(null,"El texto introducido tiene " + texto.length() +
                    " caracteres");
              
        }
        */
        //puedo presindir de inicializar la variable texto
        String texto;
        
         do{
            
            texto= JOptionPane.showInputDialog("Introduce el texto");
            
            JOptionPane.showMessageDialog(null,"El texto introducido tiene " + texto.length() +
                    " caracteres");
              
        }while(!texto.equals("salir"));
        System.out.println("Has salido del programa...");
        
        
    }
    
}
