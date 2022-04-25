/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentahabiente;
/**
 *
 * @author wingo
 */
public class Cuentahabiente {
        String Id;
        String nombre;
        float balance;    
        
    public Cuentahabiente() {
    }
    public Cuentahabiente(String Id, String nombre, float balance) {
        this.Id = Id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "Id=" + Id + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    public void retirarDinero(float monto){
    if(monto<=this.balance){
        this.balance-=monto;
    }
    else{
        System.out.println("Por favor seleccione otra cantidad a retirar");
    }
    }
    public String evaluarNivelCliente(){
    if(this.balance<=50000){
            System.out.println("'Cliente Regular'");
    }else{
            System.out.println("'Cliente Premium'");
}
            return null;
    }
}
        