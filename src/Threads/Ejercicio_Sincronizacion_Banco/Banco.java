package Threads.Ejercicio_Sincronizacion_Banco;

import java.util.concurrent.locks.*;

/**
 *
 * @author german
 */
class Banco {

    public Banco(){
        
        cuentas = new double[100];
        
        for (int i = 0; i < 100; i++) {
            
            cuentas[i] = 2000;            
        }
    }
    
    public void transferencias(int cuentaOrigen, int cuentaDestino, double cantidad){
        
        bloqueaBanco.lock();
        try {
            
        
                
        if(cuentas[cuentaOrigen] < cantidad) return;  // evitar que se haga la transferenci
        
        System.out.println(Thread.currentThread());
        
        cuentas[cuentaOrigen] -= cantidad; //resta (decrementa) el saldo de la cuenta Origen
        
        System.out.printf("%10.2f de %d para la cuenta %d", cantidad, cuentaOrigen, cuentaDestino);
        System.out.println();
        
        cuentas[cuentaDestino] += cantidad; //suma el saldo de la cuenta origen en cuenta destino
        
       /* System.out.println(cantidad + " € de la cuenta " 
                                    + cuentaOrigen 
                                    + " a la cuenta " + cuentaDestino); */
        
         
        //System.out.println(getSaldoTotal());
        System.out.printf("Saldo total: %10.2f%n", getSaldoTotal());
        
        } finally {
            bloqueaBanco.unlock();
        }
    }
     private double getSaldoTotal() {
        
        double sumaSaldoBanco = 0;
        
        for(double a: cuentas){
            
            sumaSaldoBanco += a;
        }        
        return sumaSaldoBanco;        
    }
     
    private final double [] cuentas;
    
    private Lock bloqueaBanco = new ReentrantLock();       
}
