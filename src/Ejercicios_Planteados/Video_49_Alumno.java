package Ejercicios_Planteados;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author german
 * 
 */
public class Video_49_Alumno {
    
    private String nombreAlumno;
    private double notaAlumno; 
    private  double cambiaNotaMedia;
    private int Id;    
    private static int idSiguiente = 1;

    public Video_49_Alumno(String nombreAlumno, double notaAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.notaAlumno = notaAlumno; 
        this.cambiaNotaMedia = notaAlumno;
        Id = idSiguiente;        
        idSiguiente++;         
    }

    Video_49_Alumno() {  }

    Video_49_Alumno(String nombreAlumno) {
         this.nombreAlumno = nombreAlumno;         
    }

    public int getId() {
        return Id;
    }    
     
    public String getNombreAlumno() {
        return "Nombre alumno: " + nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getNotaAlumno() {
        return "\nNota media: " + notaAlumno;
    }

    public void setNotaAlumno(double notaAlumno) {
        this.notaAlumno = notaAlumno;
    } 

    public void setCambiaNotaMedia(double cambiaNotaMedia) {
        this.notaAlumno = cambiaNotaMedia;
    }      
}









 