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
        
        
       // PrimerPanel milamina = new PrimerPanel();
        
       //add(milamina);
        
        setBounds(400,200,600,450);
        
        setTitle("Escritura en JFrame");
        
        setVisible(true);
        
        add(new JPanel (){
            
           public void paintComponent(Graphics g){
        
                super.paintComponent(g);

                g.setColor(new Color(255,128,155));

                g.setFont(new Font("Courier", 3, 30));

                g.drawString("Primer panel", 200, 200); 
            
           }
            
        });
    }
    
}
/*
class PrimerPanel extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Color micolor = new Color(255,128,155);
        
        g.setColor(micolor);
        
        Font miletra = new Font("Courier", 3, 30);
        
        g.setFont(miletra);
        
        g.drawString("Primer panel", 200, 200);
        
         
        
    }

    
    
    
}

*/