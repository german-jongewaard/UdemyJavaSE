package interfacesGraficas;

import java.awt.*;
import java.awt.geom.*;
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
            
         /* g.draw3DRect(20, 20, 125, 75, true);            
            g.drawLine(20, 20, 145, 95);            
            g.fillRect(20, 200, 125, 75);
          */
         Graphics2D g2 = (Graphics2D) g;
         
         Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
         
         float midash[] = {10.4f};
         
         BasicStroke milapiz = new BasicStroke(4, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, midash, 0);
         
         g2.setStroke(milapiz);
            
         g2.draw(rectangulo); 
            
            
     } 
}
