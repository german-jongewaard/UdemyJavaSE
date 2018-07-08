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
            
            JMenuItem azul = new JMenuItem("Azul");
            JMenuItem verde = new JMenuItem("verde");
            JMenuItem rojo = new JMenuItem("Rojo");
            
            emergente.add(azul);
            emergente.add(verde);
            emergente.add(rojo);
            
            
            setComponentPopupMenu(emergente);
            
        }
}