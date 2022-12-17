/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rent_A_Car;

/**
 *
 * @author gblan
 */
public class NodoD {
    private  Devolucion dato; 
    private NodoD next;

    public NodoD(Devolucion dato) {
        this.dato = dato;
    }

    public Devolucion getDato() {
        return dato;
    }

    public void setDato(Devolucion dato) {
        this.dato = dato;
    }

    public NodoD getNext() {
        return next;
    }

    public void setNext(NodoD next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return dato.toString();
    }
    
    
    
}
