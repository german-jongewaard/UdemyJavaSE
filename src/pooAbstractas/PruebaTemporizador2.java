package pooAbstractas;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author german
 * 
 */

public class PruebaTemporizador2 {
    
    public static void main(String[] args) {

        Reloj miReloj = new Reloj(3000, true);
        
        miReloj.ejecutarTemporizador();
        
        JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
        
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
        
        miTemporizador.start(); 
        
    }
    
    private int intervalo;
    private boolean sonido;
}
