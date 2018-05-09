package eventos;

import java.awt.Color;
import java.awt.event.*; 
import javax.swing.*; 

/**
 *
 * @author german
 * 
 */
public class EventosMultiplesfuentes {
  
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoFuentes miMarcoFont = new MarcoFuentes();
        
        miMarcoFont.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
}
    
    
class MarcoFuentes extends JFrame{
    
    public MarcoFuentes(){
        
        setBounds(600, 300, 500, 350);
        
        add(new LaminaFuentes());
        
        setVisible(true);
    }    
}

class LaminaFuentes extends JPanel{
    
        public LaminaFuentes() {

              /* JButton botonAzul = new JButton("Azul");

               JButton botonRojo = new JButton("Rojo");

               JButton botonVerde = new JButton("Verde");               
               
               add(botonAzul);
               add(botonRojo);
               add(botonVerde); */
              
              EventoColorDeFondo colorAzul = new EventoColorDeFondo("Azul", Color.BLUE);
              EventoColorDeFondo colorRojo = new EventoColorDeFondo("Rojo", Color.RED);
              EventoColorDeFondo colorVerde = new EventoColorDeFondo("Verde", Color.GREEN);
              
              add(new JButton(colorAzul));
              add(new JButton(colorRojo));
              add(new JButton(colorVerde));

        } 
        
    private class EventoColorDeFondo extends AbstractAction {
    
        public EventoColorDeFondo(String nombre, Color color_fondo){

            putValue(Action.NAME, nombre);
            
            putValue(Action.SHORT_DESCRIPTION, "Pone la lámina JPane de Color: " + nombre);

            putValue("color_fondo_JPanel", color_fondo );

        }

        @Override
        public void actionPerformed(ActionEvent e) {

            Color c = (Color) getValue("color_fondo_JPanel");

            setBackground(c);
            
            System.out.println("Nombre: " + getValue(NAME) + " Descripción: " + getValue(Action.SHORT_DESCRIPTION));
        } 
    }
        
}

 


 
