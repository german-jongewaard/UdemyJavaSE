package Colecciones;

import java.util.*;

/**
 *
 * @author german
 */
public class ClientesBancarios {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente cliente1 = new Cliente("Antonio Lopez", "0001", 20000);
        Cliente cliente2 = new Cliente("Rafael Gómez", "0002", 15000);
        Cliente cliente3 = new Cliente("Ana Martín", "0003", 200000);
        Cliente cliente4 = new Cliente("Juan Díaz", "0004", 20);
        Cliente cliente5 = new Cliente("Antonio Lopez", "0001", 20000);
        
        //Coleccion
        Set<Cliente> clientesDelBanco = new HashSet<Cliente>();
        
        clientesDelBanco.add(cliente1);
        clientesDelBanco.add(cliente2);
        clientesDelBanco.add(cliente3);
        clientesDelBanco.add(cliente4);
        clientesDelBanco.add(cliente5);
        
        for (Cliente cliente : clientesDelBanco) {
            
            System.out.println(cliente.getNombre() + " " + cliente.getnCuenta() 
                    + " " + cliente.getSaldo());            
        }        
    }    
}
