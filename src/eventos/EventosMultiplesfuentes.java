package eventos;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
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
        
        MarcoFuentes miMarcoFuente = new MarcoFuentes();
        
        miMarcoFuente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        miMarcoFuente.setVisible(true);
        
    }
    
    
class MarcoFuentes extends JFrame{
    
    public MarcoFuentes(){
        
        setBounds(600, 300, 500, 350);
        
        add(new LaminaFuentes());
    }    
}

class LaminaFuentes extends JPanel{
    
    public LaminaFuentes() {

    }

    
    }
}
