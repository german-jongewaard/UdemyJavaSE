package Serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author german
 * 
 */
public class Recuperando {
    
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("/home/german/Escritorio/externo/miObjetoSerializado.dat"));
            
            Empleado [] entradaObjeto = (Empleado[])flujoEntrada.readObject();
            
            flujoEntrada.close();
            
            
            for(Empleado e: entradaObjeto){
             
                System.out.println(e);
                
            }
            
             
            
            
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
 
    }
    
}
