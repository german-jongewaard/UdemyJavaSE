package programacion_generica;

/**
 *
 * @author german
 */
public class Video_157_Varios_Tipos<T> {
    
    public Video_157_Varios_Tipos(){
        
        primero = null;
        
    }
                   
    
    
    
    /*
    Así sería de una forma Normal, solo que no admite la herencia para Jefes, por eso utilizo un "parametro comodin"    
    
    */
    // public static void imprimirTrabajador(Video_157_Varios_Tipos<Video_157_Empleado> e)
    
                                                                //PARAMETRO COMODIN
    public static void imprimirTrabajador(Video_157_Varios_Tipos<? extends Video_157_Empleado> e){
        
        Video_157_Empleado primero = e.getPrimero();
                
                System.out.println(primero);
        
    }    
    public void setPrimero(T nuevoValor){
        
        primero = nuevoValor;
        
    }
    
    
    public T getPrimero(){
        
        return primero;
    }    
    
    private  T primero;
}
