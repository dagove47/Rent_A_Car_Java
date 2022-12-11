package Rent_A_Car;
public class Asignar {
    
    /*
    * Se asignan todas las variables que se van a usar en esta clase 
    * y seguidamente se crea un setter y un getter para poder 
    * determinar el valor y utilizar ese mismo valor desde 
    */
    
    private String placa;
    private String cedula;
    private String estadoSolicitud;

    public Asignar() {
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
    
    /*
    * El metodo asignar guarda en si mismo el la placa la cedula 
    * y el estado de la solicitud para identificar una asigancion
    * de manera simple y rapida no solo para el usuario
    * pero tambien para la maquina que desempeña el codigo.
    */
    
    public Asignar(String placa, String cedula, String estadoSolicitud) {
        this.placa = placa;
        this.cedula = cedula;
        this.estadoSolicitud = estadoSolicitud;
    }
    /*
    * Este override esta aqui para que cuando se pida el print 
    * de los contenidos de la lista se pudan dar todos los datos de una
    * manera que sea entendible y utilizable.
    */
    @Override
    public String toString(){return "Asignar{" + "placa="+placa+", cedula="+cedula+"," +
            " estado="+estadoSolicitud+'}';
    }
}
