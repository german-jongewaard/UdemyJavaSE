package programacion_generica;

import java.io.File;

/**
 *
 * @author german
 * 
 */
public class Video_153_UsoArrayList_main {

    public static void main(String[] args) {
        Video_153_MiArrayList archivos = new Video_153_MiArrayList(6);
        
        archivos.agregaElemento("German");
        archivos.agregaElemento("Ana");
        archivos.agregaElemento("Juan");
        archivos.agregaElemento("Pedro");
        archivos.agregaElemento("Miriam ");
       
        
    //  String nombrePersona = (String)archivos.getObject(2);
       
     
      archivos.agregaElemento(new File("ejemplo.xlsx"));
      
      File nombrePersona = (File)archivos.getObject(5);
      
      System.out.println(nombrePersona);
        
        
    }
    
}
