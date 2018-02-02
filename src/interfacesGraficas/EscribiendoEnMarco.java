package interfacesGraficas;

import java.awt.*;
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
        
        
        PrimerPanel milamina = new PrimerPanel();
        
        add(milamina);
        
        setBounds(400,200,600,450);
        
        setTitle("Escritura en JFrame");
        
        setVisible(true);
    }
    
}

class PrimerPanel extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Color micolor = new Color(255,128,155);
        
        g.drawString("Primer panel", 20, 20);
        
         
        
    }

    
    
    
}