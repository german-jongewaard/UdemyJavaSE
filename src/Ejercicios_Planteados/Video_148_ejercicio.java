package Ejercicios_Planteados;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author german
 * 
 */
public class Video_148_ejercicio {

  
    public static void main(String[] args) {
        
        
        //Directorio
        String nombreDirectorio = JOptionPane.showInputDialog("¿Qué nombre le quieres dar al Directorio?");                
        File ruta_directorio = new File(File.separator + "home" + File.separator + 
                                           "german" + File.separator + "Escritorio" + File.separator + "externo" 
                                            + File.separator + nombreDirectorio);
        ruta_directorio.mkdir();   
        
        //Archivo
        String nombreArchivoo = JOptionPane.showInputDialog("¿Qué nombre le quieres dar al Archivo?");        
        File ruta_archivo = new File(File.separator + "home" + File.separator + 
                                            "german" + File.separator + "Escritorio" + File.separator + "externo" 
                                            + File.separator + nombreDirectorio + File.separator + nombreArchivoo +".txt");                
        try {
            ruta_archivo.createNewFile();                        
            } catch (IOException ex) {
                ex.printStackTrace();
        }
        
        //Texto         
        String introduceTexto = JOptionPane.showInputDialog("Introduce el texto");        
        try {
            FileWriter escritura = new FileWriter(File.separator + "home" + File.separator + 
                                            "german" + File.separator + "Escritorio" + File.separator + "externo" 
                                            + File.separator + nombreDirectorio + File.separator + nombreArchivoo +".txt");            
            
             for(int i=0; i<introduceTexto.length(); i++){                 
                 escritura.write(introduceTexto.charAt(i));
             } 
            
             escritura.close();
            
        } catch (IOException e) {
            System.out.println("Todo mal");
        }
                
       
    
        //JOptionPane
        int g = JOptionPane.YES_NO_OPTION;
        
        int response = JOptionPane.showConfirmDialog(null, "¿Quieres borrar este Archivo? " + nombreArchivoo + ".txt" , "Volver?", g);
        
        if ( response == JOptionPane.NO_OPTION) {
            System.out.println("Presionaste NO");
            System.exit(0);
            
        } else if ( response == JOptionPane.YES_OPTION) {           
            
            System.out.println("Presionaste SI");
            //Elimino la ruta!
            ruta_archivo.delete();            
            
            JOptionPane.showMessageDialog(null, "El archivo " + nombreArchivoo + ".txt" + " fue eliminado");
            
        } else {
            System.out.println("nada");
            System.exit(0);
        }      
    }
}
