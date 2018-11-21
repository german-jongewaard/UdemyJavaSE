/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso_Fichero;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author german
 */
public class AccesoFicheroConBuffer {

       public static void main(String[] args) {
        // TODO code application logic here
        
        LeerFicheroConBuffer accesoExternpo = new LeerFicheroConBuffer();
        
        accesoExternpo.leeDatosConBuffer();
        
    }
    
}


class LeerFicheroConBuffer{

    public void leeDatosConBuffer() {
        
        try {
            FileReader entrada = new FileReader("/home/german/Escritorio/primerfichero");
            
            int caracter = entrada.read();
            
            char letra = (char)caracter;
            
            while(caracter != -1){
                
                System.out.print(letra);
                
                caracter = entrada.read();
                
                letra = (char)caracter;
            }
            
             entrada.close();
            
        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");
        }
         
    }
}