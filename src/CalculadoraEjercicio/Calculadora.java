/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraEjercicio;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author german
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
             MaroConLayout miMarco=new MaroConLayout();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
	}
}

class MaroConLayout extends JFrame{	
	
	public MaroConLayout(){
		
		setTitle("Calculadora");
		
		setBounds(500,300,450,300);
		
		PanelCalculadora lamina=new PanelCalculadora();
                
                
                add(lamina);
           
                
             
	}	
}

class PanelCalculadora extends JPanel{
	
            public PanelCalculadora(){    
                
                setLayout(new BorderLayout());
                
                pantalla = new JButton("0");
                
                pantalla.setEnabled(false); 
                
                add(pantalla, BorderLayout.NORTH);
                
                numeracion = new JPanel();                
                
                numeracion.setLayout(new GridLayout(4,4));
                
           /*     numeracion.add(new JButton("7"));
                numeracion.add(new JButton("8"));
                numeracion.add(new JButton("9"));
                    numeracion.add(new JButton("x"));
                numeracion.add(new JButton("4"));
                numeracion.add(new JButton("5"));
                numeracion.add(new JButton("6"));
                    numeracion.add(new JButton("-"));
                numeracion.add(new JButton("1"));
                numeracion.add(new JButton("2"));
                numeracion.add(new JButton("3"));
                    numeracion.add(new JButton("+"));
                numeracion.add(new JButton("0"));
                numeracion.add(new JButton(","));
                numeracion.add(new JButton("="));
                numeracion.add(new JButton(""));           */
           
           InsertarNumero insertar = new InsertarNumero();
           
           
                ponerBoton("7", insertar);
                ponerBoton("8", insertar);
                ponerBoton("9", insertar);
                ponerBoton("x", insertar);
                ponerBoton("4", insertar);
                ponerBoton("5", insertar);
                ponerBoton("6", insertar);
                ponerBoton("-", insertar);
                ponerBoton("1", insertar);
                ponerBoton("2", insertar);
                ponerBoton("3", insertar);
                ponerBoton("+", insertar);
                ponerBoton("0", insertar);
                ponerBoton(",", insertar);
                ponerBoton("=", insertar);
                ponerBoton("", insertar);
                
                
                add(numeracion, BorderLayout.CENTER);
                 
            }
            
    private void ponerBoton (String textoBoton, InsertarNumero oyente){

            JButton boton = new JButton(textoBoton);
            
            
            
            boton.addActionListener(oyente);

            numeracion.add(boton);
    }
    
    
        private class InsertarNumero implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {


            String entrada = e.getActionCommand();

            pantalla.setText(pantalla.getText() + entrada);

        }


    }
    
    private JButton pantalla;
    private JPanel numeracion;
}


