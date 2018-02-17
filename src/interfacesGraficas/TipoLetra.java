package interfacesGraficas;

import javax.swing.JFrame;

/**
 *
 * @author german
 * 
 */

public class TipoLetra {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoFuente mimarco = new MarcoFuente();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MarcoFuente extends JFrame{
    
    public MarcoFuente(){
        
        setBounds(300, 300, 800, 450);
        
        LaminaFuente milamina = new LaminaFuente();
        
        add(milamina);
        
        setVisible(true); 
    } 
}
