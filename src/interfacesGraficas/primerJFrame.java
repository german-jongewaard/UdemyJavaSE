package interfacesGraficas;
 
import java.awt.Frame;
import javax.swing.JFrame;

/**
 *
 * @author german
 * 
 */
public class primerJFrame {
     
    public static void main(String[] args) {
        // TODO code application logic here 
      /*  
        JFrame ventana = new JFrame();        
        ventana.setTitle("Guitar chords");        
        ventana.setSize(820,300);   
        ventana.setLocationRelativeTo(null);    
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        ventana.setVisible(true);
     */
      
      MiJFrame miNuevaVentana = new MiJFrame();
      
        miNuevaVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    } 
}

class MiJFrame extends JFrame{
    
    public MiJFrame(){
        
        setTitle("Mi Ventana Nueva");
        
        //setLocationRelativeTo(this);
        
        //setSize(820,300); 
        
        //setLocationRelativeTo(null);   
        
        //setResizable(false);
        
        setBounds(500, 200, 450, 450);
        
        setTitle("Ventana de pruebas");
        
        
        
        //setExtendedState(Frame.MAXIMIZED_BOTH);
        
        setVisible(true);
        
    } 
}
