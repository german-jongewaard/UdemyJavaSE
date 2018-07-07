package eventos;

import javax.swing.JFrame;

/**
 *
 * @author german
 * 
 */
public class MenuEmergente {

    public static void main(String[] args) {
        // TODO code application logic here
        
        EmergenteFrame miMarcoFont = new EmergenteFrame();
        
        miMarcoFont.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        
    }
}
    
    
class EmergenteFrame extends JFrame{
    
    public EmergenteFrame(){
        
        setBounds(600, 300, 500, 350);
        
        add(new LaminaFuentes());
        
        setVisible(true);
    }    
}
