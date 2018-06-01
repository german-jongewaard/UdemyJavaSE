package ComponentesSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author german
 * 
 */
public class ManejoRadioButton {

    public static void main(String[] args) {
        // TODO code application logic here
        MarcoRadioButtonEvento mimarco = new MarcoRadioButtonEvento();
    }
    
}

class MarcoRadioButtonEvento extends JFrame{
    
    public MarcoRadioButtonEvento(){
        
        setBounds(600, 300, 600, 400); 
        
        add(new LaminaRadioButtonEvento());
        
        setVisible(true);
    }
}

class LaminaRadioButtonEvento extends JPanel{
    
    public LaminaRadioButtonEvento(){
        
        
        
        boton1 = new JRadioButton("Masculino");
        boton1.setSelected(true);
        boton2 = new JRadioButton("Femenino");
        boton3 = new JRadioButton("Neutro");
                
        ButtonGroup miGrupo = new ButtonGroup();
        
        miGrupo.add(boton1);
        miGrupo.add(boton2);
        miGrupo.add(boton3);
        
        add(boton1);
        add(boton2);
        add(boton3);
        
    } 
    
    private class ManejaRadioButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(boton1.isSelected()) System.out.println("has seleccionado Masculino");
                
            
        }
        
    }
    
    private JRadioButton boton1, boton2, boton3;
}