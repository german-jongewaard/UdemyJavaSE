package Ejemplo_POO;

/**
 *
 * @author german
 */
public class POO_Vagon_Tren {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
         
       Tren primero = new Tren();
       
       Tren segundo = new Tren("Juan palomo", 25);
       Lujo tercero = new Lujo("Felipe", true);
       primero.maquinista = "Luis Garcia";
       primero.CompletarVagon(2);
       System.out.println(primero.vagones[2][1]);
       primero.MeterPasajero(1, 5);
       System.out.println(primero.vagones[1][1]);
       primero.MeterPasajero(1, 5);
       System.out.println(tercero.vagones[1][1]);
       tercero.StatusBar(true);
        
        
    }
    
}
