package programacion_generica;

/**
 *
 * @author german
 */
public class Video_154_GenericaMia<T> {

    
    public Video_154_GenericaMia(){
        
        objeto = null;
        
    }
       
    
    public void setObjeto(T nuevoValor) {
        
        objeto = nuevoValor;
    }
    
    public T getObjeto(){
        
        return objeto;
    }
    
    
    private T objeto;
     
    
}
