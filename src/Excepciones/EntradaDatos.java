package Excepciones;

import java.util.Scanner;

/**
 *
 * @author german
 * 
 */
public class EntradaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1. Introducir datos");
        System.out.println("2. Salir del programa");
        
        Scanner entrada = new Scanner(System.in);
        
        int decision = entrada.nextInt();
        
        if(decision == 1){
            
            pedirDatos();
            
        }else{
            
            System.out.println("Adios");
            
            System.exit(0);
        }
        
        entrada.close();
        
        System.out.println("Hemos terminado");
            
    }

    private static void pedirDatos() {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre, por favor");
        
        String nombre_usuario = entrada.nextLine();
        
    }
    
}
