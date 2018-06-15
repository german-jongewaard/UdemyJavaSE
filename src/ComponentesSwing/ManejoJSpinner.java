package ComponentesSwing;

import java.awt.Dimension;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author german
 * 
 */
public class ManejoJSpinner {

    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoJSpinner miMarco = new MarcoJSpinner();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }    
}

class MarcoJSpinner extends JFrame{
    
    public MarcoJSpinner(){
        
        setBounds(600, 300, 600, 400);
        
        add(new LaminaJSpinner());
        
        setVisible(true);
    }    
}

class LaminaJSpinner extends JPanel{
    
    public LaminaJSpinner(){
        
        String meses[]= {"Enero","Febrero","Marzo","Abril","Mayo",
            "Junio","Julio","Agosto","Septiembre","Octubre",
            "Noviembre","Diciembre"};
        
       //JSpinner control = new JSpinner(new SpinnerListModel(meses));        
        //Dimension d = new Dimension(150, 20);
        
        JSpinner control = new JSpinner();        
         
        control.setPreferredSize(new Dimension(150, 20));
        
         
        control.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                    System.out.println("seria.." + control.getValue());
            }
        });
        
        add(control);
        
    }
}
