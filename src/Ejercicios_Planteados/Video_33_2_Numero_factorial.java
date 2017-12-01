package Ejercicios_Planteados;

import javax.swing.JOptionPane;

/**
 *
 * @author german
 */
public class Video_33_2_Numero_factorial {

    public static void main(String[] args) {
        // TODO code application logic here
        
         int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número para factorizar"));
         
         long factorial = numero;
         
         for(int i = numero-1; i>0;i--){
             
                   factorial = factorial*i; 
                   
         }
         System.out.println("El factorial de: " + numero + " es " + factorial);
         
    }
    
}
