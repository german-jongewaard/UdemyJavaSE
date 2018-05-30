package ComponentesSwing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
        
        
        
        add(new LaminaCheckBoxEvento());
        
        setVisible(true);
    }
}


class LaminaCheckBoxEvento extends JPanel{
    
    public LaminaCheckBoxEvento() {        
        
        setLayout(new BorderLayout());
                
        miTexto = new JTextField("Este texto puede cambiar...");

        miTexto.setEnabled(true); 

        add(miTexto, BorderLayout.NORTH);
                
        JCheckBox miBoxUno = new JCheckBox("Negrita");
        
        JCheckBox miBoxDos = new JCheckBox("Cursiva");
        
        add(miBoxUno, BorderLayout.SOUTH);
        
        add(miBoxDos, BorderLayout.AFTER_LAST_LINE);
        
        
        }
    
     private JTextField miTexto;
    }