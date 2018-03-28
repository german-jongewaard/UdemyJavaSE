package eventos;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;

/**
 *
 * @author german
 * 
 */
public class EventoVentanaVideo88 {
  
    public static void main(String[] args) {
        // TODO code application logic here
        
        NuevoMarcoEventoVentana mimarco = new NuevoMarcoEventoVentana();
        
        mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        mimarco.addWindowStateListener(new NuevoEventosDeVentana());
    }
    
}

class NuevoMarcoEventoVentana extends JFrame{
    
    
    public NuevoMarcoEventoVentana(){
        
        setBounds(300,300,600,350);
        
        setVisible(true);
        
    }     
}

    class NuevoEventosDeVentana implements WindowStateListener {

    @Override
    public void windowStateChanged(WindowEvent e) {
       System.out.println("La ventana ha cambiado de estado");
       
       //System.out.println(e.getNewState());
       
       if(e.getNewState() == Frame.MAXIMIZED_BOTH) 
           System.out.println("Has maximizado la ventana");
       else if(e.getNewState() == Frame.ICONIFIED) 
           System.out.println("Has minimizado la ventana");
       else System.out.println("Has hecho un cambio sin especificar");  
       
       
    } 
    
    
    
    
}