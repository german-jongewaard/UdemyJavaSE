package Ejercicios_Planteados;

/**
 *Ejercicio 2:
Crea una clase nueva con el nombre de “Calculo_Potencia”. Declara dos variables en la misma
línea con los nombres de “base” y “exponente”.
En la siguiente línea de código inicia la variable “base” en 5. A continuación inicia la variable
“exponente” en 12.
Crea una variable con el nombre de “resultado” donde se almacenará el cálculo de “base”
elevado a “exponente”.
Al ejecutar el programa, deberá salir en consola el mensaje “5 elevado a 12 es igual a
244140625” concatenando la cadena de texto con las variables “base”, “exponente” y
“resultado”.
* 
 * @author german
 */
public class Video_10_2_Calculo_Potencia {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int base, exponente;
        
        int resultado;
        
        base = 5;
        
        exponente = 12;
        
        resultado = (int) Math.pow(base, exponente);
        
        System.out.println(base + " elevado a " + exponente + " es igual a " + resultado);
    }
    
}
