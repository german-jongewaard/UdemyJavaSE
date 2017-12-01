package poo;

/**
 *
 * @author german
 */
public class Vehiculos {
    
    //Constructor, es un metodo especial, da estado inicial a nuestros Objetos.
    //Su caracteristica es que lleva el mismo nombre que la clase, 
    //gracias a eso sabemos que es un constructor    
    public Vehiculos(int ruedas){ //Constructor de la clase.
    
        this.ruedas = ruedas;        
        largo = 2;
        ancho = 1;
        peso = 2;
        color = "Sin color"; 
    }
    //Sobrecarga de constructores!
    public Vehiculos(int ruedas, int largo, double ancho, int peso){
        
        this.ruedas = ruedas;        
        this.largo = largo;
        this.ancho = ancho;
        this.peso = peso;
        color = "Sin color";
        
        
    }
    
    
    
    
    //Metodo                       parametro o argumento del método
    public void setExtra(boolean climatizador){
        
        //campo de clase
        this.climatizador = climatizador;
    }
    
    public String getExtra(){
        if(climatizador && gps ==false && tapiceria_cuero == false) return "Tu vehículo lleva el Pack 1 de extras";
        else if(climatizador && gps && tapiceria_cuero) return "Tu vehículo lleva el Pack 2 de extras";
        else return "La combinacion escogida no se admite";
    }
                                        //sobre carga de metodos!
    public void setExtra(boolean climatizador, boolean gps, boolean tapiceria_cuero){
        
        this.climatizador = climatizador;
        this.gps = gps;
        this.tapiceria_cuero = tapiceria_cuero;
    }
    
    

    public int getRuedas() { return ruedas; }

    public void setRuedas(int ruedasVehiculo) { this.ruedas = ruedasVehiculo; }

    public String getColor() {return color;}

    //Método setter que establece valor de porpiedad.
    public void setColor(String colorVehiculo) {this.color = colorVehiculo;} 

    public int getLargo() {return largo;}

    public void setLargo(int largo) {this.largo = largo;}

    public double getAncho() {return ancho;}

    public void setAncho(int ancho) {this.ancho = ancho;}

    public int getPeso() {return peso;}

    public void setPeso(int peso) {this.peso = peso;}
    
    public String getDatosVehiculo(){
        
        
        return "Tu vehículo tiene " + ruedas + " ruedas. Además tiene " +
                largo + " m de largo.";
    }
      
    
    
    //encapsulado, solo existe en esta clase.
    private int ruedas;
    private String color;
    private int largo;
    private double ancho;
    private int peso;
    
        //campo de clase
    private boolean climatizador;
    private boolean tapiceria_cuero;
    private boolean gps;
    
}
