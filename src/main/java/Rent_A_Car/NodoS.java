/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rent_A_Car;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class NodoS {
    private Solicitud dato;
    private NodoS nodoAnterior;
    
    public NodoS() {}

    public Solicitud getDato() {
        return dato;
    }

    public void setDato(Solicitud dato) {
        this.dato = dato;
    }

    public NodoS getNodoAnterior() {
        return nodoAnterior;
    }

    public void setNodoAnterior(NodoS nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }
    
    public NodoS(Solicitud dato) {
        this.dato = dato;
    }
    
    @Override
    public String toString(){
        return dato.toString();
    }
}
