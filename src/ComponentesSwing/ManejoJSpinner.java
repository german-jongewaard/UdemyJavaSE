package ComponentesSwing;

import javax.swing.*;

/**
 *
 * @author german
 * 
 */
public class ManejoJSpinner {

    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoJSpinner miMarco = new MarcoJSpinner();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }    
}

class MarcoJSpinner extends JFrame{
    
    public MarcoJSpinner(){
        
        setBounds(600, 300, 600, 400);
        
        add(new LaminaJSpinner());
        
        setVisible(true);
    }    
}

class LaminaJSpinner extends JPanel{
    
    public LaminaJSpinner(){
        
        JSpinner control = new JSpinner();
         
        control.addChangeListener(listener);
        
        add(control);
        
    }
}
