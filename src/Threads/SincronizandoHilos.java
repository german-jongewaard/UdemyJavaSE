package Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author german
 */
public class SincronizandoHilos {

    public static void main(String[] args) {
        // TODO code application logic here
        
        SincronizaThreads hilo1 = new SincronizaThreads();
        SincronizaThreads hilo2 = new SincronizaThreads();
        hilo1.start();
        
        try {
            hilo1.join();
        } catch (InterruptedException ex) {
           ex.printStackTrace();
        }
        
        hilo2.start();
    }    
}

class SincronizaThreads extends Thread{
    
    public void run(){
        for(int i=0;i<20;i++){
            
            System.out.println("Ejecutando thread " + getName());
            
            try {
                sleep(300);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        
    }
    
}
