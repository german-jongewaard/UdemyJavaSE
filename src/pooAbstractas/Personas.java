package pooAbstractas;
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

abstract class Empleados extends Personas{
    
    public Empleados(String nom) {
        super(nom);
    }
    
    
}
