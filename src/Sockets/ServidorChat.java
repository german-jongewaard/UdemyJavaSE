package Sockets;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author german
 */
public class ServidorChat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        MarcoServidorChat miMarco = new MarcoServidorChat();
        
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MarcoServidorChat extends JFrame{
    
    public MarcoServidorChat(){
        
        setBounds(800, 300, 400, 350);
        
        JPanel miLamina = new JPanel();
        
        miLamina.setLayout(new BorderLayout());
        
        areaTexto = new JTextArea();
        
        add(miLamina);
        
        setVisible(true);        
    }
    
    private JTextArea areaTexto;   
    
}
