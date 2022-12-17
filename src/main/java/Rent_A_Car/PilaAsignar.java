package Rent_A_Car;

public class PilaAsignar {

    private NodoA topNodo;

    //<editor-fold defaultstate="collapsed" desc="Vacia">
    /*
    * el metodo Vacia fuerza a topNodo 
    * a ser un conjunto vacio.
     */
    //</editor-fold>
    public boolean vacia() {
        return this.topNodo == null;
    }

    private int largo;

    /*
    * se generan las variables que 
    * se van a usar en esta y otras clases.
     */
    //<editor-fold defaultstate="collapsed" desc="Push">
    /*
    * cuando push recibe un "Asignar" lo designa
    * como "solicitud". Luego crea un nuevo Nodo
    * llamado newNodo y chequea si topNodo es vacio,
    * en caso de que lo fuera topNodo se vuelve igual
    * a newNodo que tiene como valor "solicitud".
    * Si topNodo no es vacio entonces newNodo se 
    * posiciona detras de topNodo y topNodo
    * se iguala a newNodo. Finalmente se le añade 
    * 1 a largo para que el codigo sepa que tan
    * larga es la pila.
     */
    //</editor-fold>
    public void push(Asignar solicitud) {
        NodoA newNodo = new NodoA(solicitud);
        if (this.topNodo == null) {
            this.topNodo = newNodo;
        } else {
            newNodo.setNodoanterior(this.topNodo);
            this.topNodo = newNodo;
        }
        this.largo++;
    }

    //<editor-fold defaultstate="collapsed" desc="listarPila">
    /*
    * se crea un strin llamado listaralquileres
    * y un integer llamado "n" que es igual a 1
    * si vacia es falso entonces se crea un 
    * nodo llamado aux que es igual a topNodo
    * y mientras aux sea diferente un vacio
    * se le agrega a listadealquileres el
    * valor de "n" más el simbolo "-" más el 
    * getAlquileres de aux más el comando 
    * de crear una nueva linea de texto,
    * luego se añade 1 a "n" y aux se 
    * convierte en el nodo que esta detras
    * de su valor actual. una vez vacia se 
    * vuelve true se presenta  
    * listadealquileres como respuesta.
     */
    //</editor-fold>
    @Override
    public String toString() {
        String listaalquileres = "";
        int n = 1;
        if (!vacia()) {
            NodoA aux = this.topNodo;
            while (aux != null) {
                listaalquileres += n + "-" + aux.getAlquileres() + "\n";
                n++;
                aux = aux.getNodoanterior();
            }
        }
        return listaalquileres;

    }
}
