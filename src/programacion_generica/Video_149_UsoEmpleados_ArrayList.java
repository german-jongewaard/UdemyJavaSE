package programacion_generica;

import java.util.*;

/**
 *
 * @author german
 * 
 */
public class Video_149_UsoEmpleados_ArrayList {

    public static void main(String[] args) {
        // TODO code application logic here 
        
      /*  Empleados[] losEmpleados = new Empleados[5];
        
        losEmpleados[0] = new Empleados("Antonio", 2300.5, 2005, 7, 5);
        losEmpleados[1] = new Empleados("Carlos", 5000.5, 2007, 6, 5);
        losEmpleados[2] = new Empleados("María", 2500.5, 2006, 11, 7);
        losEmpleados[3] = new Empleados("Ana", 7000, 2009, 5, 3);
        losEmpleados[4] = new Empleados("German", 24000.5, 2002, 2, 2); */
      
        ArrayList<Empleados> listaEmpleados = new ArrayList<Empleados>();
      
      
        listaEmpleados.add(new Empleados ("Antonio", 2300.5, 2005, 7, 5));
        listaEmpleados.add(new Empleados ("Carlos", 5000.5, 2007, 6, 5));
        listaEmpleados.add(new Empleados ("María", 2500.5, 2006, 11, 7));
        listaEmpleados.add(new Empleados ("Ana", 7000, 2009, 5, 3));
        listaEmpleados.add(new Empleados ("German", 24000.5, 2002, 2, 2));
        
        listaEmpleados.set(1, new Empleados("Jorge", 1900, 2003, 5, 6));
        
        listaEmpleados.add(new Empleados("Olga", 2000.5, 2009, 5, 7));
        
        listaEmpleados.remove(0);
        
        //listaEmpleados.trimToSize(); // reduce el array a los elementos incluidos en el array
        
        //System.out.println(listaEmpleados.size());
      
        
        //for(Empleados obj : listaEmpleados){            
        //    System.out.println(obj.getDatosEmpleado() + " y un salario de: " + obj.getSueldo());
        //}
       /* 
        Empleados EmpleadosArray[] = new Empleados[listaEmpleados.size()];
        
        listaEmpleados.toArray(EmpleadosArray);
        
        for(int i=0; i<EmpleadosArray.length; i++){
            
            System.out.println(EmpleadosArray[i].getDatosEmpleado());
        }
        */
       
       //Corriendo ArrayList con un Iterador
       Iterator<Empleados> myIterdorEmpleados = listaEmpleados.iterator();
       
       while(myIterdorEmpleados.hasNext()) System.out.println(myIterdorEmpleados.next().getDatosEmpleado());
        
        
    }
    
}


class Empleados {
    
    public Empleados(String nom, double sue, int agno, int mes, int dia) {
        
        this.nombre = nom;
        sueldo = sue;
        calendario = new GregorianCalendar(agno, mes, dia);        
        Id = IdSiguiente;
        IdSiguiente++;        
    }
    
    public String getDatosEmpleado(){
        
        return "El empleado " + nombre + " tiene el Id " + Id;
        
    }
    
    public double getSueldo(){
        
        return sueldo;
    }
    
    public GregorianCalendar getFechaAlta(){
        
        return calendario;
    }
    
    public void setSueldo(double porcentaje){
        
        double aumento = sueldo*porcentaje/100;
        
        sueldo+=aumento;
    }
    
    public static String getIdSiguiente(){
        
        return "El Id del siguiente Empleado será: " + IdSiguiente;
        
    }
    
    private final String nombre; // Esto es una constante. No se podrá modificar una vez dado valor.
    
    private double sueldo;
    
    private GregorianCalendar calendario;
    
    private int Id;
    
    private static int IdSiguiente=1; //Esto es un campo de clase. Pertenece a la propia clase
    
    
}
