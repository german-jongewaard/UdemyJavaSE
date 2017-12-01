package Ejercicios_Planteados;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *Ejercicio. Cálculo de áreas. Vídeo 28
Ejercicio:
Debes crear un programa que permita calcular las áreas de cuatro figuras geométricas con datos
introducidos por consola. Las figuras geométricas serán:
1. Cuadrado
2. Rectángulo
3. Triángulo
4. Círculo
El programa debe permitir elegir al usuario de qué figura geométrica desea calcular el área. Una
vez elegida la figura, el programa pedirá datos por consola para el cálculo del área de la figura
geométrica elegida. Los datos que pedirá dependerán de la figura y serán los siguientes:
• Cuadrado: el programa pedirá la longitud del lado por consola
• Rectángulo: el programa pedirá la longitud del lado por consola
• Triángulo: el programa pedirá la base y la altura por consola
• Círculo: el programa pedirá la longitud del radio por consola
Una vez introducidos los datos solicitados, el programa imprimirá en consola el área de la figura
elegida.
Es obligatorio hacer este ejercicio utilizando el condicional switch.
* 
 * @author german
 */
public class Video_28_Ejercicio_Calculo_De_Areas {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Double resultado;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Elige una opción:\n\n" + 
                "1. Cuadrado\n" +"2. Rectángulo\n" +"3. Triángulo\n" +"4. Círculo\n" + "5. Salir\n");
        
                
        int figura = entrada.nextInt();
        
        switch(figura){
            
            case 1: 
                
                    int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));  
                    System.out.printf("Area del cuadrado: %1.0f\n", Math.pow(lado, 2));
                     
                break;
                
            case 2: int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));  
                    int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));  
                                       
                    System.out.println("El area del rectangulo: " + (base*altura));
                break;
                
            case 3: base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));  
                    altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));  
                                       
                    System.out.println("El area del rectangulo: " + ((base*altura)/2));
                     
                break;
                
            case 4: int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el área"));  
                       
                    System.out.println("El area del circulo es:"); 
                    System.out.printf("%1.0f ", Math.PI*(Math.pow(radio, 2)));
                break;
                
            default:
                
                  System.out.println("La opción no es correcta:"); 
                
        } 
        
          
                       
        entrada.close();
    }
    
}
