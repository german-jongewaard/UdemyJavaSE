package disposiciones;

import javax.swing.JFrame;

/**
 *
 * @author german
 * 
 */
public class PracticaBox {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoBox miMarcoBox = new MarcoBox();
    }
    
}

class MarcoBox extends JFrame{
    
    
    public MarcoBox(){
        
        setTitle("Disposición Box");
        
        setBounds(700, 400, 200, 200);
    }
}
