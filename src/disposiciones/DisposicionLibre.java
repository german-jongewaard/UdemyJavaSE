package disposiciones;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author german
 */
public class DisposicionLibre {
    
   public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoDispLibre miMarco = new MarcoDispLibre();
        
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MarcoDispLibre extends JFrame{
    
    public MarcoDispLibre(){
        
        setBounds(300, 250, 500, 350);
        
        LaminaDispLibre miLamina = new LaminaDispLibre();
        
        add(miLamina);
        
        setVisible(true);
        
    } 
}

class LaminaDispLibre extends JPanel{
    
    public LaminaDispLibre(){
        
        setLayout(null); //Para poder trabajar con Disposiciones Libres
        
        JLabel nombre = new JLabel("Nombre: ");
        
        JLabel apellido = new JLabel("Apellido: ");
        
        JTextField c_nombre = new JTextField();
        
        JTextField c_apellido = new JTextField();
        
        nombre.setBounds(20, 20, 80, 10);
        
        c_nombre.setBounds(100, 15, 100, 20);
        
        apellido.setBounds(20, 60, 80, 10);
        
        c_apellido.setBounds(100, 55, 100, 20);
        
        add(nombre);
        
        add(c_nombre);
        
        add(apellido);
        
        add(c_apellido);
        
    }
}

class EnColumnas implements LayoutManager{

    @Override
    public void addLayoutComponent(String name, Component comp) {
       
    }

    @Override
    public void removeLayoutComponent(Component comp) {
       
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
       return null;
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
       return null;
    }

    @Override
    public void layoutContainer(Container parent) {
       
    }
    
}
