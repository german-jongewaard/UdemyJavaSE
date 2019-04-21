package Threads.Ejercicio_Sincronizacion_Banco;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author german
 */
public class EjecutandoTransferencias implements Runnable{

    public EjecutandoTransferencias(Banco miBanco, int cuentaDeOrigen, double cantidadMaxima) {
        this.miBanco = miBanco;
        this.cuentaDeOrigen = cuentaDeOrigen;
        this.cantidadMaxima = cantidadMaxima;
    }
    
    @Override
    public void run() {
        
        while(true){ //bucle infinito
            
            int cuentaDeDestino = (int)(Math.random()*100); //genera un numero aleatorio entre 0 y 100
            
            double cantidadATransferir = cantidadMaxima*Math.random();
         
            miBanco.transferencias(cuentaDeOrigen, cuentaDeDestino, cantidadATransferir);
            
            try {
                //durmiendo los hilos pra que se puedan ver las transferencias
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }        
    }
    
    private Banco miBanco;
    
    private int cuentaDeOrigen;
    
    private double cantidadMaxima;
    
}
