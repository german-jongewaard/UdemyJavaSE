package programacion_generica;

/**
 *
 * @author Germán
 * 
 */
public class Video_153_MiArrayList {
    
    public Video_153_MiArrayList(int z){
        
        datosElemento = new Object[z];
    }
    
    public Object getObject(int i){
        
        
        return datosElemento[i];
    }
    
    
    private Object[] datosElemento;
    
}
