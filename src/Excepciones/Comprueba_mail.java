package Excepciones;

import java.io.EOFException;
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
        
        try{
        examinaMail(mail);
        }catch(EOFException e){
            e.printStackTrace();
        }
            
    }

    private static void examinaMail(String mail)  throws EOFException{
        
        int arroba = 0;
        
        boolean punto = false;
        
        
        if(mail.length()<=3){
            
            EOFException miEOFException = new EOFException();
            
        }
        
        
        
        for(int i=0; i<mail.length(); i++){
            
            if(mail.charAt(i)=='@'){
                arroba++;
            }
            
            if(mail.charAt(i)=='.'){
                punto=true;
            }
            
        }
        
        if(arroba==1 && punto==true){
            System.out.println("Es correcto");
        }
        
     }
    
}
