package Ejemplo_POO;

/**
 *
 * @author german
 */
public class Tren {
    
    int [][] vagones= new int[5][2];            
    String maquinista;    
    int antiguedad;
    
    public Tren(){
    
        for (int i = 0; i <= 4; i++) {
            
            vagones[i][0] = (i+1)*10;
            vagones[i][1] = 0; 
        }
        
        maquinista = "Anónimo";        
        antiguedad = 0;
     
        }
    
     public Tren(String nombre, int anios){
    
        for (int i = 0; i <= 4; i++) {
            
            vagones[i][0] = (i+1)*10;
            vagones[i][1] = 0; 
        }
        
        maquinista = nombre;         
        antiguedad = anios;     
        } 
     
     public void CompletarVagon(int vagon){
         
         vagones[vagon][1] = vagones[vagon][0];
         
         System.out.println("el vagon " + (vagon+1) + " ha sido completado");
     }
     
     public void MeterPasajero(int vagon, int pasajeros){
         
         if(vagones[vagon][1] + pasajeros > vagones[vagon][0]){
             System.out.println("No hay tantos asientos libres en el vagon " + (vagon+1));
             
         }else{
             vagones[vagon][1] = vagones[vagon][1] + pasajeros;
             System.out.println("La reserva se ha completado");
             
         } 
          
     } 
}

class Lujo extends Tren{
    
    String camarero; //nombre del camarero
    boolean bar; //abierto o cerrado
    
    public Lujo(){
        camarero = "Anónimo";        
        bar = false; //el bar esta cerrado
    }
    
    public Lujo(String nombre, boolean estado){
        camarero = nombre;
        bar = estado;
    }
    
    public void StatusBar(boolean estado){
        
        bar = estado;
        if(bar == true){
            System.out.println("El bar esta abierto.");
        }else{
            System.out.println("El bar esta cerrado.");
        }
        
        
    }
            
}
