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
        
        mimarco.addWindowListener(new EventosDeVentana());
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
         System.out.println("Ventana abierta");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando ventana");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Ventana cerrada");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
         System.out.println("Ventana minimizada");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana activada");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
         System.out.println("Ventana en segundo plano");
    }  
    
}