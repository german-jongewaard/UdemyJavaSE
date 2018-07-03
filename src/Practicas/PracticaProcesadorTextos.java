package Practicas;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

/**
 *
 * @author german
 */
public class PracticaProcesadorTextos {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoProcesadorTextos miMarco = new MarcoProcesadorTextos();
        
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MarcoProcesadorTextos extends JFrame {
    
    public MarcoProcesadorTextos(){
        
        setBounds(600, 300, 600, 400);
        
        add(new LaminaProcesadorTextos());
        
        setVisible(true);
    } 
}

class LaminaProcesadorTextos extends  JPanel{
    
    public LaminaProcesadorTextos(){
        
        setLayout(new BorderLayout());
        
        JPanel laminaMenu = new JPanel();
        
        // ------- Construcción Barra de menú ---------
        
        JMenuBar miBarra = new JMenuBar(); //Barra de Menú
        
        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamanio = new JMenu("Tamaño");
        
        configuraMenu("Arial", "fuente", "Arial", 1, 12);
        
        configuraMenu("Courier", "fuente", "Courier", 1, 12);
        
        configuraMenu("Verdana", "fuente", "Verdana", 1, 12);
        
        miBarra.add(fuente);
        miBarra.add(estilo);
        miBarra.add(tamanio);
        //-----------------------------------------------
        
        configuraMenu("Negrita", "estilo", "", Font.BOLD, 12);
        configuraMenu("Cursiva", "estilo", "", Font.ITALIC, 12);
         
        //-----------------------------------------------
         
        configuraMenu("12", "tamaño", "", 1, 12);
        
        configuraMenu("16", "tamaño", "", 1, 16);
         
        configuraMenu("20", "tamaño", "", 1, 20);
          
        configuraMenu("24", "tamaño", "", 1, 24);
           
           
        
        laminaMenu.add(miBarra); //agrego la barra a lámina Menú
        
        add(laminaMenu, BorderLayout.NORTH);
        
        miArea = new JTextPane();
        
        add(miArea, BorderLayout.CENTER);
        
    }
    
    public void configuraMenu(String rotulo, String menu, String tipoLetra, 
            int estilos, int tamanios){
        
         JMenuItem elemMenuItem = new JMenuItem(rotulo);
         
         if(menu == "fuente") fuente.add(elemMenuItem);
         
         else if(menu == "estilo") estilo.add(elemMenuItem);
         
         else if(menu == "tamaño") tamanio.add(elemMenuItem);
         
         elemMenuItem.addActionListener(new GestionaEventos(rotulo, tipoLetra, estilos, tamanios));
    }
    
    //clase Interna que utilizo en confirguraMenu
    private class GestionaEventos implements ActionListener{

        public GestionaEventos(String rotulo, String tipoLetra, int estilos, int tamanios ) {
            
            this.rotulo = rotulo;
            this.tipoLetra = tipoLetra;
            this.estilos = estilos;
            this.tamanios = tamanios;
        } 

        @Override
        public void actionPerformed(ActionEvent e) {
            
            letraExistente = miArea.getFont();//almaceno el tipo de letra que tengo en el area de texto.
            
            if(rotulo == "Arial" || rotulo == "Courier" || rotulo == "Verdana"){
                
                estilos = letraExistente.getStyle();
                
                tamanios = letraExistente.getSize();
                
            }else if(rotulo == "Cursiva" || rotulo == "Negrita"){
                
                tipoLetra = letraExistente.getFontName();
                
                 tamanios = letraExistente.getSize();
            }else if(rotulo == "12" || rotulo == "16" || rotulo == "20" || rotulo == "24"){
        
            }
            miArea.setFont(new Font(tipoLetra, estilos, tamanios));
            
        }
        
        String rotulo, tipoLetra;
        
        int estilos, tamanios;
        
    }
    
    JTextPane miArea;
    
    JMenu fuente, estilo, tamanio;
    
    Font letraExistente;
}
