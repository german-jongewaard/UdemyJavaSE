
import java.util.TreeSet;

/**
 *
 * @author german
 */

public class TreeSetVideo178 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        TreeSet<String> ordenaGente = new TreeSet<String>();
        
        ordenaGente.add("Oscar");
        ordenaGente.add("María");
        ordenaGente.add("Ana");
        
        for(String g:ordenaGente){
            System.err.println(g);
        }
    }
    
}

class Productos implements Comparable<Productos>{
    
    //constructor
    public Productos(int numeroProducto, String descripcion){
        
        this.numeroProducto = numeroProducto;
        this.descripcion = descripcion;
    }

    @Override
    public int compareTo(Productos o) {
        
        return 0;
    }
    
    private int numeroProducto;
    private String descripcion;
    
}
