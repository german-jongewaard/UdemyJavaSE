package ComponentesSwing;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
        
        setLayout(new BorderLayout());
        
        texto = new JLabel("En breve aprenderemos JavaFx");
        
        texto.setFont(new Font("Serif", Font.PLAIN, 18));
        
        add(texto, BorderLayout.CENTER);
        
        JPanel superior = new JPanel();
        
    }
    
    private JLabel texto;
}