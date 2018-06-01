package Ejercicios_Planteados;
 
import java.awt.Button;
import javafx.scene.control.RadioButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author german
 * 
 */
public class Video_108_Ejercicio {

    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoGeneral miMarcoGeneral = new MarcoGeneral();
    }    
}

class MarcoGeneral extends JFrame{
    
    public MarcoGeneral(){
        
        setBounds(600, 300, 600, 400);      
        
        add(new LaminaGeneralEvento());
        
        setVisible(true); 
    }
}

class LaminaGeneralEvento extends JPanel{
    
    public LaminaGeneralEvento() {        
 
        
        
    }
    
      
     private JCheckBox casilla1;
     private JCheckBox casilla2;     
     private RadioButton radio1;
     private RadioButton radio2;
     private Button boton1;
     private Button boton2;
     private JLabel texto;
}
