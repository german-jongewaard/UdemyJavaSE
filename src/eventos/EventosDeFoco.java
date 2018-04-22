package eventos;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author german
 * 
 */
public class EventosDeFoco {
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoFoco miMarco = new MarcoFoco();
        
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        miMarco.setVisible(true);
        
    }
    
}

class MarcoFoco extends JFrame{
    
    public MarcoFoco(){
        
        setBounds(500, 300, 400, 250);
        
        add(new Lamina_Marco_Foco());
    }
    
}

class Lamina_Marco_Foco extends JPanel{
    
    public void paintComponent(Graphics g){
      
        super.paintComponent(g);
        
    } 
}
