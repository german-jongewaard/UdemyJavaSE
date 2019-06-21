package Colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author german
 */
public class LinkedListTest {

    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList<String> personas = new LinkedList<String>();
        
        personas.add("Ana");
        personas.add("Antonio");
        personas.add("Sara");
        personas.add("Pedro");
        
        System.out.println(personas.size());
        
        ListIterator<String> it = personas.listIterator();
        
        it.next();
        
        it.add("Germán");
        
        for (String persona : personas) {
            
            System.out.println(persona);
            
        }
        
    }
    
}
