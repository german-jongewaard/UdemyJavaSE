package Ejercicios_Planteados;
 
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.RadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author german
 * 
 */
public class Video_108_Ejercicio {

    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoGeneral miMarcoGeneral = new MarcoGeneral();
    }    
}

class MarcoGeneral extends JFrame{
    
    public MarcoGeneral(){
        
        setBounds(600, 300, 600, 400);      
        
        add(new LaminaGeneralEvento());
        
        setVisible(true); 
    }
}

class LaminaGeneralEvento extends JPanel{
    
    public LaminaGeneralEvento() {        
 
        setLayout(new BorderLayout());
        
        JPanel superior = new JPanel();  
        
        JPanel central = new JPanel();   
        
        JPanel inferior = new JPanel();
        //*****************************************************     
        nombreEtiqueta = new JLabel("Nombre");        
        nombre = new JTextField(15);                
        apellidoEtiqueta = new JLabel("Apellido");        
        apellido = new JTextField(15);    
        
        superior.add(nombreEtiqueta);
        superior.add(nombre);
        superior.add(apellidoEtiqueta);
        superior.add(apellido);
        //*****************************************************
        miareaTexto = new JTextArea(20,30);        
        laminaScroll = new JScrollPane(miareaTexto);        
        miareaTexto.setLineWrap(true); 
         
        central.add(laminaScroll); 
         //*****************************************************        
        boton1 = new JButton("Boton 1");
        boton2 = new JButton("Boton 2");
        
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                
                
                miareaTexto.setText(nombre.getText() + " " + apellido.getText() + "\n");
            }
        });
        
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                miareaTexto.setText(nombre.getText() + " " + apellido.getText() + "\n");
            }
        });
        
        inferior.add(boton1);
        inferior.add(boton2);
        //*****************************************************
        casilla1 = new JCheckBox("casilla 1");
        casilla1.setSelected(true);
        casilla2 = new JCheckBox("casilla 2"); 
        
        casilla1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(casilla1.isSelected()){
                miareaTexto.setText("Casilla 1 Activada");
            }else{
                miareaTexto.setText("Casilla 1 Desactivada");
            }
            }
        });        
        casilla2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          if(casilla2.isSelected()){
                miareaTexto.setText("Casilla 2 Activada");
            }else {
                miareaTexto.setText("Casilla 2 Desactivada");
            }
            }
        });    
        
        inferior.add(casilla1);
        inferior.add(casilla2);        
        //*****************************************************
        ButtonGroup miGrupoBoton = new ButtonGroup();
        
        radio1 = new JRadioButton("Radio 1");
        radio1.setSelected(true);
        radio2 = new JRadioButton("Radio 2");
        
        radio1.addActionListener(new ManejaRadioButton());
        radio2.addActionListener(new ManejaRadioButton());
        
        miGrupoBoton.add(radio1);
        miGrupoBoton.add(radio2);
        
        inferior.add(radio1);
        inferior.add(radio2); 
        //****************************************************** 
        
        
        
        //*****************************************************   
        add(superior, BorderLayout.NORTH);
        add(central, BorderLayout.CENTER);
        add(inferior, BorderLayout.SOUTH);
    }
      
       private class ManejaRadioButton implements ActionListener{ 
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(radio1.isSelected()) miareaTexto.setText("Radio 1 Activado");
            
            if(radio2.isSelected()) miareaTexto.setText("Radio 2 Activado"); 
        } 
    }
    
      
     private JCheckBox casilla1;
     private JCheckBox casilla2;     
     private JRadioButton radio1;
     private JRadioButton radio2;
     private JButton boton1;
     private JButton boton2;
     private JLabel nombreEtiqueta;
     private JLabel apellidoEtiqueta;
     private JTextField nombre;
     private JTextField apellido;
     private JTextArea miareaTexto;
     private JScrollPane laminaScroll; 
}
