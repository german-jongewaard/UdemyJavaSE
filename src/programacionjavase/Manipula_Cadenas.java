 
package programacionjavase;

/**
 *
 * @author german
 */
public class Manipula_Cadenas {
 
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = "Germán";          
        
        System.out.println(nombre);
        
        System.out.println(nombre.length());
        
        System.out.println(nombre.charAt(2));
        
        String nombre2 = "Hoy es un exelente día para estudiar el Curso de Java";
        
        int ultima_letra = nombre2.length();
        
        System.out.println("La primera letra de " + nombre2 + " es: " + nombre2.charAt(0));
        
        System.out.println("La ultima letra de la cadena " + nombre2 + " es la letra: " + "'" + nombre2.charAt(ultima_letra-1) + "'");
        
        String frase = "No hay nada mejor que levantarse un domingo para estudiar Java";
        
        System.out.println(frase.substring(0,4));
        
        String palabra1 = "Casa";
        
        String palabra2 = "casa";
        
        System.out.println(palabra1.equals(palabra2));
        
        System.out.println(palabra1.equalsIgnoreCase(palabra2));
        
        
    }
    
}
