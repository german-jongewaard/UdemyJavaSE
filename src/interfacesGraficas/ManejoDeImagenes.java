package interfacesGraficas;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author german
 * 
 */
public class ManejoDeImagenes {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoImagenes mimarco = new MarcoImagenes();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoImagenes extends JFrame{
    
    
    public MarcoImagenes (){
        
     setBounds(300, 300, 800, 450);
        
        LaminaImagenes milamina = new LaminaImagenes();
        
        add(milamina);
        
        setVisible(true);    
        
    }
}

class LaminaImagenes extends JPanel{

    public void paintComponent(Graphics g){
 

    }
}
