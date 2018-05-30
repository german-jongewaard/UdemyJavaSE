package ComponentesSwing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
                
        texto = new JLabel("Este texto puede cambiar...");        
         
        texto.setFont(new Font("Courier", Font.PLAIN, 24));
        
        JPanel superior = new JPanel();
        
        JPanel inferior = new JPanel();
        
        superior.add(texto);  
        
        negrita = new JCheckBox("Negrita");
        
        cursiva = new JCheckBox("Cursiva");       
       
        inferior.add(negrita);
        
        inferior.add(cursiva);
        
        add(superior, BorderLayout.NORTH);
        
        add(inferior, BorderLayout.SOUTH);
         
         
        
        }
    
     private JTextField miTexto;
     
     private JCheckBox negrita;
     private JCheckBox cursiva;
     
     private JLabel texto;
    }