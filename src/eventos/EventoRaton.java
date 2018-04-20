package eventos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
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
        
        miMarco.addMouseMotionListener(new EventosDeRatonArrastre());
        
    }
    
}


class MarcoEventoRaton extends JFrame {
    
    public MarcoEventoRaton(){
        
        setBounds(300, 300, 600, 350);
        
        setVisible(true);
        
    }
}

class EventosDeRatonArrastre implements MouseMotionListener {

    @Override
    public void mouseDragged(MouseEvent e) {
       System.out.println("estas arrastrando el raton...");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("estas moviendo el raton...");
    } 
     
}


class EventosDeRaton extends MouseAdapter {
    
    public void mousePressed(MouseEvent e) {
       
        /* System.out.println("Haz presionado en X: " + e.getX() + 
                " Haz presionado en Y: " + e.getY()); */
       
        
        switch(e.getModifiersEx()){
            
            case MouseEvent.BUTTON1_DOWN_MASK:
                 System.out.println("Haz pulsado el boton izquierdo");
                break;
            case MouseEvent.BUTTON2_DOWN_MASK:
             System.out.println("Haz pulsado el boton de la ruedita");
            break;
            case MouseEvent.BUTTON3_DOWN_MASK:
             System.out.println("Haz pulsado el boton derecho");
            break; 
            
        } 
    }
}

/*
class EventosDeRaton implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Haz echo click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Haz presionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Haz Soltado");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Haz Entrado");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Haz Salido");
    }   
   
} */