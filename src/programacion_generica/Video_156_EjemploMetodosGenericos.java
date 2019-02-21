package programacion_generica;

/**
 *
 * @author german
 * 
 */
public class Video_156_EjemploMetodosGenericos {

    public static void main(String[] args) {
        
        String nombresPersonas[] = {"Sara", "Antonio", "María"};
        
        System.out.println(ExaminaArrays.getMenor(nombresPersonas));
        
     /*  
        Empleados[] losEmpleados = new Empleados[5];
        
        losEmpleados[0] = new Empleados("Antonio", 2300.5, 2005, 7, 5);
        losEmpleados[1] = new Empleados("Carlos", 5000.5, 2007, 6, 5);
        losEmpleados[2] = new Empleados("María", 2500.5, 2006, 11, 7);
        losEmpleados[3] = new Empleados("Ana", 7000, 2009, 5, 3);
        losEmpleados[4] = new Empleados("German", 24000.5, 2002, 2, 2);
        
        System.out.println(ExaminaArrays.getElementos(losEmpleados));
        */ 
    }
    
}


class ExaminaArrays {
    
    
                                //metodo generico 
    public static <T extends Comparable> T getMenor(T[]elArray){
        
        T objetoMenor = elArray[0];
        
        for(int i=1; i<elArray.length;i++){
            
            if(objetoMenor.compareTo(elArray[i])>0){
                
                objetoMenor = elArray[i];
            }
            
        }
        
        return objetoMenor;
        
    }

    
    
    
    
    
    
}