package com.jongewaard.entradasalida;

/**
 *
 * @author german
 */
import java.util.Scanner;

public class EntradaScanner {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creacion de un Objeto en Java
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre, por favor: ");
        
        String nombre = entrada.nextLine();
        
        System.out.println("Hola " + nombre);
        
        System.out.println("Introduce un número, por favor: ");
        
        int numero1 = entrada.nextInt();
        
        System.out.println("Introduce el segundo número, por favor: ");
        
        int numero2 = entrada.nextInt();
        
        System.out.println("El resultado es: " + (numero1+numero2));
        
        entrada.close();
        
        
        
        
        
                
                
        
        
                
        
        
    }
    
}
