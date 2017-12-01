package Ejercicios_Planteados;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
Ejercicio 1. Almacenar en Array
En este ejercicio se pide al usuario que introduzca 10 números enteros por consola. Los números
introducidos se almacenarán en un array. El programa imprime en consola cuántos números
negativos, positivos y valores 0 hay en el array.
* 
 * @author german
 */
public class Video_38_1_AlmacenarEnArray {

    public static void main(String[] args) {
        // TODO code application logic here 
        int positivos = 0;
        int negativos = 0;
        int cero = 0;
        
        System.out.println("Introduce 10 valores numéricos.");
        
        Scanner entrada = new Scanner(System.in);
        
        int  numeros[] = new int[10];
        
         for (int i = 0; i < 10; i++) {        
             numeros[i] = entrada.nextInt();    
        } 
         
         for (int valores : numeros) {
             if (valores<0) negativos++;
             else if (valores>0) positivos++;
             else cero++; 
        }
         
         System.out.println("En el array hay: \n " + positivos + " valores positivos, \n " +
                 negativos + " valores negativos y \n " + cero + " valores 0.");
        
    }
    
}
