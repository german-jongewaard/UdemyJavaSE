package eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
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

class EventosDeVentana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
}