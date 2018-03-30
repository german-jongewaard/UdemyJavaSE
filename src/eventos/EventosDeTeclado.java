package eventos;

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
