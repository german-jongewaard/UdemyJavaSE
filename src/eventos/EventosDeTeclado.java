package eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author german
 * 
 */
public class EventosDeTeclado {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Marcoeventoteclado mimMarco = new Marcoeventoteclado();
        
        mimMarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}


class Marcoeventoteclado extends JFrame{
    
    public Marcoeventoteclado(){
     
        setBounds(300, 300, 600, 350);
        
        setVisible(true);
        
    }
}

class MiEventoDeTeclado implements  KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
     
    }

    @Override
    public void keyPressed(KeyEvent e) {
     
    }

    @Override
    public void keyReleased(KeyEvent e) {
     
    }
    
    
}
