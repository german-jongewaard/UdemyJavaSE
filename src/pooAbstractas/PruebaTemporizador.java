package pooAbstractas;

import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author german
 * 
 */

//Modificación en el video 64 - clase 4

public class PruebaTemporizador {

    public static void main(String[] args) {
        
        //Temporizador oyente = new Temporizador();      
        
                        //ActionListener es una clase interna ANONIMA
        Timer miTemporizador = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        }(
        
        
        
        
        ));
        
        miTemporizador.start();
        
        JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
    }    
}

//class Temporizador implements ActionListener{
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        
//        Date horaActual = new Date();
//        
//        System.out.println("Hola alumnos" + horaActual);
//    } 
//}
