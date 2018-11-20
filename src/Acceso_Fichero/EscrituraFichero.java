package Acceso_Fichero;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author german
 * 
 */
public class EscrituraFichero {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Escritura escribeFichero = new Escritura();
        
        escribeFichero.escribiendo();
    }
    
}
class Escritura{
    
    public void escribiendo(){
        
        String texto = JOptionPane.showInputDialog("Introduce el texto");
        
        try {
            FileWriter escritura = new FileWriter("/home/german/Escritorio/primerfichero.txt", true); 
            
             for(int i=0; i<texto.length();i++){
                 
                 escritura.write(texto.charAt(i));
             } 
            
             escritura.close();
            
        } catch (IOException e) {
            System.out.println("Todo mal");
        }
        
        
        
    }
}
