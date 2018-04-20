package eventos;

import javax.swing.JFrame;

/**
 *
 * @author german
 * 
 */
public class EventoRaton {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoEventoRaton miMarco = new MarcoEventoRaton();
        
        miMarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
    
}


class MarcoEventoRaton extends JFrame {
    
    public MarcoEventoRaton(){
        
        setBounds(300, 300, 600, 350);
        
        setVisible(true);
        
    }
}