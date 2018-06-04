package ComponentesSwing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
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
        
        miCombo = new JComboBox();
        
        miCombo.addItem("Serif");
        
        miCombo.addItem("SansSerif");
        
        miCombo.addItem("Monospaced");
        
        miCombo.addItem("Dialog");
        
        miCombo.addItem("Calibri");
        
        miCombo.addActionListener(new EventoComboFuente());
        
        superior.add(miCombo);
        
        add(miCombo, BorderLayout.NORTH);
    }
    
    private class EventoComboFuente implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            texto.setFont(new Font((String) miCombo.getSelectedItem(), Font.PLAIN, 18));
                   
        } 
    }
    
    JLabel texto;
    JComboBox miCombo;
}