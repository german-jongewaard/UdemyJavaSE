package Threads;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author german
 */
public class SincronizandoHilos_Video_162 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        SincronizaThreadsIII hilo1 = new SincronizaThreadsIII();
        SincronizaThreadsIV hilo2 = new SincronizaThreadsIV(hilo1);
        hilo1.start();
        hilo2.start();
        
        System.out.println("Hemos terminado las tareas!!");
    }
    
}

class SincronizaThreadsIII extends Thread{
    
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

class SincronizaThreadsIV extends Thread{

    
    public SincronizaThreadsIV(Thread thread) {
        this.thread = thread;
    }
    
    
    
     public void run(){
         
        try {
            thread.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
         
          for(int i=0;i<20;i++){
            
            System.out.println("Ejecutando thread " + getName());
            
            try {
                sleep(300);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
         
     } 
     
     private Thread thread;
}
