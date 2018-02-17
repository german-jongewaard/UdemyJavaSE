package interfacesGraficas;

import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author german
 * 
 */

public class LetrasEnLocal {
    
    public static void main(String[] args){
     
        //Todas las fuenes de texto estan almacenadas en este array
        String [] misFuentes = GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getAvailableFontFamilyNames();
        
        for(String nombreFuente:misFuentes){
            
            System.out.println("Mi fuente es: " + nombreFuente);
            
        }    
        
    }
}
