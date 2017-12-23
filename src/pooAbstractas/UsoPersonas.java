package pooAbstractas;

import java.util.Date;

/**
 *
 * @author german
 */
public class UsoPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       /*  
        Empleados Juan = new Empleados("Juan", new Date(5465454), 2500);
        
        System.out.println(Juan.getNombre());
        System.out.println(Juan.getDescripcion());
        
        Jefes Ana = new Jefes("Ana", new Date(6578976), 3500);
        Ana.setCargo("Directora comercial");
        System.out.println(Ana.getNombre());
        System.out.println(Ana.getDescripcion() +  Ana.getCargo());
        
        Alumnos Maria = new Alumnos("María", "Dibujo", "Aula 5");
        
        System.out.println(Maria.getNombre());
        System.out.println(Maria.getDescripcion());
        
        Jefes David = new Jefes("David", new Date (654654), 4800);
        
        David.setCargo("Director de RRHH");
        
        System.out.println(David.getNombre());
        System.out.println(David.getDescripcion() +  David.getCargo()); 
        */
       
       Empleados losEmpleados[] = new Empleados[5];
       
       losEmpleados[0] = new Empleados("Juan", new Date(345345), 2500);
       losEmpleados[1] = new Empleados("María", new Date(345345), 1500);
       losEmpleados[2] = new Empleados("Ana", new Date(345345), 3500);
       losEmpleados[3] = new Empleados("Sandra", new Date(345345), 6000);
       losEmpleados[4] = new Empleados("Antonio", new Date(345345), 2100);
       
       for(Empleados e: losEmpleados) {
           
           System.out.println(e.getDescripcion());
           
            
       }
       
    }
    
}
