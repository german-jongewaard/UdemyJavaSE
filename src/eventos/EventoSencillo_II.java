package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.StyleConstants;

/**
 *
 * @author german
 */
public class EventoSencillo_II {
    
    public static void main(String[] args) {
        // TODO code application logic here        
        MarcoBotonColores mimarco =  new MarcoBotonColores();
        
        mimarco.setVisible(true);
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}

class MarcoBotonColoresII extends JFrame {
    
    public MarcoBotonColoresII(){
        
        setTitle("Botones y eventos");
        
        setBounds(700, 300, 500, 300);
        
        LaminaBotonesColores milamina = new LaminaBotonesColores();
        
        add(milamina);
    }    
}

class LaminaBotonesColoresII extends JPanel {
    
    JButton botonAzul = new JButton("Azul");
    JButton botonRojo = new JButton("Rojo");
    JButton botonVerde = new JButton("Verde");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonMagenta = new JButton("Magenta");
    
    public LaminaBotonesColoresII(){
        
        add(botonAzul);
        add(botonRojo);
        add(botonVerde);
        add(botonAmarillo);
        add(botonMagenta);
        
        botonAzul.addActionListener(this);
        botonRojo.addActionListener(this);
        botonVerde.addActionListener(this);
        botonAmarillo.addActionListener(this);
        botonMagenta.addActionListener(this);
    } 
    
    //clase Interna, encapsulada con private
    private class ColorDeFondo implements ActionListener{

        public ColorDeFondo(Color c){

            colorDeFondo = c; 
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            setBackground(colorDeFondo);
        }

        private Color colorDeFondo;


    }
    
}

 
