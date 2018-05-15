package layouts;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author german
 * 
 */
public class Uso_Layout {

    public static void main(String[] args) {
        // TODO code application logic here
             MaroConLayout miMarco=new MaroConLayout();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
	}
}

class MaroConLayout extends JFrame{	
	
	public MaroConLayout(){
		
		setTitle("Disposiciones");
		
		setBounds(600,350,600,300);
		
		PanelconLayout lamina=new PanelconLayout();
                
                //FlowLayout disposicion = new FlowLayout(FlowLayout.RIGHT);
                
               //lamina.setLayout(disposicion);
                
               //lamina.setLayout(new FlowLayout(FlowLayout.RIGHT));
               
		add(lamina);	
	}	
}

class PanelconLayout extends JPanel{
	
		public PanelconLayout(){
                    
                    
                    setLayout(new FlowLayout(FlowLayout.RIGHT));
                         
			
			add(new JButton("Amarillo"));
			
			add(new JButton("Rojo"));	
			
			add(new JButton("Azul"));	
		}
}
