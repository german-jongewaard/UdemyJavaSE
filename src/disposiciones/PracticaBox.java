package disposiciones;

import javax.swing.Box;
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
        
        JLabel nUsuario = new JLabel("Nombre");
        
        JTextField cUsuario = new JTextField(10);
        
        cUsuario.setMaximumSize(cUsuario.getPreferredSize());
        
        //-------------------------------------------------
        
        Box cajaUsuario = Box.createHorizontalBox();
        
        cajaUsuario.add(nUsuario);
        
        cajaUsuario.add(this)
        
        
    }
}
