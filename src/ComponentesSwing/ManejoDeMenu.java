/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponentesSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author german
 */
public class ManejoDeMenu {
    
    public static void main(String[] args) {
        // TODO code application logic here
     MarcoDeMenu miMarco = new MarcoDeMenu();
     
     miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }    
}

class MarcoDeMenu extends JFrame{
    
    public MarcoDeMenu(){
        
        setBounds(600, 300, 600, 400);
        
        add(new LaminaDeMenu());
        
        setVisible(true);
    }    
}

class LaminaDeMenu extends JPanel{
    
    public LaminaDeMenu(){
        
        JMenuBar miBarra = new JMenuBar();
        
        //----- Aquí irán los elementos del Menú ----
        
        JMenu archivo = new JMenu("Archivo");
        
        JMenu edicion = new JMenu("Edición");
        
        JMenu herramientas = new JMenu("Herramientas");
        
        miBarra.add(archivo);
        miBarra.add(edicion);
        miBarra.add(herramientas);
        
        //---- Aquí irían los elementos de Archivo -------
        
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardarComo = new JMenuItem("Guardar como");
        
         guardar.addActionListener(new  ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 System.out.println("Has guardado");
            }
        });
        archivo.add(guardar);
        
        archivo.add(guardarComo);
        
        //---- Aquí irían los elementos de Edición -------
        
        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem pegar = new JMenuItem("Pegar");
        
        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);         
        
        //---- Aquí irían los elementos de Herramientas -------
        JMenuItem opciones = new JMenuItem("Opciones");
        JMenu preferencias = new JMenu("Preferencias");
        
        herramientas.add(opciones);
        herramientas.addSeparator();
        herramientas.add(preferencias);
        
        //---- Aquí iran las opciones de Preferencias -------
         JMenuItem ayuda = new JMenuItem("Ayuda");
         
         JMenuItem generales = new JMenuItem("Generales");
         
         preferencias.add(ayuda);
         preferencias.add(generales);
        
        
        
        add(miBarra);
        
    }
}
 
