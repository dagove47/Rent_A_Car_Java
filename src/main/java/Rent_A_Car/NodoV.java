/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rent_A_Car;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class NodoV {
    
    //<editor-fold defaultstate="collapsed" desc="Variables">
    /*
    * Se crean todas las variables que se van 
    * en las otras clases y en el main.
    */    
    //</editor-fold>
    
    private Vehiculo dato;
    private NodoV next;
    
    //<editor-fold defaultstate="collapsed" desc="toString">
    /*
    * convierte el "dato" a un string para 
    * poder usarlo en la lista y que una 
    * persona lo pueda leer y enender.
    */    
    //</editor-fold>
    
    @Override
    public String toString(){
        return dato.toString();
    }
    
    //<editor-fold defaultstate="collapsed" desc="(Vehiculo dato)">
    /*
    * Se le dice a NodoV que puede
    * aceptar no solo vacios pero
    * tambien "dato" siempre y cuando
    * el "dato" sea de tipo "Vehiculo".
    */    
    //</editor-fold>
    
    public NodoV(Vehiculo dato){
        this.dato=dato;
    }
    
    //<editor-fold defaultstate="collapsed" desc="Setter y Getter">
    /*
    * Se crea un setter y un getter para
    * todas las varables que se van a utilizar en 
    * otras clases.
    */        
    //</editor-fold>    
    
    public Vehiculo getDato() {
        return dato;
    }

    public void setDato(Vehiculo dato) {
        this.dato = dato;
    }

    public NodoV getNext() {
        return next;
    }

    public void setNext(NodoV next) {
        this.next = next;
    }
}
