package interfacesGraficas;

import javax.swing.*;

/**
 *
 * @author german
 * 
 */

public class EscribiendoEnMarco {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoTexto miMarco = new MarcoTexto();
        
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}


class MarcoTexto extends JFrame{
    
    public MarcoTexto(){
        
        setBounds(400,200,600,450);
        
        setTitle("Escritura en JFrame");
        
        setVisible(true);
    }
    
}