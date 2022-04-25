/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentahabiente;

/**
 *
 * @author wingo
 */
public class PruebaEjemplo {

    public static void main(String args[]) {
        
        Cuentahabiente[] cliente = new Cuentahabiente[5];
        cliente[01]= new Cuentahabiente("00001","Armando Casas", 89475);
         
        cliente[02]= new Cuentahabiente("00002","Elsa Pato", 42179);
        
        cliente[03]= new Cuentahabiente("00003","Aquiles Bailo", 32187);
        
        cliente[04]= new Cuentahabiente("00004","Marcia Ana", 64781);
        
        cliente[05]= new Cuentahabiente("00005","Ines Tornudo", 34798);
        
        for (int i=0; i< cliente.length; i++){
            cliente[i].retirarDinero(15000);
            System.out.println(cliente[i]);
            if(cliente[i].getBalance()<=50000){
                System.out.println(cliente[i].nombre + "es Cliente Regular");
            }else{
                System.out.println(cliente[i].nombre + "es Cliente Premium");
            }
        }
    }    
}
