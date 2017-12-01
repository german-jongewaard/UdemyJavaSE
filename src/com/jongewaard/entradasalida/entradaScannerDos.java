 
package com.jongewaard.entradasalida;

import java.util.Scanner;
/**
 *
 * @author german
 */
public class entradaScannerDos {
 
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre, por favor");
        
        String nombre = entrada.nextLine();
        
        System.out.println("Introduce tu edad, por favor");
        
        int edad = entrada.nextInt();
        
        System.out.println("Te llamas " + nombre + " y tienes " + edad + " años.");
        
        entrada.close();
    }
    
}
