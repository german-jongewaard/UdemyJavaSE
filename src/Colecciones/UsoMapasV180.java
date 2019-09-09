package Colecciones;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author german
 */

public class UsoMapasV180 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        HashMap<String, Empleado> listaEmpleados = new HashMap<String, Empleado>();
        
        
        listaEmpleados.put("100", new Empleado("Juan"));
        
        listaEmpleados.put("101", new Empleado("Antonio"));
        
        listaEmpleados.put("102", new Empleado("María"));
        
        listaEmpleados.put("103", new Empleado("Lucía"));
        
        System.err.println(listaEmpleados);
        
        listaEmpleados.remove("101");
        
        System.err.println(listaEmpleados);
        
        listaEmpleados.put("103", new Empleado("Ana"));
        
        System.err.println(listaEmpleados);
        
        for(Map.Entry<String, Empleado> personaEmpleado : listaEmpleados.entrySet()){
            
            String clave = personaEmpleado.getKey();
            
            Empleado valor = personaEmpleado.getValue();
            
            System.err.println("Clave " + clave + " Valor " + valor);
            
        }

        
    }    
}

class Empleado{

    public Empleado(String nombre) {
        this.nombre = nombre;
        salario = 2000;
    }

    @Override
    public String toString() {
        return "Epmpleado{" + "nombre=" + nombre + ", salario=" + salario + '}';
    } 
      
    
    
    private String nombre;
    private double salario;
}
