/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rent_A_Car;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class ListaCliente {
    private NodoC cabeza;
    
    public void inserta(Cliente p){
        if(cabeza==null){
            cabeza = new NodoC(p);
    
        }else if(p.getCedula()<cabeza.getDato().getCedula()){
            NodoC aux = new NodoC(p);
            aux.setNext(cabeza);
            cabeza=aux;
        }else if(cabeza.getNext()==null){
            cabeza.setNext(new NodoC(p));
        }else{
           NodoC aux = cabeza;
           while (aux.getNext() != null &&
                   aux.getNext().getDato().getCedula()
                   <p.getCedula()){
               aux=aux.getNext();
           }
           NodoC temp = new NodoC(p);
           temp.setNext(aux.getNext());
           aux.setNext(temp);
        } 
    }
    
    public boolean existe (int cedula){
        boolean esta = false;
        //Busca en lista, y retorna true si un Cliente tiene cedula
        //en la lista
        if (cabeza != null){
            //Si hay algo en la lista buscaré
            NodoC aux = cabeza;
            //utilizo aux como indice

            //Mientras no se acabe la lista y el elemento
            //de la lista sea menor que el buscado
            while (aux != null && aux.getDato().getCedula() < cedula){
                aux = aux.getNext () ;//avanzo en la lista
            }

            //verdadero si lo encontró
            esta = (aux != null && aux.getDato().getCedula()== cedula);
        }

        return esta;
    }
    
    public void modifica (Cliente p) {
        //busca a si existe alguien con cedula, y le actualiza el nombre
        if (cabeza != null) {
            //Si hay algo en la lista buscaré
            NodoC aux = cabeza; //utilizo aux como indice
            //Mientras no se acabe la lista y el elemento
            //de la lista sea menor que el buscado
            while (aux != null && aux.getDato().getCedula() < p.getCedula()) {
                aux = aux. getNext (); //avanzo en la lista
            }
            // Si lo encuentra hago el cambio
            if (aux != null && aux.getDato().getCedula() == p.getCedula ()){
                //Solo básta cambiar nombre
                aux.getDato().setNombre(p.getNombre()) ;
            }
        }
    } 
    public void elimina (int cedula) {
        //Si un Cliente tiene el id, lo elimina
        if (cabeza != null) { //Si hay algo en la lista buscaré
            if (cabeza.getDato().getCedula() == cedula) 
            {
                cabeza = cabeza.getNext();
            } 
            else {
                NodoC aux = cabeza; //utilizo aux como indice
                //Mientras no se acabe la lista y el elemento
                //de la lista sea menor que el buscado
                while (aux.getNext() != null &&
                    aux.getNext().getDato().getCedula() < cedula) {
                    aux = aux.getNext() ;
                }
                //avanzo en la lista
            
                // si es el de adelante lo borro
                if (aux.getNext() != null &&
                aux.getNext().getDato().getCedula() == cedula) {
                    aux.setNext(aux.getNext().getNext()); //cambio las referencias
                }
            }
        }
    }
    
    public Cliente extrae (int cedula) {
        Cliente p = null;
        //si un Cliente tiene cedula, lo extrae (eliminando y retornando)
        if (cabeza != null) { //Si hay algo en la lista buscaré
            if (cabeza.getDato().getCedula() == cedula) {
                cabeza = cabeza.getNext() ;
            } else {
                NodoC aux = cabeza; //utilizo aux como indice
                //Mientras no se acabe la lista y el elemento
                //de la lista sea menor que el buscado
                while (aux.getNext() != null && aux.getNext().getDato().getCedula()
                < cedula){
                    aux = aux.getNext() ;
                    //avanzo en la lista
                }
                // Si es el de adelante... quardo el Cliente y lo borro
                if (aux.getNext() != null && aux.getNext().getDato().getCedula() == cedula) {
                    p = aux. getNext () .getDato () ;
                    aux. setNext (aux.getNext().getNext()) ;//cambio las referencias
                }
            }
        }
        return p;
    }
    
    @Override
    public String toString(){
        NodoC aux = cabeza;
        String s="";
        while(aux!=null){
            s += aux + "\n";
            aux = aux.getNext();
        }
        return s;
    }
}
