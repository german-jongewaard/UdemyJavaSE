/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponentesSwing;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 *
 * @author german
 */
public class ManejoDeMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     MarcoDeMenu miMarco = new MarcoDeMenu();
     
     miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }    
}

class MarcoDeMenu extends JFrame{
    
    public MarcoDeMenu(){
        
        setBounds(600, 300, 600, 400);
        
        add(new LaminaDeMenu());
        
        setVisible(true);
    }    
}

class LaminaDeMenu extends JPanel{
    
    public LaminaDeMenu(){
        
        JMenuBar miBarra = new JMenuBar();
        
        //----- Aquí irán los elementos del Menú ----
        
        JMenu archivo = new JMenu("Archivo");
        
        JMenu edicion = new JMenu("Edición");
        
    }
}
 
