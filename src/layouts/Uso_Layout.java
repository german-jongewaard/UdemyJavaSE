package layouts;

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
		
		add(lamina);
	
	}
	
}

class PanelconLayout extends JPanel{
	
		public PanelconLayout(){
			
			add(new JButton("Amarillo"));
			
			add(new JButton("Rojo"));	
			
			add(new JButton("Azul"));	
			
			
		}
}
