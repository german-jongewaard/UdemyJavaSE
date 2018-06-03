package ComponentesSwing;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author german
 * 
 */
public class ManejoJComboBox {

    public static void main(String[] args) {
        // TODO code application logic here
        MarcoComboBox miMarcoComboBox = new MarcoComboBox();
        
        miMarcoComboBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }    
}

class MarcoComboBox extends JFrame{
    
    public MarcoComboBox(){
        
        setBounds(600, 300, 600, 400);
        
        add(new LaminaComboBox());
        
        setVisible(true);
    }
    
}

class LaminaComboBox extends JPanel{
    
    public LaminaComboBox(){
        
    }
}