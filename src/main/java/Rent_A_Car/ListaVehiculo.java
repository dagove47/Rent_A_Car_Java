/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rent_A_Car;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class ListaVehiculo {

    private NodoV cabeza;
    private Vehiculo search;

    public void inserta(Vehiculo p) {
        if (cabeza == null) {
            cabeza = new NodoV(p);
//        }else if(p.getPlaca()<cabeza.getDato().getPlaca()){
//            NodoV aux = new NodoV(p);
//            aux.setNext(cabeza);
//            cabeza=aux;
        } else if (cabeza.getNext() == null) {
            cabeza.setNext(new NodoV(p));
        } else {
            NodoV aux = cabeza;
            while (aux.getNext() != null //                   && !(aux.getNext().getDato().getPlaca()).equals(p.getPlaca())
                    ) {
                aux = aux.getNext();
            }
            NodoV temp = new NodoV(p);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
    }

    public boolean existe(String placa) {
        boolean esta = false;
        //Busca en lista, y retorna true si un Vehiculo tiene la placa
        //en la lista
        if (cabeza != null) {
            //Si hay algo en la lista buscaré
            NodoV aux = cabeza;
            //utilizo aux como indice

            //Mientras no se acabe la lista y el elemento
            //de la lista sea menor que el buscado
            while (aux != null && !(aux.getDato().getPlaca().equals(placa))) {
                aux = aux.getNext();//avanzo en la lista
            }

            //verdadero si lo encontró
            esta = (aux != null && (aux.getDato().getPlaca().equals(placa)));
        }

        return esta;
    }

    public void modifica(Vehiculo p) {
        //busca a si existe alguien con la placa, y le actualiza el nombre
        if (cabeza != null) {
            //Si hay algo en la lista buscaré
            NodoV aux = cabeza; //utilizo aux como indice
            //Mientras no se acabe la lista y el elemento
            //de la lista sea menor que el buscado
            while (aux != null && !(aux.getDato().getPlaca().equals(p.getPlaca()))) {
                aux = aux.getNext(); //avanzo en la lista
            }
            // Si lo encuentra hago el cambio
            if (aux != null && (aux.getDato().getPlaca().equals(p.getPlaca()))) {
                //Solo básta cambiar nombre
                aux.getDato().setMarca(p.getMarca());
                aux.getDato().setModelo(p.getModelo());
                aux.getDato().setAnno(p.getAnno());
                aux.getDato().setColor(p.getColor());
                aux.getDato().setCilindrada(p.getCilindrada());
                aux.getDato().setCombustible(p.getCombustible());
                aux.getDato().setPasajeros(p.getPasajeros());
                aux.getDato().setPrecioDia(p.getPrecioDia());
                aux.getDato().setExtras(p.getExtras());
                aux.getDato().setEstado(p.getEstado());
            }
        }
    }

    public void elimina(String placa) {
        //Si un Vehiculo tiene la placa, lo elimina
        if (cabeza != null) { //Si hay algo en la lista buscaré
            if ((cabeza.getDato().getPlaca()).equals(placa)) {
                cabeza = cabeza.getNext();
            } else {
                NodoV aux = cabeza; //utilizo aux como indice
                //Mientras no se acabe la lista y el elemento
                //de la lista sea menor que el buscado
                while ((aux.getNext() != null) && (!(aux.getNext().getDato().getPlaca()).equals(placa))) {
                    System.out.println(aux.getNext().getDato().getPlaca());

                    aux = aux.getNext();

                }
                //avanzo en la lista

                // si es el de adelante lo borro
                if ((aux.getNext() != null) && ((aux.getNext().getDato().getPlaca()).equals(placa))) {
                    aux.setNext(aux.getNext().getNext()); //cambio las referencias
                }
            }
        }
    }

    public Vehiculo extrae(String placa) {
        Vehiculo p = null;
        //si un Vehiculo tiene ls placa, lo extrae (eliminando y retornando)
        if (cabeza != null) { //Si hay algo en la lista buscaré
            if (cabeza.getDato().getPlaca().equals(placa)) {
                cabeza = cabeza.getNext();
            } else {
                NodoV aux = cabeza; //utilizo aux como indice
                //Mientras no se acabe la lista y el elemento
                //de la lista sea menor que el buscado
                while (aux.getNext() != null && !(aux.getNext().getDato().getPlaca().equals(placa))) {
                    aux = aux.getNext();
                    //avanzo en la lista
                }
                // Si es el de adelante... quardo el Vehiculo y lo borro
                if (aux.getNext() != null && (aux.getNext().getDato().getPlaca().equals(placa))) {
                    p = aux.getNext().getDato();
                    aux.setNext(aux.getNext().getNext());//cambio las referencias
                }
            }
        }
        return p;
    }

    public Vehiculo buscar(String placa) {
        
        if (cabeza != null) {
            NodoV aux = cabeza; 
            
            while (aux != null && !(aux.getDato().getPlaca().equals(placa))) {
                aux = aux.getNext(); 
            }

            if (aux != null && (aux.getDato().getPlaca().equals(placa))) {

                search = aux.getDato();
            }
        }
        
        return search;
    }

    //<editor-fold defaultstate="collapsed" desc="Override">
    /*
    * El override convierte la lista en un string 
    * entonces se crea un sting llamado "s" y un nodo
    * llamado aux que es igual a frente, luego si aux 
    * existe el contenido de aux se agrega al vacio
    * que es "s" y se crea una nueva linea de texto. 
    * Luego aux se convierte en el nodo que existe 
    * detras del frente y luego se da como resultado
    * "s"
     */
//</editor-fold>
    @Override
    public String toString() {
        NodoV aux = cabeza;
        String s = "";
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getNext();
        }
        return s;
    }
}
