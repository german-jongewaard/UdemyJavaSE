package eventos;

import javax.swing.JFrame;

/**
 *
 * @author german
 * 
 */
public class BarraHerramientas {

    public static void main(String[] args) {
        
        MarcoBarra miMarco = MarcoBarra();
        
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }    
}

class MarcoBarra extends JFrame{
    
    public MarcoBarra(){
        
        setBounds(600, 300, 500, 350);
        
        add(new LaminaBarra);
        
        setVisible(true);
    }   
}

class LaminaBarra extends JPanel{
    
    public LaminaBarra(){
        
        
    }
    
}
