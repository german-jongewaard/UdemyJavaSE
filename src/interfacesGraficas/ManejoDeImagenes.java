package interfacesGraficas;

import java.awt.Graphics;
import java.io.File;
import javax.swing.*;

/**
 *
 * @author german
 * 
 */

public class ManejoDeImagenes {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoImagenes mimarco = new MarcoImagenes();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoImagenes extends JFrame{    
    
    public MarcoImagenes (){
        
     setBounds(400, 200, 600, 450);
        
        LaminaImagenes milamina = new LaminaImagenes();
        
        add(milamina);
        
        setVisible(true);            
    }
}

class LaminaImagenes extends JPanel{

    public void paintComponent(Graphics g){
            
        super.paintComponent(g);
        
        File miImagen = new File("src/interfacesGraficas/imagenes/casa.png");

    }
}
