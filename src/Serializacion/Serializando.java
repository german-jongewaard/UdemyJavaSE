package Serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author german
 * 
 */
public class Serializando {
    
    public static void main(String[] args){
        
        Administrador jefe = new Administrador("Juan", 80000, 2005, 12, 15);
        
        jefe.setIncentivo(5000);
                
        Empleado[] personal = new Empleado[3];
        
        personal[0] = jefe;
        
        personal[1] = new Empleado("Ana", 25000, 2008, 10, 1);
        
        personal[2] = new Empleado("Luis", 18000, 2012, 9, 15);
        
        try {
            
            //Generando objeto serializado
            
            ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream("/home/german/Escritorio/externo/miObjetoSerializado.dat"));
            
            flujoSalida.writeObject(personal);
            
            flujoSalida.close();
            
            
            //Leyendo Objeto Serializado
            
            ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("/home/german/Escritorio/externo/miObjetoSerializado.dat"));
            
            Empleado [] entradaObjeto = (Empleado[])flujoEntrada.readObject();
            
            flujoEntrada.close();
            
            
            for(Empleado e: entradaObjeto){
             
                System.out.println(e);
                
            }
            
            
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
    }
    
}

class Empleado implements Serializable{
    
    
    
    //private static final long serialVersionUID = 1L;
    
    public Empleado(String n, double s, int agno, int mes, int dia){
        
        nombre = n;
        
        sueldo = s;
        
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        
        fechaContrato = calendario.getTime();
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    public Date getFechaContrato(){
        return fechaContrato;
    }
    
    public void subirSueldo(double porcentaje){
        
        double aumento = sueldo*porcentaje/100;
        
        sueldo+=aumento;
        
    }
    
    public String toString(){
        return "El Nombre es: " + nombre + ", y su sueldo es = " + sueldo + ", fecha de contrato = " + fechaContrato;
    }
    
    
    private String nombre;
    private double sueldo;
    private Date fechaContrato;  
    
}

//-----------------------------------------------------------------

class Administrador extends Empleado{
    
    public Administrador(String n, double s, int agno, int mes, int dia){
        
        super(n, s, agno, mes, dia);
        
        incentivo = 0;
    }
 
    
    public double getSueldo(){
        double sueldoBase = super.getSueldo();
        
        return sueldoBase + incentivo;
    }
    
    public void setIncentivo(double b){
        
        incentivo  = b;
    }
    
    public String toString(){
        
        return super.toString() + "Incentivo = " + incentivo;
        
    }
    
    private double incentivo;
    
    
}
