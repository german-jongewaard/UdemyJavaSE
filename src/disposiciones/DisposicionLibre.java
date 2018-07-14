package disposiciones;

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
        
        LaminaDispLibre miLamina = new LaminaMuelle();
        
        add(miLamina);
        
        setVisible(true);
        
    } 
}

class LaminaMuelle extends JPanel{
    
    public LaminaMuelle(){
        
    }
    }
