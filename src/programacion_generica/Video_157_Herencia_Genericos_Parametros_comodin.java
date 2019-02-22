package programacion_generica;

/**
 *
 * @author german
 * 
 * Programación genérica IV. Parámetros comodínSección 16, Clase 157
 * 
 */
public class Video_157_Herencia_Genericos_Parametros_comodin {

    public static void main(String[] args) {
        // TODO code application logic here
        
     /*   Video_157_Empleado empleado15248;
        
        Video_157_Jefe sara = new Video_157_Jefe("Sara", 27, 3750);
        
        empleado15248 = sara;
    */ 
     
     
     Video_157_Varios_Tipos<Video_157_Empleado> empleado15248 = new Video_157_Varios_Tipos<Video_157_Empleado>();
     
     
     Video_157_Varios_Tipos<Video_157_Jefe> sara = new Video_157_Varios_Tipos<Video_157_Jefe>();
     
     //empleado15248 = sara;
     
     Video_157_Varios_Tipos.imprimirTrabajador(empleado15248);
     
     
    }
    
}
