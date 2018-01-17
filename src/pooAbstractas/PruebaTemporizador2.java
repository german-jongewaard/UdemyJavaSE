package pooAbstractas;

import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author german
 * 
 */

public class PruebaTemporizador2 {

    
    public static void main(String[] args) {
       
        
    }
    
}

//clase reloj
class Reloj{
    //constructor de la clase reloj
    public Reloj(int intervalo, boolean sonido){
        
        this.intervalo = intervalo;
        this.sonido = sonido; 
    }
    
    public void ejecutarTemporizador(){
        
        ActionListener oyente = new DameLaHora();
        
        Timer miTemporizador = new Timer(intervalo, oyente);
        
        
             
        
    }
    
    private int intervalo;
    private boolean sonido;
}
