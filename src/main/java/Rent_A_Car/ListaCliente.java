package Rent_A_Car;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class ListaCliente {

    //<editor-fold defaultstate="collapsed" desc="Variables">
    /*
    * Se asigna la variable cabeza que se va a usar 
    * en la clase
     */
    //</editor-fold>
    private NodoC cabeza;
    private Cliente buscado;

    //<editor-fold defaultstate="collapsed" desc="Inserta : ">
    /*
    * Si cabeza no existe se crea un nuevo nodo llamado
    * cabeza con el valor que se le indico cuando se incio
    * el metodo. Si cabeza ya existe se consigue la cedula 
    * de los datos que se indican como "p" y se compara con
    * la cedula de cabeza y si la cedula de "p" es mayor que 
    * la cedula de cabeza se crea un nodo llamado aux,
    * aux pasa al siguiente cliente y frente se vuelve
    * igual a cabeza. Si el dato que sigue despues de 
    * cabeza no existe se crea un nuevo nodo con todos
    * los datos estan en "p" y se asigna este nodo como 
    * el siguiente. Si ninguno de los casos se cumplen
    * se crea un aux que es igual a la cabeza y se  
    * inicia una condicional while que dice que 
    * mientras getNext de aux no sea un 
    * conjuto vacio y tambien la cedula del 
    * getNext de aux sea menor que la cedula
    * del dato "p". mientras esto sea asi 
    * el valor de aux cambia a ser el getNext
    * de aux. Una vez se resuelva el while
    * se crea un nuevo Nodo llamado temp
    * y se consigue el next de temp segun
    * el getNext de aux y getNext de aux 
    * segun el temp.
     */
    //</editor-fold>
    public void inserta(Cliente p) {
        if (cabeza == null) {
            cabeza = new NodoC(p);

        } else if (p.getCedula() < cabeza.getDato().getCedula()) {
            NodoC aux = new NodoC(p);
            aux.setNext(cabeza);
            cabeza = aux;
        } else if (cabeza.getNext() == null) {
            cabeza.setNext(new NodoC(p));
        } else {
            NodoC aux = cabeza;
            while (aux.getNext() != null
                    && aux.getNext().getDato().getCedula()
                    < p.getCedula()) {
                aux = aux.getNext();
            }
            NodoC temp = new NodoC(p);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
    }

    public boolean existe(int cedula) {
        boolean esta = false;

        //<editor-fold defaultstate="collapsed" desc="Existe">
        /*
        *Busca en lista, y retorna true si un Cliente tiene cedula
        *en la lista
         */
        //</editor-fold>
        if (cabeza != null) {
            // Si hay algo en la lista buscaré
            NodoC aux = cabeza;
            // Utilizo aux como indice

            //Mientras no se acabe la lista y el elemento
            //de la lista sea menor que el buscado
            while (aux != null && aux.getDato().getCedula() < cedula) {
                aux = aux.getNext();
                // Se avanza la lista
            }

            //verdadero si lo encontró
            esta = (aux != null && aux.getDato().getCedula() == cedula);
        }

        return esta;
    }

    public void modifica(Cliente p) {
        // Busca a si existe alguien con cedula, y le actualiza el nombre
        if (cabeza != null) {
            // Si hay algo en la lista buscaré
            NodoC aux = cabeza;
            // utilizo aux como indice
            // Mientras no se acabe la lista y el elemento
            // de la lista sea menor que el buscado
            while (aux != null && aux.getDato().getCedula() < p.getCedula()) {
                aux = aux.getNext();
                // Se avanza la lista
            }
            // Si lo encuentra hago el cambio
            if (aux != null && aux.getDato().getCedula() == p.getCedula()) {
                // Solo básta cambiar nombre
                aux.getDato().setNombre(p.getNombre());
            }
        }
    }

    public void elimina(int cedula) {
        // Si un Cliente tiene el id, lo elimina
        if (cabeza != null) {
            // Si hay algo en la lista buscaré
            if (cabeza.getDato().getCedula() == cedula) {
                cabeza = cabeza.getNext();
            } else {
                NodoC aux = cabeza;
                // Utilizo aux como indice
                // mientras no se acabe la lista y el elemento
                // de la lista sea menor que el buscado
                while (aux.getNext() != null
                        && aux.getNext().getDato().getCedula() < cedula) {
                    aux = aux.getNext();
                }
                // Se avanza la lista

                // Si es el de adelante lo borro
                if (aux.getNext() != null
                        && aux.getNext().getDato().getCedula() == cedula) {
                    aux.setNext(aux.getNext().getNext());
                    // Se cambia la referencia
                }
            }
        }
    }

    public Cliente extrae(int cedula) {
        Cliente p = null;
        // Si un Cliente tiene cedula, lo extrae (eliminando y retornando)
        if (cabeza != null) {
            // Si hay algo en la lista buscaré
            if (cabeza.getDato().getCedula() == cedula) {
                cabeza = cabeza.getNext();
            } else {
                NodoC aux = cabeza;
                // Utilizo aux como indice
                // Mientras no se acabe la lista y el elemento
                // de la lista sea menor que el buscado
                while (aux.getNext() != null && aux.getNext().getDato().getCedula()
                        < cedula) {
                    aux = aux.getNext();
                    // Se avanza la lista
                }
                // Si es el de adelante... quardo el Cliente y lo borro
                if (aux.getNext() != null && aux.getNext().getDato().getCedula() == cedula) {
                    p = aux.getNext().getDato();
                    aux.setNext(aux.getNext().getNext());
                    //cambio las referencias
                }
            }
        }
        return p;
    }

    public Cliente buscar(int  id) {
        if (cabeza != null) {

            NodoC aux = cabeza;

            while (aux != null && aux.getDato().getCedula() != id) {
                aux = aux.getNext();

            }

            if (aux != null && aux.getDato().getCedula() == id ) {
                buscado = aux.getDato();
            }
        }
        return buscado;
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
        NodoC aux = cabeza;
        String s = "";
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getNext();
        }
        return s;
    }
    
    
}
