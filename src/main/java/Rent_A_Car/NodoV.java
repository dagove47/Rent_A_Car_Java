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
    private Vehiculo dato;
    private NodoV next;
    
    @Override
    public String toString(){
        return dato.toString();
    }
    
    public NodoV(Vehiculo dato){
        this.dato=dato;
    }

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
