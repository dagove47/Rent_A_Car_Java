package Rent_A_Car;

public class NodoA {
    /*
    * Se generan las variables que se van a 
    * utilizar en esta clase.
    */
    
    private Asignar alquileres;
    private NodoA nodoanterior;
    
    public NodoA() {
    }
    
    //<editor-fold defaultstate="collapsed" desc="Override">
    /*
    * En el override solamente 
    * hace uso del metodo toString
    * que simplemente regresa una 
    * representacion string del 
    * valor que se le ha pedido.
    */        
    //</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="Override">
    /*
    * se asigna un getter y un setter para las variables
    * que se van a usar en otras clases y en el main.
    */        
    //</editor-fold>
    
    
    public Asignar getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(Asignar alquileres) {
        this.alquileres = alquileres;
    }

    public NodoA getNodoanterior() {
        return nodoanterior;
    }

    public void setNodoanterior(NodoA nodoanterior) {
        this.nodoanterior = nodoanterior;
    }

    public NodoA(Asignar alquileres) {
        this.alquileres = alquileres;
    }

    @Override
    public String toString() {
        return alquileres.toString();
    }
    
    
}
