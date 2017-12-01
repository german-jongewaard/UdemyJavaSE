package Ejercicios_Planteados;

import java.util.Scanner;

/**
 *Ejercicio 1:
Crea una clase con el nombre de RaizScanner. Al ejecutar el programa nos debe pedir introducir
un no por consola. Después de introducir el no y pulsar ENTER, el programa devuelve en consola
la raíz cuadrada del número tal y como aparece en la siguiente imagen:
* 
 * @author german
 */
public class Video_21_1_y_2_RaizScanner {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Double resultado;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un número, por favor ");        
        
        int numero = entrada.nextInt();
        
        resultado = Math.sqrt(numero);
      
        System.out.println("La raíz es = " + resultado);
                       
        entrada.close();
        
    }
    
}
