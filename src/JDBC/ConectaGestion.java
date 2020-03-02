package JDBC;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author german
 */
public class ConectaGestion {
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {            
            
            
            
            // 1. CREAR CONEXCIÓN
            
            //Connection miCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionpedidos", "root", "");
            
            Connection miCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_hotel_db", "root", "");
            
            // 2. CREAR STATEMENT
            
            Statement miSt = miCon.createStatement();
            
            //3. EJECUTAR INSTRUCCIÓN SQL
            
            //ResultSet miRs = miSt.executeQuery("SELECT * FROM clients");
            
            //Insertar
            //String inSQL = "INSERT INTO clients (id, first_name, last_name, phone, email) VALUES ('8', 'Android', 'Studio', '123456789', 'android@gmail.com')";
            
            //Update
            //String inSQL = "UPDATE clients set email='jojy@gmail.com' WHERE  id = '7'";
            
            String inSQL = "DELETE FROM clients WHERE id = '8'";
            
            //4. LEER EL RESULTSET
            /*
            while (miRs.next()) {               
                
                System.out.println(miRs.getString(1) + "          " 
                                 + miRs.getString(2) + "          " 
                                 + miRs.getString(3) + "          "
                                 + miRs.getString(4) + "          " 
                                 + miRs.getString(5) + "          " );                
            }*/
            
            miSt.executeUpdate(inSQL);
            
            System.out.println("Registro eliminado correctamente");
            
            miCon.close();
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
            
    }    
}
