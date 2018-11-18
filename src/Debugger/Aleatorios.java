package Debugger;

import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author german
 * 
 */
public class Aleatorios {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos de la matriz"));
        
        int num_aleat[] = new int[elementos];
        
        for(int i=0; i<num_aleat.length; i++){
            
            num_aleat[i] = (int) (Math.random()*100); 
            
        }
        
        for(int elem:num_aleat){
            
            System.out.println(elem);
            
        }
    }
    
}
