package com.jongewaard.flujo;

import javax.swing.JOptionPane;

/**
 *
 * @author german
 */
public class Anidamiento_IF {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor"));
        
        if(edad >= 18){
            
            String carnet = JOptionPane.showInputDialog("¿Tienes carnet?: ");
            
            if(carnet.equals("si")){
                
                JOptionPane.showMessageDialog(null, "Puedes comprar el coche");
            }else{
                JOptionPane.showMessageDialog(null, "Sin carnet no hay coche");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Si eres menor no puedes tener carnet, tampoco coche!");
        }
        
        
        
        
    }
    
}
