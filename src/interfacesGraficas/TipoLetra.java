package interfacesGraficas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
    
    public LaminaFuente(){
        
        fuenteElegida = JOptionPane.showInputDialog("Escribe la fuente que quieres utilizar: ");

        letraPresente = false;
        
        misFuentes = GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getAvailableFontFamilyNames(); 
    }
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        
        Font miLetra;
        
        for(String nombreFuente: misFuentes){
         
            //entra en el if, si encuentra en el array de fuentes 
            //la letra que escribio el usuario
            if(nombreFuente.equals(fuenteElegida)) letraPresente = true;            
        }
        
        if(letraPresente){
            miLetra = new Font(fuenteElegida, Font.BOLD, 26);
        }else {
            g2.setPaint(Color.RED);
            
            g2.drawString("No se encontró el tipo especificado, se escribira en Arial",
                    10, 10);
            miLetra = new Font("Arial", Font.BOLD, 26);
        }
        
        g2.setFont(miLetra);
        
        g2.setPaint(Color.BLUE);
        
        g2.drawString("Hola alumnos de Java", 100, 100);
    }
    
    private String fuenteElegida;
    
    boolean letraPresente;
    
    String [] misFuentes;
}
