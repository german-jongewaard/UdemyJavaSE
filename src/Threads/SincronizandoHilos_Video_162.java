package Threads;

/**
 *
 * @author german
 */
public class SincronizandoHilos_Video_162 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        SincronizaThreads hilo1 = new SincronizaThreads();
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
