package Threads;

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
        hilo2.start();
    }
    
}

class SincronizaThreads extends Thread{
    
    public void run(){
        for(int i=0;i<20;i++){
            
            System.out.println("Ejecutando thread");
            
        }
        
    }
    
}
