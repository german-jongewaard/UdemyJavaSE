package Practicas;

import java.util.Random;

/**
 *
 * @author german
 * 
 */
public class Usocuenta {  
        
        
    public static void main(String[] args) {
        // TODO code application logic here
         
        
         
        
    }
    
}

class CuentaCorriente {
    
        double saldo;
        String nombreTitular;
        long numeroCuenta;
    
        public CuentaCorriente(double saldo, String nombreTitular, long numeroCuenta){
        
            this.saldo = saldo;
            this.nombreTitular = nombreTitular;
            
            Random rnd = new Random();
            numeroCuenta = Math.abs(rnd.nextLong()); 
        }
        
        public void setIngreso(double ingreso){
            
            if(ingreso < 0) System.out.println("No se permiten ingresos negativos");
            
            else saldo += ingreso;
        }
        
        public void setReingreso(double reingreso){
            
            saldo += reingreso;
        }
        
        public String getSaldo(){
            return "El saldo de la cuenta es: " + saldo;
        }
        
        
        
        
}
