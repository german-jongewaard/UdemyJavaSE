package Sockets;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author german
 */
public class ClienteChat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoClienteChat miMarco = new MarcoClienteChat();
        
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }    
}

class MarcoClienteChat extends JFrame{
    
    public MarcoClienteChat(){
        
        setBounds(200, 350, 400, 150);
        
        LaminaClienteChat miLamina = new LaminaClienteChat();
        
        add(miLamina);
        
        setVisible(true);        
    }
    
    private JTextArea areaTexto;       
}
class LaminaClienteChat extends JPanel {
    
    public LaminaClienteChat(){
        
        JLabel cliente = new JLabel("CLIENTE");
        
        add(cliente);
        
        campo1 = new JTextField(20);
        
        add(campo1);
        
        miBotton = new JButton("Enviar");
        
        miBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.err.println(campo1.getText());
                
            }
        });
        
        
        add(miBotton);        
    }

private JTextField campo1;    

private JButton miBotton;
    
}
