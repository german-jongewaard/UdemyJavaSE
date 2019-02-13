package programacion_generica;

/**
 *
 * @author german
 * 
 */
public class Video_154_Uso_GenericaMi {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Video_154_GenericaMia<String> miObjeto1 = new Video_154_GenericaMia<String>();
        
        miObjeto1.setObjeto("Germán");
        
        System.out.println(miObjeto1.getObjeto());
        
        Video_154_GenericaMia<Persona> miObjeto2 = new Video_154_GenericaMia<Persona>();
        
        Persona ella = new Persona("María");
        
        miObjeto2.setObjeto(ella);
        
        System.out.println(miObjeto2.getObjeto().toString());
    }
    
}

class Persona{

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    
    public String toString(){
        
        return nombre;
    }
    
    
    
    private String nombre;
}
