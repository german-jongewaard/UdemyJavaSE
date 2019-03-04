/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author german
 */
public class Video_55_EjercicioCrearContraseñas {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
		
		PassMaker pass[]=new PassMaker[Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de contraseñas:"))];
		
		int size=Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud de las contraseñas:"));
		
		for (PassMaker iterator : pass) {
			
			iterator=new PassMaker(size);
			
			System.out.println("Contraseña: " + iterator.getPassword());
			System.out.println("Caracteres: " + iterator.getSize());
			
			if (iterator.evaluate()) System.out.println("La contraseña es segura\n");
			else System.out.println("La contraseña no es segura\n");
			
		}
		
	}
 
}
 
class PassMaker {
	
	private String password;
	
	public PassMaker(int s) { setPassword(s); }
	
	public void setPassword(int s) {
		
		password="";
		Random rnd=new Random();
		char c;
		
		for (int i=0;i<s;i++) {
			
			do { c=(char)rnd.nextInt(123);
			} while (!((c>47&&c<58)||(c>64&&c<91)||(c>96)));
			
			password+=c;
			
		}
		
	}
	
	public String getPassword() { return password; }
	
	public int getSize() { return password.length(); }
	
	public boolean evaluate() {
		
		int num=0;
		int low=0;
		int upp=0;
		
		for (int i=0;i<password.length();i++) {
			
			if (password.charAt(i)>47&&password.charAt(i)<58) num+=1;
			else if (password.charAt(i)>96) low+=1;
			else upp+=1;
			
		}
		
		if (num>5&&low>1&&upp>2) return true;
		else return false;
		
	}
	
}
