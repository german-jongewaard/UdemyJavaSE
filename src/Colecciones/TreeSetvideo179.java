package Colecciones;

import java.util.Comparator;
import java.util.TreeSet;


/**
 *
 * @author german
 */

public class TreeSetvideo179 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Productos2 comparadorPr = new Productos2();
        
               
        TreeSet<Productos2> ordenaProdcutos = new TreeSet<Productos2>(comparadorPr);
        
        //ahora voy a ordenar esto de forma NO NATURAL (inventdo por mi, en base a mi necesidad)
        
        Productos2 pr3 = new Productos2(3, "esta es la descripción del Tercer producto");
        Productos2 pr7 = new Productos2(7, "Séptimo");
        Productos2 pr2 = new Productos2(2, "Segundo producto");
        
        ordenaProdcutos.add(pr3);
        ordenaProdcutos.add(pr7);
        ordenaProdcutos.add(pr2);
        
        for(Productos2 p:ordenaProdcutos){
            
            System.err.println(p.getdescripcion());
        }
    }
    
}
//Comparable ordena de manera estructurada de la A a la Z o de la Z a la A
//Comparator ordena de manera programtica, segun lo que necesite en ese momento
class Productos2 implements Comparable<Productos2>, Comparator<Productos2>{

    public Productos2() {
    }     
    
    //constructor
    public Productos2(int numeroProducto, String descripcion){
        
        this.numeroProducto = numeroProducto;
        this.descripcion = descripcion;
    }
    
    //Metodo que devuelve la descripcion del producto
    public String getdescripcion(){
    
        return descripcion;
    }

    @Override
    public int compareTo(Productos2 pr) {
        
        return numeroProducto -pr.numeroProducto;
    }
    
    private int numeroProducto;
    private String descripcion;

    //Ordenamiento creado segun mi necesidad de busqueda, ordena de menor descripcion a mayor descripcion
    @Override
    public int compare(Productos2 o1, Productos2 o2) {
        
        int carac1 = o1.getdescripcion().length();
        
        int carac2 = o2.getdescripcion().length();
        
        if(carac1 < carac2) return -1;
        else if(carac1>carac2) return 1;
        else return 0;
     }
    
}
