package Serializacion;

/**
 *
 * @author german
 * 
 */
public class Serializando {
    
    public static void main(String[] args){
        
        Administrador jefe = new Administrador("Juan", 80000, 12, 15);
        
        jefe.setIncentivo(5000);
                
        Empleado[] personal = new Empleado[3];
        
        personal[0] = jefe;
        
        personal[1] = new Empleado("Ana", 25000, 2008, 10, 1);
        
        personal[2] = new Empleado("Luis", 18000, 2012, 9, 15);
        
    }
    
}

class Empleado{
    
    public Empleado(String n, double s, int agno, int mes, int dia){
        
    }
}
