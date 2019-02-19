package programacion_generica;

/**
 *
 * @author german
 * 
 */
public class Video_156_EjemploMetodosGenericos {

    public static void main(String[] args) {
        
        String nombresPersonas[] = {"Sara", "Antonio", "María"};
        
        System.out.println(ExaminaArrays.getElementos(nombresPersonas));
    }
    
}


class ExaminaArrays{
    
    
    
    public static <T> String getElementos(T[]elArray){
        
        return "El array tiene " + elArray.length + " elementos.";
        
    }
    
    
    
    
    
}