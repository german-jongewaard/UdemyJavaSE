package eventos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
        
        miMarco.addMouseListener(new EventosDeRaton());
        
    }
    
}


class MarcoEventoRaton extends JFrame {
    
    public MarcoEventoRaton(){
        
        setBounds(300, 300, 600, 350);
        
        setVisible(true);
        
    }
}


class EventosDeRaton extends MouseAdapter {
    
    public void EventosDeRaton(MouseEvent arg0){
      
        System.out.println("Hace Presionado"); 
    } 
}

/*
class EventosDeRaton implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Hace echo click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Hace presionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Hace Soltado");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Hace Entrado");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Hace Salido");
    }   
   
} */