package com.jongewaard.flujo;

import javax.swing.JOptionPane;

/**
 *
 * @author german
 */
public class OperadorTernario {

    public static void main(String[] args) {
        // TODO code application logic here
        
       /* double salariot1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer salario"));
        
        double salariot2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo salario"));
        
        double salario_mayor;
        
        if(salariot1>salariot2) salario_mayor = salariot1; //ejemplo comentado!!!        
        else salario_mayor = salariot2;  
        
        //Operador ternario
        salario_mayor = (salariot1>salariot2)?salariot1:salariot2;
        
        System.out.println("El salario mayor es: " + salario_mayor);*/
       
       
       int edad = Integer.parseInt(JOptionPane.showInputDialog("introduce tu edad por favor"));
       
       String mayor = (edad>18)?"Eres mayor de edad":"Eres menor de edad";
        System.out.println(mayor);
       
       
       
        
        
    }
    
}
