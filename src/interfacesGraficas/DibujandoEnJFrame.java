package interfacesGraficas;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author german
 * 
 */

public class DibujandoEnJFrame {

    public static void main(String[] args) {
        // TODO code application logic here
        MarcoDibujo mimarco = new MarcoDibujo();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }    
}

class MarcoDibujo extends JFrame{
    
    public MarcoDibujo(){
    
        setBounds(400,200,800,450);
        
        setTitle("Escritura en JFrame");     
        
        LaminaDibujo milamina = new LaminaDibujo();
        
        add(milamina);
        
        setVisible(true);
    }
}

class LaminaDibujo extends JPanel{
    
     public void paintComponent(Graphics g){
        
            super.paintComponent(g);
            
            g.draw3DRect(20, 20, 125, 75, true);
            
            g.drawLine(20, 20, 145, 95);
            
            g.fillRect(20, 200, 125, 75);
            
            
     } 
}
