package ComponentesSwing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

/**
 *
 * @author german
 * 
 */

public class EventoCuadroTexto {
   
    public static void main(String[] args) {
        // TODO code application logic here        
         MarcoCuadroEvento mimarco = new MarcoCuadroEvento();
    }    
}

class MarcoCuadroEvento extends JFrame{
    
    public MarcoCuadroEvento(){
        
        setBounds(600, 300, 600, 400);
        
        add(new LaminaCuadroEvento());
        
        setVisible(true);
    }
}


class LaminaCuadroEvento extends JPanel{
    
    public LaminaCuadroEvento() {
        
        JTextField cuadroTexto = new JTextField(20);
        
        Document miDocumento = cuadroTexto.getDocument();
        
        miDocumento.addDocumentListener(new EscuchaTexto());
        
        add(cuadroTexto);        
    }
    
    private class EscuchaTexto implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            System.out.println("Has introducido texto...");
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Has borrado texto...");
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            
        }
    } 
}