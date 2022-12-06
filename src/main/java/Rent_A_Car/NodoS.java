package Rent_A_Car;
public class NodoS {
    private Solicitud alquileres;
    private NodoS nodoanterior;
    public NodoS() {
    }
    @Override
    public String toString(){
        return alquileres.toString();
    }

    public Solicitud getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(Solicitud alquileres) {
        this.alquileres = alquileres;
    }

    public NodoS getNodoanterior() {
        return nodoanterior;
    }

    public void setNodoanterior(NodoS nodoanterior) {
        this.nodoanterior = nodoanterior;
    }

    public NodoS(Solicitud alquileres) {
        this.alquileres = alquileres;
    }
}
