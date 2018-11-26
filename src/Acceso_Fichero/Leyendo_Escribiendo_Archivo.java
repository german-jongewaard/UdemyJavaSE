package Acceso_Fichero;

/**
 *
 * @author german
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Leyendo_Escribiendo_Archivo {

    public static void main(String[] args) {
        
        
        try {
            // TODO code application logic here

            FileInputStream lectura_archivo = new FileInputStream("/home/german/Escritorio/logoGerman.jpg");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Leyendo_Escribiendo_Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
