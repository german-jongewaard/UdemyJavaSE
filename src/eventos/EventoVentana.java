package eventos;

import javax.swing.JFrame;

/**
 *
 * @author german
 * 
 */
public class EventoVentana {
  
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoEventoVentana mimarco = new MarcoEventoVentana();
        
        mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}

class MarcoEventoVentana extends JFrame{
    
    
    public MarcoEventoVentana(){
        
        setBounds(300,300,600,350);
        
        setVisible(true);
        
    }
    
}