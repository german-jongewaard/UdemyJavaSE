package eventos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
        
        mimarco.addWindowListener(new EventosDeVentana());
    }
    
}

class MarcoEventoVentana extends JFrame{
    
    
    public MarcoEventoVentana(){
        
        setBounds(300,300,600,350);
        
        setVisible(true);
        
    }    
}

    class EventosDeVentana extends WindowAdapter{

    
        public void windowClosed(WindowEvent e) {
            System.out.println("Gracias por trabajar en la App. Hasta pronto");
        }
        
        public void windowOpened(WindowEvent e) {
            System.out.println("Bienvenido a la App");
        }

     
    
}