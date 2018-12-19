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
         
        CuentaCorriente cuenta1 = new CuentaCorriente("Juan Gómez", 1500);
        CuentaCorriente cuenta2 = new CuentaCorriente("María López", 2500);
        
        CuentaCorriente.Transferencia(cuenta1, cuenta2, 200);
        
        System.out.println(cuenta1.getDatosCuenta());
        
        System.out.println(cuenta2.getDatosCuenta());
        
         
        
    }
    
}

class CuentaCorriente { 
    
        public CuentaCorriente(String nombreTitular, double saldo){
        
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
        
        public static void Transferencia(CuentaCorriente titu1, CuentaCorriente titu2, double cantidad){
            
            titu1.saldo -= cantidad;
            titu2.saldo += cantidad;
        }
        
        public String getDatosCuenta(){
            
            return "Titular: " + nombreTitular + "\n" +
                    "Nº de Cuenta: " + numeroCuenta + "\n" +
                    "Saldo: " + saldo;
        }
        
        
        private double saldo;
        private String nombreTitular;
        private long numeroCuenta;
        
}
