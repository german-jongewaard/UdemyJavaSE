package pooAbstractas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.text.DefaultEditorKit;

/**
 *
 * @author german
 * 
 */

public class PruebaTemporizador2 {
    
    public static void main(String[] args) {

        Reloj miReloj = new Reloj();
        
        miReloj.ejecutarTemporizador(3000, true);
        
        JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");        
    }    
}

//clase reloj
class Reloj{
    //constructor de la clase reloj
//    public Reloj(int intervalo, boolean sonido){
//        
//        this.intervalo = intervalo;
//        this.sonido = sonido; 
//    }
//   Al tener la clase interna en el constructor ejecutaTemporizador. 
//   Puedo presindir de la clase Reloj
    
    public void ejecutarTemporizador(int intervalo, boolean sonido){
        
     /* Construyo la clase interna ****************** 
      class DameLaHora implements ActionListener{        
         
        Toolkit beep;
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            Date ahora = new Date();
            
            System.out.println("Te pongo la hora cada 3 segundos " + ahora);
            
            //si sonido es True hace beep!
            if(sonido)Toolkit.getDefaultToolkit().beep();
        }     
    }
      Fin la clase interna ****************** 
        
        ActionListener oyente = new DameLaHora(); */
        
        Timer miTemporizador = new Timer(intervalo, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Date ahora = new Date();
            
            System.out.println("Te pongo la hora cada 3 segundos " + ahora);
            
            //si sonido es True hace beep!
            if(sonido)Toolkit.getDefaultToolkit().beep();
            }
        });
        
        miTemporizador.start();         
    }  
}
