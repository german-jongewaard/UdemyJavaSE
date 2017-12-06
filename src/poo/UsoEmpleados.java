package poo;

import java.util.GregorianCalendar;

/**
 *
 * @author german
 */
public class UsoEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     /*   Empleados Antonio = new Empleados("Antonio", 2300.5, 2005, 7, 15);
        
        Jefes Ana = new Jefes("Ana", 5000, 2009, 5, 12);
        
        System.out.println("El empleado es " + Antonio.getDatosEmpleado());
        
        Ana.setIncentivo(300);
        
        System.out.println(Ana.getSueldo());
       */
     
     Jefes Juan = new Jefes("Juan", 8000, 2013, 8, 5);
     
     Juan.setIncentivo(200);
     
     
     
     Empleados[] losEmpleados = new Empleados[5];
     
    
     losEmpleados[0] = new Empleados("Antonio", 2300.5, 2005, 7, 5);
     losEmpleados[1] = new Empleados("Carlos", 5000.5, 2007, 6, 5);
     losEmpleados[2] = new Empleados("Maria", 2500.5, 2006, 11, 7);
     losEmpleados[3] = new Empleados("Ana", 7000, 2009, 5, 3);
     losEmpleados[4] = Juan;//Principio de SUSTITUCIÓN upcasting/casting implicito
     
     Jefes Patricia = new Jefes("Patricia", 2500, 2007, 5, 6);
     
     Empleados PatriciaSecretaria = Patricia; //upcasting/casting implicito
     
     /* Esta es la forma de hacer un downCasting/casting explicito
     convertir a Jefe y luego castear abajo a PatriciaD */
     
     Empleados PatriciaD = new Jefes("Patricia", 2500, 2007, 5, 6); 
     
     Jefes PatriciaDirectora = (Jefes)PatriciaD;
     
     for(Empleados obj: losEmpleados){
         
         System.out.println(obj.getDatosEmpleado() + " y un salario: " + obj.getSueldo());
     }
         
       
        
    }
    
}

class Empleados{
    
    public Empleados(String nom, double sue, int agno, int mes, int dia){        
        nombre = nom; 
        
        sueldo = sue;
        
        calendario = new GregorianCalendar(agno, mes, dia); 
        
        Id = idSiguiente;
        
        idSiguiente++;
    }
          
    
    public String getDatosEmpleado(){        
        return "El empleado " + nombre + " tiene el Id nº " + Id;
    } 
    
    public double getSueldo(){ return sueldo; }    
    
    public GregorianCalendar getFechaAlta(){ return calendario; }
    
    public void setSubeSueldo(double porcentaje){
        
        double aumento = sueldo * porcentaje/100;
        
        sueldo += aumento;
        
    }
            
            
    //Método STATIC!!!!!!!!
    public static String getIdSiguiente(){               
        return "El Id del siguiente empleado sera: " + idSiguiente;        
    }
     
    
    //Con la constante de la clase empleado "final" 
    //me aseguro que no cambia el valor de nombre.
    private final String nombre; //esto es una constante. No se podra modificar una vez dado valor.
    
    private double sueldo;
    
    GregorianCalendar calendario;
    
    private int Id;
    
    private static int idSiguiente = 1; //esto es un campo de clase. pertenece a la propia clase.
        
}

class Jefes extends Empleados{
    
    public Jefes(String nom, double sue, int agno, int mes, int dia) {
        super(nom, sue, agno, mes, dia);
    }
    
    public void setIncentivo(double b){ //comportamiento del incentivo

        incentivo = b;
        
    }
    
    @Override
    public double getSueldo(){
                            //llamo a getSueldo() de la clase Padre!!!
        double sueldoJefe = super.getSueldo();
        
        return sueldoJefe + incentivo;
    }
    
    private  double incentivo;

}
