package eventos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author german
 * 
 */
public class EventosDeFoco_Dos {
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoFoco miMarco = new MarcoFoco();
        
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        miMarco.setVisible(true);
        
    }
    
}

class MarcoFoco_Dos extends JFrame{
    
    public MarcoFoco_Dos(){
        
        setBounds(500, 300, 400, 250);
        
        add(new Lamina_Marco_Foco());
    }    
}

class Lamina_Marco_Foco_Dos extends JPanel{
    
   private class EventoDeFoco_Dos implements FocusListener{

    @Override
    public void focusGained(FocusEvent e) {
                 
         System.out.println("El cuadro ha ganado el Foco!");
    }

    @Override
    public void focusLost(FocusEvent e) {
        
        if(e.getSource() == campoTexto1){
            System.out.println("El cuadro 1 ha perdido el Foco!");            
        }else{
            System.out.println("El cuadro 2 ha perdido el Foco!");
        } 
    }  
}
    
    public void paintComponent(Graphics g){
      
        super.paintComponent(g);
        
        campoTexto1 = new JTextField();
        
        campoTexto2 = new JTextField();
        
        campoTexto3 = new JTextField();
        
        etiq1 = new JLabel("Usuario");
        etiq2 = new JLabel("Contraseña");
        etiq3 = new JLabel("Email");
        
        campoTexto1.setBounds(120, 10, 150, 20); 
        
        campoTexto2.setBounds(120, 50, 150, 20);
        
        campoTexto3.setBounds(120, 100, 150, 20);
        
        etiq1.setBounds(70, 10, 150, 20);
        etiq2.setBounds(50, 50, 150, 20);
        etiq3.setBounds(70, 90, 150, 20);
        
        add(campoTexto1);       
        add(campoTexto2);        
        add(campoTexto3);
        add(etiq1);
        add(etiq2);
        add(etiq3);
        
        EventoDeFoco foco = new EventoDeFoco();
        
        campoTexto1.addFocusListener(foco);
        campoTexto2.addFocusListener(foco);
        campoTexto3.addFocusListener(foco);
        
    } 
    
    private JTextField campoTexto1, campoTexto2, campoTexto3;
    
    private JLabel etiq1, etiq2, etiq3;
}

 
