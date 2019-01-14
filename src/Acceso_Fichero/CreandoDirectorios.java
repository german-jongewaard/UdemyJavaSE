package Acceso_Fichero;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author german
 * 
 */
public class CreandoDirectorios {

    public static void main(String[] args) {

        
                File ruta_archivo = new File(File.separator + "home" + File.separator + 
                                            "german" + File.separator + "Escritorio" + File.separator + "externo" 
                                            + File.separator + "datos economicos" + File.separator + "balanceDia.ods");
                
        try {
            //directorio.mkdir();

            ruta_archivo.createNewFile();
                    
                    
                    
                    } catch (IOException ex) {
                            ex.printStackTrace();
        }
                

                
    }
    
}
