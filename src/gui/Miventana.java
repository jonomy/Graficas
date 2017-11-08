/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
//paso 1 - IMPORTAR LIBRERIAS GRAFICAS
import graficas.*;
import javax.swing.*;//Libreria grafica estandar multiplataforma
import java.awt.*;//Libreria grafica
 // paso 8 - Importar la clase que contiene la  GUI
 
    public class Miventana extends JFrame
 //Paso 2 - Heredar Mi Clase DESDE JFrame
 
  public class Miventana extends JFrame

   //PASO 3 -DECLARAR LOS ELEMENTOS QUE VAMOS A UTILIZAR

   
     JPanel mipanel;//Creacion de objetos JPanel
     JLabel milabel;
     JTexField mitexto;
      JButton miboton;
//PASO 4 - DEFINICION DEL CONTRUCTOR DE LA CLASE
public Mi ventana()//Tiene el mismo nombre de la clase

    {
    //PASO 5 - CREAR E INICIALIZAR LOS OBJETOS
     mipanel = new JPanel();Creamos el objeto
     milabel = new JLabel();
     mitexto = new JTexFiel(10);//son los carasteres
     miboton = new JButton();
     //PASO 6 - AGREGAR LOS ELEMENTOS AL JFrame
      
     
    
      
        JFrame miventana = new JFrame();//Creamos un objetos tipo JFrame
        miventana.setVisible(true);//Esta sentencia muestra la ventana
        
         miventana.setBounds(0,0,400,400);//Le asignamos tamaño a la ventana
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Esta sentencia cierra la ventana
        
    }
    
}
