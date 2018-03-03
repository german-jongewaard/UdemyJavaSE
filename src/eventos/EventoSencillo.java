package eventos;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author german
 * 
 */

public class EventoSencillo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoBotonColores mimarco =  new MarcoBotonColores();
        
        mimarco.setVisible(true);
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MarcoBotonColores extends JFrame {
    
    public MarcoBotonColores(){
        
        setTitle("Botones y eventos");
        
        setBounds(700, 300, 500, 300);
        
        LaminaBotonesColores milamina = new LaminaBotonesColores();
        
        add(milamina);
    }
    
}

class LaminaBotonesColores extends JPanel {
    
    
}
