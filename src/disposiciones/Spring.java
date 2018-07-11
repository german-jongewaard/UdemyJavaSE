package disposiciones;

import javax.swing.JFrame;

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
