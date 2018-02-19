package interfacesGraficas;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
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
        
        //File miImagen = new File("src/interfacesGraficas/imagenes/casa.png");
         File miImagen = new File("src/interfacesGraficas/imagenes/sol.gif");
        
        try {
            imagen = ImageIO.read(miImagen);
        } catch (IOException e) {
            //Logger.getLogger(LaminaImagenes.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Lo siento la imagen no se ha encontrado.");
        }
     
        int anchuraImagen = imagen.getWidth(this);
        
        int alturaImagen = imagen.getHeight(this);
        
        g.drawImage(imagen, 50, 50, this);
        
        g.copyArea(280, 180,  50,  80, 100, 10);

    }
    
    private Image imagen;
}
