package pooAbstractas;

import java.util.Date;

/**
 *
 * @author german
 */
public abstract class Personas { 
    
    public Personas(String nom){
     
        nombre = nom;       
        
    }
    
    
    public String getNombre(){
        
        return nombre;
    }
    
    public abstract String getDescripcion();
        
          
        private String nombre; 
}

class Empleados extends Personas{
    
    public Empleados(String nom, Date fechaAlta, double sueldo) {
        super(nom);
        
        this.fechaAlta = fechaAlta;
        this.sueldo = sueldo;
    }

    @Override
    public String getDescripcion() {
        return null;
        //To change body of generated methods, choose Tools | Templates.
    }
    
    private double sueldo;
    
    private Date fechaAlta;
    
    
    
}
