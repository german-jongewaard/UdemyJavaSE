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
        
        mimMarco.addKeyListener(new MiEventoDeTeclado());
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
        
       // System.out.println("Has pulsado una tecla");
     
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        if(e.getKeyCode()==74) System.out.println("Has pulsado la tecla J");
        
     System.out.println("Has pulsado la tecla: " + e.getKeyChar() + " Has pulsado el simbolo: " + e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
     //System.out.println("Has soltado una tecla");
    }
    
    
}
