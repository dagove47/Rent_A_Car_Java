package Rent_A_Car;
public class Solicitud {
    private String placa;
    private String cedula;
    private String estadoSolicitud;

    public Solicitud() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEstadoSolicitud() {
        return estadoSolicitud;
    }

    public void setEstadoSolicitud(String estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }

    public Solicitud(String placa, String cedula, String estadoSolicitud) {
        this.placa = placa;
        this.cedula = cedula;
        this.estadoSolicitud = estadoSolicitud;
    }@Override
    public String toString(){return "Solicitud{" + "placa="+placa+", cedula="+cedula+"," +
            " estado="+estadoSolicitud+'}';
    }
}
