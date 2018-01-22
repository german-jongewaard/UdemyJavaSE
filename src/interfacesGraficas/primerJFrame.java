package interfacesGraficas;

 
import javax.swing.JFrame;

/**
 *
 * @author german
 * 
 */
public class primerJFrame {
     
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        JFrame ventana = new JFrame();
        
        ventana.setTitle("Guitar chords");
        
        ventana.setSize(820,300);   

        ventana.setLocationRelativeTo(null);          
                 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ventana.setVisible(true);
     
        
    }
 
    
}
