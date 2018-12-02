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
        
        int contador = 0;
        int bytesImagen[] = new int[445209];
        
        try {          
            FileInputStream lectura_archivo = new FileInputStream("/home/german/Escritorio/logoGerman.jpg");
            
            boolean final_archivo = false;
            
            
            while (!final_archivo) {//Mientras no hayas llegado al final del archivo
                
                int byteImagenEntrada = lectura_archivo.read();
                
                if(byteImagenEntrada!=-1)bytesImagen[contador] = byteImagenEntrada;
                
                //if(byteImagenEntrada == -1)//Si has llegado al final de la lectura de la imagen                   
                else    final_archivo = true;
                    
                   // System.out.println(byteImagenEntrada);
                   
                   
                System.out.println(bytesImagen[contador]);
                   
                contador++;
            }
            
            lectura_archivo.close(); 
            
        } catch (IOException e) {
            System.out.println(e);
        }
       // System.out.println(contador);
        
    }
    
}
