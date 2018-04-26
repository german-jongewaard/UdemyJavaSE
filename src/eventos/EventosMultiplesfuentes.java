package eventos;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author german
 * 
 */
public class EventosMultiplesfuentes {
  
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoFuentes miMarcoFont = new MarcoFuentes();
        
        miMarcoFont.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
}
    
    
class MarcoFuentes extends JFrame{
    
    public MarcoFuentes(){
        
        setBounds(600, 300, 500, 350);
        
        add(new LaminaFuentes());
        
        setVisible(true);
    }    
}

class LaminaFuentes extends JPanel{
    
        public LaminaFuentes() {

               JButton botonAzul = new JButton("Azul");

               JButton botonAmarillo = new JButton("Amarillo");

               JButton botonRojo = new JButton("Rojo");

        } 
    }


 
