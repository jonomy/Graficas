/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;
//paso 1 - IMPORTAR LIBRERIAS GRAFICAS
import javax.swing.*;//Libreria grafica estandar multiplataforma
import java.awt.*;//Libreria grafica
/**
 *
 * @author LAB06
 */
public class Graficas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        JFrame miventana = new JFrame();//Creamos un objetos tipo JFrame
        miventana.setVisible(true);//Esta sentencia muestra la ventana
        
         miventana.setBounds(0,0,400,400);//Le asignamos tamaño a la ventana
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_Close);//Esta sentencia cierra la ventana
        
    }
    
}
