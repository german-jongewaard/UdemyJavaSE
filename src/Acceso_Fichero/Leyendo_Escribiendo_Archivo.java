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
            FileInputStream lectura_archivo = new FileInputStream("/home/german/Escritorio/logoGerman.jpg");
            
            boolean final_archivo = false;
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
    
}
