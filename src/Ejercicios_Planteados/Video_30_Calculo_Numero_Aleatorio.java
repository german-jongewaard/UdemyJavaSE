package Ejercicios_Planteados;

import java.util.Scanner;
import static javafx.application.Platform.exit;
import javax.swing.JOptionPane;

/**
 *Ejercicio. Cálculo número aleatorio. Vídeo 30
Ejercicio:
En este ejercicio se trata de adivinar en el menor número de intentos posibles un número entero
aleatorio entre 1 y 100 generado por el programa.
Al ejecutar el programa, este generará un número aleatorio entre 1 y 100 que el usuario no
sabrá. A continuación, el programa pedirá la introducción de un número entero entre 1 y 100
por consola.
Si el número introducido por el usuario es mayor que el número aleatorio generado por el
programa, saldrá un mensaje por consola indicando que el número es menor.
Si el numero introducido por el usuario es menor que el número aleatorio generado por el
programa, saldrá un mensaje por consola indicando que el número es mayor.
El proceso se repetirá indefinidamente hasta que averigüemos cuál es el número generado
aleatoriamente por el programa.
Una vez acertado, debe imprimir en consola un mensaje de “Correcto!” e indicar el no de
intentos consumidos para acertar con el número aleatorio.
* 
* 
 * @author german
 */
public class Video_30_Calculo_Numero_Aleatorio {
 
    public static void main(String[] args) {
        // TODO code application logic here
        
        int aleatorio=(int) (Math.random()*100);  
         
        Scanner entrada = new Scanner(System.in);
          
        int numero = 0;
        
        int intentos = 0;
        
        System.out.println("aleatorio es: " + aleatorio);
        
        while(numero != aleatorio){           
           
           intentos++;
           
           System.out.println("Introduce un número, por favor.");
           
           numero = entrada.nextInt();
           
           if(aleatorio<numero){
               System.out.println("Debería ser más bajo...");
           }else if(aleatorio>numero){
               System.out.println("Debería ser más alto...");
           }
           if(intentos<5){
           System.out.println("- Tienes 5 intentos y llevas - " + intentos);
           }else{
               System.out.println("Lo siento solo puedes tener " + intentos + " intentos.");
                numero = aleatorio;
               
           }
                      
       }
       if(numero != aleatorio){
        //si es igual el numero sale esto!        
        System.out.println("Felicitaciones el número era: " + aleatorio + 
                " y tu numero ingresado es: " + numero);
        System.out.println("Intentos: " + intentos);
       }
        
    }
    
}
