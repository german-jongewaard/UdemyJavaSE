package ComponentesSwing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author german
 * 
 */

public class EventoCuadroTexto {
   
    public static void main(String[] args) {
        // TODO code application logic here
        
         MarcoCuadroEvento mimarco = new MarcoCuadroEvento();
        
        
    }
    
}

class MarcoCuadroEvento extends JFrame{
    
    public MarcoCuadroEvento(){
        
        setBounds(600, 300, 600, 400);
        
        add(new LaminaCuadroEvento());
        
        setVisible(true);
    }
}


class LaminaCuadroEvento extends JPanel{
    
    public LaminaCuadroEvento() {
        
        
        
    }
}