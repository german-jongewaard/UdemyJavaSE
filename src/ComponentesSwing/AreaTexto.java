package ComponentesSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author german
 * 
 */
public class AreaTexto {

     public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoAreaTexto mimarco = new MarcoAreaTexto();
                
    }    
}

class MarcoAreaTexto extends JFrame{
    
    public MarcoAreaTexto(){
        
        setBounds(600, 300, 600, 400);
        
        add(new LaminaAreaTexto());
        
        setVisible(true);
    }
}

class LaminaAreaTexto extends JPanel{
    
    public LaminaAreaTexto() {
        
        JTextArea miareaTexto = new JTextArea(7,25);
        
        
        
    }
     
}
