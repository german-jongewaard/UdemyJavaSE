package Excepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author german
 * 
 */
public class Comprueba_mail {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        String mail = JOptionPane.showInputDialog("Introduce email");
        
        examinaMail(mail);
    }

    private static void examinaMail(String mail) {
        
        int arroba = 0;
        
        boolean punto = false;
        
     }
    
}
