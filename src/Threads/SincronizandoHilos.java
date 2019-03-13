package Threads;

/**
 *
 * @author german
 */
public class SincronizandoHilos {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class SincronizaThreads extends Thread{
    
    public void run(){
        for(int i=0;i<20;i++){
            
            System.out.println("Ejecutando thread");
            
        }
        
    }
    
}
