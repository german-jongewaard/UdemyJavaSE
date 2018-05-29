package ComponentesSwing;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author german
 * 
 */
public class ManejoCheckBox {

    public static void main(String[] args) {
        // TODO code application logic here
         MarcoCheckBoxEvento mimarco = new MarcoCheckBoxEvento();
    }
    
}

class MarcoCheckBoxEvento extends JFrame{
    
    public MarcoCheckBoxEvento(){
        
        setBounds(600, 300, 600, 400);
        
        add(new LaminaCuadroEvento());
        
        setVisible(true);
    }
}


class LaminaCheckBoxEvento extends JPanel{
    
    public LaminaCheckBoxEvento() {
        
        
        
        }
    }