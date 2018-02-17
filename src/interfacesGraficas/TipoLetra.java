package interfacesGraficas;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author german
 * 
 */

public class TipoLetra {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoFuente mimarco = new MarcoFuente();
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MarcoFuente extends JFrame{
    
    public MarcoFuente(){
        
        setBounds(300, 300, 800, 450);
        
        LaminaFuente milamina = new LaminaFuente();
        
        add(milamina);
        
        setVisible(true); 
    } 
}

class LaminaFuente extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        
        Font miLetra = new Font("Courier New", Font.BOLD, 26);
        
        g2.setFont(miLetra);
        
        g2.drawString("Hola alumnos de Java", 100, 100);
     
        
    }
}
