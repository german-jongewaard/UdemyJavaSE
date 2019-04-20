package Threads.Ejercicio_Sincronizacion_Banco;

/**
 *
 * @author german
 */
public class UsoBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Banco b = new Banco();
        
        for(int i=0; i<100;i++){
            /*Aquí creo una instancia r, donde ejecuta trnsferencias, 
            donde: b es el banco, i es la cntidad de transferencias
            y 2000 el importe a transferir */
            EjecutandoTransferencias r =new EjecutandoTransferencias(b, i, 2000);
        }
    }
    
}
