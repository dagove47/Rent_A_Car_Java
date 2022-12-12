package Rent_A_Car;

public class NodoA {
    /*
    * Se generan las variables que se van a 
    * utilizzar en esta clase.
    */
    
    private Asignar alquileres;
    private NodoA nodoanterior;
    
    public NodoA() {
    }
    
    /*
    * En el override 
    */
    
    @Override
    public String toString(){
        return alquileres.toString();
    }

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
}
