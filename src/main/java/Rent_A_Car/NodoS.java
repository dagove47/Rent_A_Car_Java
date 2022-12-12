package Rent_A_Car;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */


public class NodoS {
    
    //<editor-fold defaultstate="collapsed" desc="Variables">
    /*
    * Se declaran las variables que 
    * van a ser usadas en el futuro.
    */    
    //</editor-fold>
    
    private Solicitud dato;
    private NodoS nodoAnterior;
    
    public NodoS() {}
    
    //<editor-fold defaultstate="collapsed" desc="Setter y Getter">
    /*
    * Se crea un setter y un getter
    * para todos los datos que seran
    * utilizados en otras clases y en el main.
    */    
    //</editor-fold>
    
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
    
    //<editor-fold defaultstate="collapsed" desc="(Solicituyd dato)">
    /*
    * Se añade "Solicitud dato" dentro del parentesis de
    * NodoS para que cuando el codigo se corra
    * se sepa que se pueda aceptar "dato" siempre
    * y cuando sea tipo "Solicitud"
    */    
    //</editor-fold>
    
    public NodoS(Solicitud dato) {
        this.dato = dato;
    }
    
    //<editor-fold defaultstate="collapsed" desc="toString">
    /*
    * Se hace uso del toString de java para 
    * generar una representacion de dato 
    * tipo string para poder poner en la
    * lista.
    */    
    //</editor-fold>
    
    @Override
    public String toString(){
        return dato.toString();
    }
}
