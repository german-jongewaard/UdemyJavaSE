package Ejercicios_Planteados;

import Ejercicios_Planteados.Video_49_Alumno;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import pooAbstractas.Personas;

/**
 *
 * @author german
 * 
 */
public class Video_49_Colegio  {
    
    private String nombreColegio;
    private int cantidadAlumnos;   
    private int indice;
    
     
    List<Video_49_Alumno> items = new ArrayList<>();   
    Video_49_Alumno alumnosNuevos;

    public Video_49_Colegio(String nombreColegio, int cantidadAlumnos) {       
        this.nombreColegio = nombreColegio;
        this.cantidadAlumnos = cantidadAlumnos;   
    } 

    public Video_49_Colegio() {      }   
    
    public String getNombreColegio() {
        return nombreColegio;
    }

    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }
    
    public void nuevoAlumno (String nombreAlumno, double notaAlumno){        
       alumnosNuevos = new Video_49_Alumno(nombreAlumno, notaAlumno);       
       items.add(alumnosNuevos);         
    }
    
    public void getDatosAlumno(String nombreAlumno){         
        for(Video_49_Alumno alu : items){ 
                if(alu.getNombreAlumno() != null && alu.getNombreAlumno().contains(nombreAlumno)){                    
                         System.out.println(alu.getNombreAlumno()
                                            + "\nColegio: " + nombreColegio
                                            + "\nNº alumno: " + alu.getId()
                                            + alu.getNotaAlumno()
                                            + "\n"); 
                }            
        }
    }
    
    public void expulsaAlumno(String nombreAlumno){ 
        for(Video_49_Alumno alu : items){
                if(alu.getNombreAlumno() != null && alu.getNombreAlumno().contains(nombreAlumno)){                               
                       indice = alu.getId(); 
                }
         }         
        //El indice lo decremento en menos uno porque el getId() comienza a contar desde el número 1.
        items.remove(indice-1);
    }
    
     public void setNotaMedia(String nombreAlumno, double nuevaNotaMedia){
         for(Video_49_Alumno alu : items){ 
                if(alu.getNombreAlumno() != null && alu.getNombreAlumno().contains(nombreAlumno)){                      
                    alu.setCambiaNotaMedia(nuevaNotaMedia);
                }
         }
    }      
    
    public void getTodosAlumnos(){                
        for (int i = 0; i < items.size(); i++) {               
                System.out.println(items.get(i).getNombreAlumno()
                    + "\nColegio: " + nombreColegio
                    + "\nNº alumno: " + items.get(i).getId()
                    + items.get(i).getNotaAlumno()
                    + "\n");   
        }          
    }     
}
