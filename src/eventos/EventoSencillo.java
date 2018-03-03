package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author german
 * 
 */

public class EventoSencillo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoBotonColores mimarco =  new MarcoBotonColores();
        
        mimarco.setVisible(true);
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MarcoBotonColores extends JFrame {
    
    public MarcoBotonColores(){
        
        setTitle("Botones y eventos");
        
        setBounds(700, 300, 500, 300);
        
        LaminaBotonesColores milamina = new LaminaBotonesColores();
        
        add(milamina);
    }
    
}

class LaminaBotonesColores extends JPanel implements ActionListener{
    
    JButton botonAzul = new JButton("Azul");
    JButton botonRojo = new JButton("Rojo");
    JButton botonVerde = new JButton("Verde");
    
    public LaminaBotonesColores(){
        
        add(botonAzul);
        add(botonRojo);
        add(botonVerde);
        
        botonAzul.addActionListener(this);
        botonRojo.addActionListener(this);
        botonVerde.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      // TODO code application logic here
      
      Object botonPulsado = e.getSource();
      
      if(botonPulsado == botonAzul) setBackground(Color.BLUE);
      if(botonPulsado == botonRojo) setBackground(Color.RED);
      if(botonPulsado == botonVerde) setBackground(Color.GREEN);
        
    }
}
