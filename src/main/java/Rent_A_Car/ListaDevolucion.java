/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rent_A_Car;

/**
 *
 * @author gblan
 */
public class ListaDevolucion {

    private NodoD cabeza;

    public void add(Devolucion d) {
        if (cabeza == null) {
            cabeza = new NodoD(d);
        } else if (cabeza.getNext() == null) {
            cabeza.setNext(new NodoD(d));
        } else {
            NodoD aux = cabeza;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            NodoD temp = new NodoD(d);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }

    }

    @Override
    public String toString() {
        NodoD aux = cabeza;
        String s ="";
        while (aux != null) {
            s +=  aux + "\n";
            aux = aux.getNext();
        }
        return s;
    }

}
