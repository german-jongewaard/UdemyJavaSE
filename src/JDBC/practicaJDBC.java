package JDBC;

import java.awt.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author german
 * 
 */
public class practicaJDBC {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
	JFrame mimarco=new Marco_Aplicacion();
		
	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	mimarco.setVisible(true);
    }
}	 

class Marco_Aplicacion extends JFrame{
	
	public Marco_Aplicacion(){
		
		setTitle ("Consulta BBDD");
		
		setBounds(500,300,400,400);
		
		setLayout(new BorderLayout());
		
		JPanel menus=new JPanel();
		
		menus.setLayout(new FlowLayout());
		
		secciones=new JComboBox();
		
		secciones.setEditable(false);
		
		secciones.addItem("Todos");
		
		paises=new JComboBox();
		
		paises.setEditable(false);
		
		paises.addItem("Todos");
		
		resultado= new JTextArea(4,50);
		
		resultado.setEditable(false);
		
		add(resultado);
		
		menus.add(secciones);
		
		menus.add(paises);	
		
		add(menus, BorderLayout.NORTH);
		
		add(resultado, BorderLayout.CENTER);
		
		JButton botonConsulta=new JButton("Consulta");	
		
		botonConsulta.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ejecutaConsulta();	
                    }					
		});
		
		add(botonConsulta, BorderLayout.SOUTH);		
		
		
		//------------CONEXIÓN CON BBDD-------------------------------------
		
		try{				
				miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/Pruebas", "root", "");
				
				Statement sentencia =miConexion.createStatement();
				//---CARGA JCOMBOBOX SECCIONES------
				String consulta="SELECT DISTINCTROW SECCIÓN FROM productos";
				
				ResultSet rs =sentencia.executeQuery(consulta);
				
				while(rs.next()){
					
					secciones.addItem(rs.getString(1));
				}
				
				rs.close();				
				
				//---CARGA JCOMBOBOX PAISES-----
				
				String consulta2="SELECT DISTINCTROW PAIS FROM productos";
				
				rs=sentencia.executeQuery(consulta2);
				
				while(rs.next()){
					
					paises.addItem(rs.getString(1));					
				}
				
				rs.close();				
				
		}catch(Exception e){			
		}		
	}	
	
	private void ejecutaConsulta(){
		
		ResultSet rs=null;
		
		try{			
			resultado.setText("");
			
			String seccion=(String)secciones.getSelectedItem();
			
			String pais=(String)paises.getSelectedItem();
			
			if(!seccion.equals("Todos") && pais.equals("Todos")){				
				
			enviaConsultaSeccion=miConexion.prepareStatement(consultaSeccion);
			
			enviaConsultaSeccion.setString(1, seccion);
			
			rs=enviaConsultaSeccion.executeQuery();
				
			}else if(seccion.equals("Todos") && !pais.equals("Todos")){				
				
				enviaConsultaPais=miConexion.prepareStatement(consultaPais);
				
				enviaConsultaPais.setString(1, pais);
				
				rs=enviaConsultaPais.executeQuery();				
				
			}else if(!seccion.equals("Todos") && !pais.equals("Todos")){
				
				enviaConsultaTodos=miConexion.prepareStatement(consultaTodos);
				
				enviaConsultaTodos.setString(1, seccion);
				
				enviaConsultaTodos.setString(2, pais);
				
				rs=enviaConsultaTodos.executeQuery();					
			}
			
			while(rs.next()){
				
				resultado.append(rs.getString(1));
				
				resultado.append(", ");
				
				resultado.append(rs.getString(2));
				
				resultado.append(", ");
				
				resultado.append(rs.getString(3));
				
				resultado.append(", ");
				
				resultado.append(rs.getString(4));
				
				resultado.append("\n");				
			}
			rs.close();		
			
		}catch(Exception e){
			
		}				
	}		
	private Connection miConexion;

	private PreparedStatement enviaConsultaSeccion;
	
	private PreparedStatement enviaConsultaPais;
	
	private PreparedStatement enviaConsultaTodos;
	
	private final String consultaSeccion="SELECT ARTICULO, SECCIÓN, PRECIO, PAIS FROM productos WHERE SECCIÓN=?";
	
	private final String consultaPais="SELECT ARTICULO, SECCIÓN, PRECIO, PAIS FROM productos WHERE PAIS=?";
	
	private final String consultaTodos="SELECT ARTICULO, SECCIÓN, PRECIO, PAIS FROM productos WHERE SECCIÓN=? AND"
			+ " PAIS=?";
	
	private JComboBox secciones;
	
	private JComboBox paises;
	
	private JTextArea resultado;	
}