/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponentesSwing;

import javax.swing.JFrame;
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
     MarcoJSpinner2 miMarco = new MarcoJSpinner2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }    
}

class MarcoJSpinner2 extends JFrame{
    
    public MarcoJSpinner2(){
        
        setBounds(600, 300, 600, 400);
        
        add(new LaminaJSpinner());
        
        setVisible(true);
    }    
}

class LaminaJSpinner2 extends JPanel{
    
    public LaminaJSpinner2(){
        
    }
}
 
