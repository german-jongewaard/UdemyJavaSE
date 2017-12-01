package poo;

/**
 *
 * @author german
 */
public class UsoVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //--- se dice de las tres maneras  ---
        //Objeto de tipo Vehiculo.
        //instancia perteneciente a la clase Vehiculo.
        //Hemos instanciado la clase Vehiculo.
        Vehiculos miCoche = new Vehiculos(4);
                            //llamada al constructor
                            
        miCoche.setColor("Morado");
        
        System.out.println("Mi color es: " + miCoche.getColor());
        
        Vehiculos miCoche2 = new Vehiculos(4);
        
        miCoche2.setColor("Rojo");
        
        miCoche2.setExtra(true, true,true);
        
        System.out.println(miCoche2.getExtra()); 
        
        
        System.out.println("Mi segundo coche es: " + miCoche2.getColor());
        
        System.out.println(miCoche.getDatosVehiculo());
        
        Vehiculos moto1 = new Vehiculos(2);
        
        System.out.println(moto1.getDatosVehiculo());
        
        Vehiculos miMoto = new Vehiculos(2,1,0.3,200);
        
        miMoto.setColor("gris");
        
        Vehiculos miCamion = new Vehiculos(6,3,1.5,3500);
        
        miCamion.setColor("azul");
        
        miCamion.setExtra(true, true, true);
        
        System.out.println(miCamion.getExtra());
        
        System.out.println(miCamion.getDatosVehiculo());
    }

     
    
}
