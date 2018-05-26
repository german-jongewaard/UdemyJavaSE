package ComponentesSwing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author german
 * 
 */

public class ManejoCuadroTexto {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoCuadrotexto mimarco = new MarcoCuadrotexto();
        
        
    }
    
}

class MarcoCuadrotexto extends JFrame{
    
    public MarcoCuadrotexto(){
        
        setBounds(600, 300, 600, 400);
        
        add(new LaminaCuadroTexto());
        
        setVisible(true);
    }
}

class LaminaCuadroTexto extends JPanel{
    
    public LaminaCuadroTexto() {
        
        JTextField cuadrotexto = new JTextField(20);
        
        add(cuadrotexto);
        
        JButton boton = new JButton("Obtener texto");
        
        add(boton);
        
    }
}
