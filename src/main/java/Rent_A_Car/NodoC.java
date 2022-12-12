package Rent_A_Car;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class NodoC {
    
    /*
    * Se declaran las variables que se van a usar
    * en esta y las otras clases.
    */    
    
    private Cliente dato;
    private NodoC next;
    
    
    //<editor-fold defaultstate="collapsed" desc="toString">
    /*
    * El metodo to string se usa para convertir 
    * a "dato" que es tipo cliente a un string
    * que podamos usar luego para listar 
    * la lista completa.
    */ 
    //</editor-fold>
    
    @Override
    public String toString(){
        return dato.toString();
    }
    
    //<editor-fold defaultstate="collapsed" desc="Override">
    /*
    * Se especifica que dato
    * sera con una variable tipo
    * Cliente llamada dato
    * y se le asigna a este dato 
    * el dato que se declaro al 
    * inicio de la clase
    */    
    //</editor-fold>
    
    public NodoC(Cliente dato){
        this.dato=dato;
    }
    
    //<editor-fold defaultstate="collapsed" desc="Setter y Getter">
    /*
    * Se crea un setter y un getter para todas
    * las variables que se van a usar en las 
    * otras clases y el main.
    */
    //</editor-fold>
    
    public Cliente getDato() {
        return dato;
    }

    public void setDato(Cliente dato) {
        this.dato = dato;
    }

    public NodoC getNext() {
        return next;
    }

    public void setNext(NodoC next) {
        this.next = next;
    }
}
