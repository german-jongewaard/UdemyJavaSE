package interfacesGraficas;

import java.awt.*;
 
import static javafx.scene.paint.Color.color;
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
        
        
       // PrimerPanel milamina = new PrimerPanel();
        
       //add(milamina);
        
        setBounds(400,200,600,450);
        
        setTitle("Escritura en JFrame");
                
        
        PrimerPanel miLamina = new PrimerPanel();
        add(miLamina);
        
        setVisible(true); 
      
    }
    
}

class PrimerPanel extends JPanel{
    
    public PrimerPanel(){
        
        setBackground(new Color(195));
        
        
    }
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Color micolor = new Color(255,128,155);
        
        g.setColor(micolor);
        
        Font miletra = new Font("Courier", 3, 30);
        
        g.setFont(miletra);
        
        g.drawString("Primer panel", 200, 200);
        
         
        
    }

    
    
    
}

