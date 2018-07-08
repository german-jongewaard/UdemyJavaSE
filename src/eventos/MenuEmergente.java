package eventos;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

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
        
        add(new EmergentePanel());
        
        setVisible(true);
    }    
}


class EmergentePanel extends JPanel{
    
        public EmergentePanel() {
            
            JPopupMenu emergente = new JPopupMenu();
            
            JMenuItem opcion1 = new JMenuItem("Opcion 1");
            
            emergente.add(opcion1);
            
            setComponentPopupMenu(emergente);
            
        }
}