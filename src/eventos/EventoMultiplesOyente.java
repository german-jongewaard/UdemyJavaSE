package eventos;

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
public class EventoMultiplesOyente {

    public static void main(String[] args) {
        // TODO code application logic here        
        Marco_Principal miMarco_Pr = new Marco_Principal();        
        miMarco_Pr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        miMarco_Pr.setVisible(true);
    }    
}

class Marco_Principal extends JFrame{
    
    public Marco_Principal(){
     
        setTitle("Multiples oyentes");
        
        setBounds(1300, 100, 300, 200);
        
        Lamina_Principal lamina = new Lamina_Principal();
        
        add(lamina);
    }
}

class Lamina_Principal extends JPanel {    
    
    public Lamina_Principal(){
        
        JButton boton_nuevo = new JButton("Nuevo");
        
        add(boton_nuevo);
        
        boton_cerrar = new JButton("Cerrar todo");  
        
        add(boton_cerrar);
        
        boton_nuevo.addActionListener(new Crea_Marco());
        
    }
    
    private class Crea_Marco implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            Marco_Nuevo miMarco = new Marco_Nuevo(boton_cerrar);
            
            miMarco.setVisible(true);            
        }        
    }
    
    JButton boton_cerrar;
}

class Marco_Nuevo extends JFrame {
    
    public Marco_Nuevo (JButton botonCierra){
        
        contador++;
        
        setTitle("Ventana " + contador);
        
        setBounds(50*contador, 50*contador, 350, 200);
        
        botonCierra.addActionListener(new  CierraTodo());        
        
        
    } 
    
    private class CierraTodo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
          dispose();
        }        
    }
    
    private static int contador = 0;
}

