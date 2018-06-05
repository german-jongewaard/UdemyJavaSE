package ComponentesSwing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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
        
        JPanel superior = new JPanel();
        
        miCombo = new JComboBox();
        
        miCombo.addItem("Serif");        
        miCombo.addItem("SansSerif");        
        miCombo.addItem("Monospaced");        
        miCombo.addItem("Dialog");        
        miCombo.addItem("Calibri");
        
        miCombo.addActionListener(new EventoComboFuente()); 
        
        superior.add(miCombo);
        
        add(superior, BorderLayout.NORTH);
        
        miSlider = new JSlider(8, 36, 24);
        
        miSlider.setMajorTickSpacing(12);
        
        miSlider.setMinorTickSpacing(2);
        
        miSlider.setPaintTicks(true);
        
        miSlider.setPaintLabels(true); 
        
        miSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                texto.setFont(new Font((String) miCombo.getSelectedItem(), Font.PLAIN, miSlider.getValue()));
            }
        });        
        
        superior.add(miSlider);
        
        add(superior, BorderLayout.NORTH); 
        
        //********************************************************
        
        texto = new JLabel("En breve aprenderemos JavaFx");
        
        texto.setFont(new Font("Serif", Font.PLAIN, 18));
        
        add(texto, BorderLayout.CENTER); 
    }
    
    private class EventoComboFuente implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            texto.setFont(new Font((String) miCombo.getSelectedItem(), Font.PLAIN, miSlider.getValue()));                   
        } 
    }
    
    JLabel texto;
    JComboBox miCombo;
    JSlider miSlider;
}