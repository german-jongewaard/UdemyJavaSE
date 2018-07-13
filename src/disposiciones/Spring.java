package disposiciones;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author german
 * 
 */
public class Spring {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoMuelle miMarco = new MarcoMuelle();
        
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MarcoMuelle extends JFrame{
    
    public MarcoMuelle(){
        
        setBounds(300, 400, 1000, 350);
        
        LaminaMuelle miLamina = new LaminaMuelle();
        
        add(miLamina);
        
        setVisible(true);
        
    } 
}

class LaminaMuelle extends JPanel{
    
    public LaminaMuelle(){
        
        JButton boton1 = new JButton("Boton 1");
        JButton boton2 = new JButton("Boton 2");
        JButton boton3 = new JButton("Boton 3");
    }
}
