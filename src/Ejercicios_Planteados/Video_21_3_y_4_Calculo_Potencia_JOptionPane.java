package Ejercicios_Planteados;

import javax.swing.JOptionPane;

/**
 *Ejercicio 3:
Crea una clase con el nombre de CalculoPotenciaJOptionPane. Al ejecutar el programa nos debe
pedir introducir dos valores numéricos utilizando una ventana de tipo showInputDialog:
*Una base
*Un exponente
Una vez introducidos los dos valores, el programa mostrará en consola el resultado de elevar la
base al exponente tal y como aparece en la siguiente imagen:
* 
* 
 * @author german
 */
public class Video_21_3_y_4_Calculo_Potencia_JOptionPane {

    public static void main(String[] args) {
        // TODO code application logic here
        
    //int base = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base"));
    
    //int exponente = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el exponente"));
    
    //Double total = Math.pow(base, exponente);
    
    //System.out.println("el resultado de " + base + " elevado a " + exponente + " es " + total);
    
    double total = Math.pow(Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base")), 
            Integer.parseInt(JOptionPane.showInputDialog("Introduzca el exponente")));
    
    System.out.println("el resultado es " + total);
        
    
    }
    
}
