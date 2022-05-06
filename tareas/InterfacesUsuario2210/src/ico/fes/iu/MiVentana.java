/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MiVentana extends Frame implements MouseListener {
    private Button boton1;
    private FlowLayout layaout;
    private TextField cuadroTexto;
    private Label etiqueta;
    private EventosRaton eventosRaton;
    
    
    
    public MiVentana() throws HeadlessException {
        setTitle("mi ventana");
        setSize(300,200); 
        layaout = new FlowLayout();
        setLayout(layaout);
        
        boton1 = new Button("Saludar");
        cuadroTexto = new TextField(15);// se indica cuantas columnas tiene 
        etiqueta = new Label("valor inicial "); //etiqueta 
       
        this.boton1.addMouseListener(this);// se agrega un oyente de eventos 
        
        this.add(cuadroTexto);
        this.add(boton1);
        this.add(etiqueta);
        
        setVisible(true);
        
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
         System.out.println("clic");
         //System.out.println(cuadroTexto.getText()); // se imprimen las letras del anuncio en pantalla de ejecución usando metodos de acceso
             etiqueta.setText("Hola "+ cuadroTexto.getSelectedText());
    }
    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("presionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("liberado");
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("entró");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("salió");
    }   
    
    
    
    
}