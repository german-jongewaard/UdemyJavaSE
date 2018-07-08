package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
            
            azul.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setBackground(Color.BLUE);
                }
            });
            
             verde.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setBackground(Color.GREEN);
                }
            });
            
             rojo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setBackground(Color.RED);
                }
            });
            
            emergente.add(azul);
            emergente.add(verde);
            emergente.add(rojo);
            
            
            setComponentPopupMenu(emergente);
            
        }
}