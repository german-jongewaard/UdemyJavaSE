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
        
        Empleados Juan = new Empleados("Juan", new Date(5465454), 2500);
        
        System.out.println(Juan.getNombre());
        System.out.println(Juan.getDescripcion());
        
        Jefes Ana = new Jefes("Ana", new Date(6578976), 3000);
        System.out.println(Ana.getNombre());
        System.out.println(Ana.getDescripcion());
        
        Alumnos Maria = new Alumnos("María", "Dibujo", "Aula 5");
        
        System.out.println(Maria.getNombre());
        System.out.println(Maria.getDescripcion());
        
        Jefes David = new Jefes("David", new Date (654654), 4800);
        
        David.setCargo("Director de RRHH");
        
        System.out.println(David.getNombre());
        System.out.println(David.getDescripcion() +  David.getCargo());
    }
    
}
