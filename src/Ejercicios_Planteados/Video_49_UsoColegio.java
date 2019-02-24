package Ejercicios_Planteados;

import java.util.Scanner;

/**
 *
 * @author german
 * 
 */
public class Video_49_UsoColegio {
     
    public static void main(String[] args) {             
        
        Scanner entrada = new Scanner(System.in);   
        
        Video_49_Colegio sanJavier = new Video_49_Colegio("San Javier", 200);
        
        Video_49_Colegio cervantes = new Video_49_Colegio("Cervantes", 300);
             
        sanJavier.nuevoAlumno("Germán", 8);        
        sanJavier.nuevoAlumno("María", 9.5);        
        sanJavier.nuevoAlumno("Santiago", 3);        
        sanJavier.nuevoAlumno("Antonio", 6);        
        sanJavier.nuevoAlumno("Carmen", 10);
        
        //++++++++++++++++++++++++++++++++++
        
        cervantes.nuevoAlumno("Sara", 9);        
        cervantes.nuevoAlumno("Juan", 10);        
                 
        //Imprime un menu
        System.out.println("Menu\n");
        System.out.println("1-Muestra todos los alumnos del colegio San Javier con su correspondiente numeración.");
        System.out.println("2-Muestra todos los alumnos del colegio Cervantes con su correspondiente numeración.");
        System.out.println("3-Muestra los datos de un alumno obtenido por su nombre");
        System.out.println("4-Expulsa un alumno");
        System.out.println("5-Modificar la nota media de un alumno.\n");       
        
        System.out.println("Introduce una opción, por favor\n");         
        int opcion = entrada.nextInt();        
       
            switch(opcion){
                               
                case 1:              
                    System.out.println("--- Todos los alumnos del colegio San Javier. ---\n");
                    sanJavier.getTodosAlumnos();
                    break;             
                case 2:              
                     System.out.println("--- Todos los alumnos del colegio Cervantes. ---\n");
                    cervantes.getTodosAlumnos();
                    break;             
                case 3:   
                    System.out.println("--- Obtengo los datos de Carmen. ---\n");
                    sanJavier.getDatosAlumno("Carmen");
                    break;
                //si opcion vale 4 imprime Bonjour 
                case 4:
                    System.out.println("--- Expulso al alumno Santiago de la posición 3. ---\n");
                    sanJavier.expulsaAlumno("Santiago");
                    sanJavier.getTodosAlumnos();
                    break;
                case 5:               
                    System.out.println("--- Cambio la nota media del alumno Antonio, antes tenia un 6. ---\n");
                    sanJavier.setNotaMedia("Antonio", 9.3);
                    sanJavier.getTodosAlumnos();
                    break;            
                //si opcion contiene cualquier otro valor se muestra que la opcino no es valida
                default:
                    System.out.println("Opcion no valida");                    
            } 
    }    
}
