package disposiciones;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author german
 * 
 */
public class PracticaBox {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoBox miMarcoBox = new MarcoBox();
        
        miMarcoBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MarcoBox extends JFrame{    
    
    public MarcoBox(){
        
        setTitle("Disposición Box");
        
        setBounds(700, 400, 200, 200);
        
        //----- Primer BOX -------------
        
        JLabel nUsuario = new JLabel("Nombre");
        
        JTextField cUsuario = new JTextField(10);
        
        cUsuario.setMaximumSize(cUsuario.getPreferredSize());
        
        //-------------------------------------------------
        
        Box cajaUsuario = Box.createHorizontalBox();
        
        cajaUsuario.add(nUsuario);
        
        cajaUsuario.add(Box.createHorizontalStrut(10));
        
        cajaUsuario.add(cUsuario);
        
        //----- Segundo BOX -------------
        
        JLabel nPass = new JLabel("Contraseña");
        
        JTextField cPass = new JTextField(10);
        
        cUsuario.setMaximumSize(cPass.getPreferredSize());
        
        //-------------------------------------------------
        
        Box cajaPassword = Box.createHorizontalBox();
        
        cajaPassword.add(nPass);
        
        cajaPassword.add(Box.createHorizontalStrut(10));
        
        cajaPassword.add(cPass);
        
        
        //----- Tercer BOX -------------
        
        JButton button1 = new JButton("OK");
        
        JButton button2 = new JButton("Cancelar");
        
        Box cajaBotones = Box.createHorizontalBox();
        
        cajaBotones.add(button1);
        
        cajaBotones.add(Box.createHorizontalGlue());
        
        cajaBotones.add(button2);
        
         //----- Vertical Box -------------
         
         Box cajaVertical = Box.createVerticalBox();
    }
}
