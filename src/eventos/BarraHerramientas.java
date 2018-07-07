package eventos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import static javax.swing.Action.NAME;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

/**
 *
 * @author german
 * 
 */
public class BarraHerramientas {

    public static void main(String[] args) {
        
        MarcoBarra miMarco = new MarcoBarra();
        
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        miMarco.setVisible(true);
    }    
}

class MarcoBarra extends JFrame{
    
    public MarcoBarra(){
        
        setBounds(600, 300, 500, 350);
        
        miLamina = new JPanel();
        
        add(miLamina);
        
        //add(new LaminaBarra());
        
        //setVisible(true);
   /* }   
}

class LaminaBarra extends JPanel{
    
    public LaminaBarra() {

               JButton botonAzul = new JButton("Azul");

               JButton botonRojo = new JButton("Rojo");

               JButton botonVerde = new JButton("Verde");               
               
               add(botonAzul);
               add(botonRojo);
               add(botonVerde); */
              
              EventoColorDeFondo colorAzul = new EventoColorDeFondo("Azul", Color.BLUE, new ImageIcon("src/eventos/imagenes/bola_azul.gif"));
              EventoColorDeFondo colorRojo = new EventoColorDeFondo("Rojo", Color.RED, new ImageIcon("src/eventos/imagenes/bola_roja.gif"));
              EventoColorDeFondo colorVerde = new EventoColorDeFondo("Verde", Color.GREEN, new ImageIcon("src/eventos/imagenes/bola_amarilla.gif"));
              
//              add(new JButton(colorAzul));
//              add(new JButton(colorRojo));
//              add(new JButton(colorVerde));
//              
//              
//              InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
//              
//              //KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl A");
//              KeyStroke teclaRojo = KeyStroke.getKeyStroke("ctrl R");
//              KeyStroke teclaVerde = KeyStroke.getKeyStroke("ctrl W");
//              
//              mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo azul");
//              mapaEntrada.put(teclaRojo, "fondo rojo");
//              mapaEntrada.put(teclaVerde, "fondo verde");
//              
//              ActionMap mapaAccion = getActionMap();
//              
//              mapaAccion.put("fondo azul", colorAzul);
//              
//              mapaAccion.put("fondo rojo", colorRojo);
//              
//              mapaAccion.put("fondo verde", colorVerde);
              
              JToolBar barra = new JToolBar();
              
              barra.add(colorAzul);
              barra.add(colorRojo);
              barra.add(colorVerde);
              
              add(barra, BorderLayout.NORTH);

        } 
        
    private class EventoColorDeFondo extends AbstractAction {
    
        public EventoColorDeFondo(String nombre, Color color_fondo, Icon icono){

            putValue(Action.NAME, nombre);
            
            putValue(Action.SMALL_ICON, icono);
            
            putValue(Action.SHORT_DESCRIPTION, "Pone la lámina JPane de Color: " + nombre);

            putValue("color_fondo_JPanel", color_fondo );

        }

        @Override
        public void actionPerformed(ActionEvent e) {

            Color c = (Color) getValue("color_fondo_JPanel");

            miLamina.setBackground(c);
            
            System.out.println("Nombre: " + getValue(NAME) + " Descripción: " + getValue(Action.SHORT_DESCRIPTION));
        } 
    }
    
    JPanel miLamina;
}
