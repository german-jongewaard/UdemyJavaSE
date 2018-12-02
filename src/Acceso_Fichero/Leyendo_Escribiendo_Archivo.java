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
            
            while (!final_archivo) {//Mientras no hayas llegado al final del archivo
                
                int byteImagenEntrada = lectura_archivo.read();
                
                if(byteImagenEntrada == -1)//Si has llegado al final de la lectura de la imagen                   
                    final_archivo = true;
                    
                    System.out.println(byteImagenEntrada);
                
            }
            
        } catch (IOException e) {
            System.out.println(e);
        }
        
        
    }
    
}
