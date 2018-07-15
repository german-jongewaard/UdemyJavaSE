package disposiciones;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author german
 */
public class DisposicionLibre {
    
   public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoDispLibre miMarco = new MarcoDispLibre();
        
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MarcoDispLibre extends JFrame{
    
    public MarcoDispLibre(){
        
        setBounds(300, 400, 1000, 350);
        
        LaminaDispLibre miLamina = new LaminaDispLibre();
        
        add(miLamina);
        
        setVisible(true);
        
    } 
}

class LaminaDispLibre extends JPanel{
    
    public LaminaDispLibre(){
        
        setLayout(null); //Para poder trabajar con Disposiciones Libres
        
        
        
    }
}
