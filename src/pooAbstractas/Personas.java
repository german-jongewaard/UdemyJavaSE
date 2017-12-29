package pooAbstractas;

import java.util.Date;

/**
 *
 * @author german
 */
public abstract class Personas { 
    
    public Personas(String nom){
     
        nombre = nom;       
        
    }
    
    
    public String getNombre(){
        
        return nombre;
    }
    
    public abstract String getDescripcion();
        
          
        private String nombre; 
}

//*********** CLASE EMPLEADOS ***********/

class Empleados extends Personas implements Comparable{
    
    public Empleados(String nom, Date fechaAlta, double sueldo) {
        super(nom);
        
        this.fechaAlta = fechaAlta;
        this.sueldo = sueldo;
    }

    @Override
    public String getDescripcion() {
        return "El empleado " + this.getNombre() + " tiene un sueldo " + 
                "de " + sueldo + " € " + " y entró a trabajar en " + fechaAlta;
        //To change body of generated methods, choose Tools | Templates.
    }
    
    private double sueldo;
    
    private Date fechaAlta; 

    @Override
    public int compareTo(Object o) {
        //estoy transformando al Object o en un Objecto de tipo Empleados (casteando)
        Empleados otroEmpleado = (Empleados)o;
        
         if(this.sueldo<otroEmpleado.sueldo) return -1;
         
         if(this.sueldo>otroEmpleado.sueldo) return 1;
         
         return 0;
    }    
}


//*********** CLASE JEFES ***********/

class Jefes extends Empleados implements ParaJefes {
    
    public Jefes(String nom, Date fechaAlta, double sueldo) {
        super(nom, fechaAlta, sueldo);
    }
        
    public void setIncentivos(double incentivo){
        
        this.incentivos = incentivo;       
    }    
    
    private double incentivos;

    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String getCargo() {
        return "\nAdemás tiene el cargo de " + cargo;
    }
    
    private String cargo;

    @Override
    public double setBonus(double gratificacion) {
        
        double prima = 2000;
        
        return prima + gratificacion + ParaTrabajadores.bonus;
    }
}

//*********** CLASE ALUMNOS ***********/
class Alumnos extends Personas{

    public Alumnos(String nom, String optativa, String aula  ) {
        super(nom);
   //campo de clase - parametro
        a_optativas = optativa;
        this.aula = aula;
        
        
    }

    @Override
    public String getDescripcion() {
        return "El alumno " + this.getNombre() + " esta en el aula " + 
                aula + " y" + " ha escogido la asignatura  " + a_optativas;
    }
    
    private String a_optativas;
    private String aula;
    
    
}