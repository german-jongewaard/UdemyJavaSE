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
 * 
 */

public class Calculadora {
    
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
                
                comienzo = true;
                
                setLayout(new BorderLayout());
                
                pantalla = new JButton("0");
                
                pantalla.setEnabled(false); 
                
                add(pantalla, BorderLayout.NORTH);
                
                numeracion = new JPanel();                
                
                numeracion.setLayout(new GridLayout(4,4)); 
           
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
                ponerBoton("/", insertar);                
                
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

                if(comienzo == true){

                    pantalla.setText(entrada);

                    comienzo = false;     
                
            }else {
                    pantalla.setText(pantalla.getText() + entrada);
                    
            }                         

        }
    }
    
    private JButton pantalla;
    private JPanel numeracion;
    private boolean comienzo;
    
    private String ultimaOperacion = "";
    private double resultado;
    private double ultimoValor;
    
}


