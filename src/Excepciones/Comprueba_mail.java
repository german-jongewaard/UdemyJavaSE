package Excepciones;

import java.io.EOFException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
        
        try {
            examinaMail(mail);
        } catch (LongitudMailErronea ex) {            
            System.err.println("El mail es demasiado corto");    
            
            ex.printStackTrace();
        }        
    }

    private static void examinaMail(String mail)  throws LongitudMailErronea{
        
        int arroba = 0;
        
        boolean punto = false;
        
        
        if(mail.length()<=3){
            
            //LongitudMailErronea miException = new LongitudMailErronea("Mail con 3 o menos caracteres");
            
            //throw miException;
            
            throw new LongitudMailErronea("Mail con 3 o menos caracteres"); //Ms simplificado!
            
            
            
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
        }else{
            System.out.println("No es correcto");
        }          
        
     }
    
}

//Construyo mi porpia Excepcion

class LongitudMailErronea extends Exception{
    
    public LongitudMailErronea(){ }
    
    public LongitudMailErronea(String mensajeError){
        
        super(mensajeError);
    }
    
}
