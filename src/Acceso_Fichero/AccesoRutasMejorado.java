/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_Fichero;

import java.io.File;

/**
 *
 * @author german
 */
public class AccesoRutasMejorado {

   public static void main(String[] args) {
        // TODO code application logic here
        
        File directorio = new File(File.separator + "home" + File.separator + "german" + File.separator + "Escritorio" + File.separator + "externo");
        
        System.out.println(directorio.getAbsolutePath());
        
        //System.out.println(archivo.exists());
        
        String [] nombres = directorio.list();
        
        for (int i = 0; i < nombres.length; i++) {
            
            System.out.println(nombres[i]);   
            
            File nuevoDirectorio = new File(directorio.getAbsolutePath(), nombres[i]);
            
            
            
            if(nuevoDirectorio.isDirectory()){                
                
                String [] archivos_subcarpeta = nuevoDirectorio.list();
                
                for (int j = 0; j < archivos_subcarpeta.length; j++) {
                    
                 System.out.println(archivos_subcarpeta[j] + "--> proviene del directorio " + nuevoDirectorio.getAbsolutePath());   
                 
                }
                 
            }
         
             

        }
         
        
        
    }
    
}
