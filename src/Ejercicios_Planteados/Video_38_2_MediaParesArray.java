package Ejercicios_Planteados;

import com.jongewaard.entradasalida.entradaScannerDos;
import java.util.Scanner;

/**
 * Ejercicio 2. Media en posiciones pares del Array
En este ejercicio, se pide al usuario que introduzca 10 números enteros por consola. Los
números se almacenarán en un array y el programa calculará la media de los números
introducidos en las posiciones pares del array. (Debes utilizar el operador módulo “%”).
 *
 * @author german
 */
public class Video_38_2_MediaParesArray {
     public static void main(String[] args) {
        // TODO code application logic here
        
        int pares=0;
        
        int media = 0;
        
        System.out.println("Introduce 10 valores numéricos.");
        
        Scanner entrada = new Scanner(System.in);
        
        int numeros[] = new int[10];
                
         for (int i = 0; i < 10; i++) {             
             numeros[i] = entrada.nextInt(); 
         }
         
         for (int z = 0; z < 10; z++) {
             
              if(z%2==0 && z!=0){                 
               pares++;
               media = media + numeros[z]; 
              } 
         }
         
         System.out.println("La media de los pares es: " + media/pares);  
     }
    
}
