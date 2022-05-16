/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifrado.cesar;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaSwing extends JFrame{
    private JTextField textfield1;
    

public VentanaSwing(){
    this.setTitle("Cifrado Cesar");
    this.setSize(500,300);
    this.getContentPane().setBackground(Color.white);
}    
private void elementos(){
    JPanel cuadro= new JPanel();
    cuadro.setBackground(Color.blue);
    this.getContentPane().add(cuadro);
    JLabel etiqueta = new JLabel("Traductor de código César");
    cuadro.add(etiqueta);
    JTextField texto = new JTextField (15);
    cuadro.add(texto);
    JButton boton = new JButton ("Convertir");
    JTextField result = texto;
    cuadro.add(boton);
    JLabel etiqueta2 = new JLabel("Mensaje cifrado");
    cuadro.add(etiqueta2);
    JTextField texto2= new JTextField(20);
    cuadro.add(texto2);
};

    private String tabla = "abcdefghijklmnopqrstuvwxyz";

    public String Encriptado(String t, int key){
        String texto = LimpiarCadena(t);
        String fin="";
        for (int i=0; i<texto.length();i++)
        {
        int col = tabla.indexOf(texto.charAt(i));
        if ((col + key))<tabla.length()){
            fin = fin + tabla.charAt(col+key);
        }
        else
        {
        texto2 = fin + tabla.charAt((col+key)) - tabla.length());
        }
       }
        return fin;
        
        }
        
    private String LimpiarCadena(String t){
        throw new UnsupportedOperationException("Not supported yet");
    }
    }
        

    


