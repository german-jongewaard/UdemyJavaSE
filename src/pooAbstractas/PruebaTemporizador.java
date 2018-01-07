package pooAbstractas;

import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author german
 * 
 */
public class PruebaTemporizador {

    public static void main(String[] args) {
        
        Temporizador oyente = new Temporizador();      
        
        
        Timer miTemporizador = new Timer(5000, oyente);
        
        miTemporizador.start();
        
        JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
    }    
}

class Temporizador implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Date horaActual = new Date();
        
        System.out.println("Hola alumnos" + horaActual);
    } 
}
