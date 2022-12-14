/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rent_A_Car;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Solicitud {
    
    //<editor-fold defaultstate="collapsed" desc="Variables">
    /*
    * Se declaran todas las variables que sera unsadas en esta 
    * calse.
    */    
    //</editor-fold>
    
    private int cedula;
    private int diasAlquiler;
    private int minimoPasajeros;
    private String marca;
    private String modelo;
    private String anno;
    private String extras;
    private String estado;
    private String catCliente;
    
    public Solicitud(){}
    
    //<editor-fold defaultstate="collapsed" desc="Setter y Getter">
    /*
    * Se crea un setter y un getter para que se puedan 
    * asignar valores no solo desde esta clase pero tambien 
    * dede cualquier otra clase.
    */    
    //</editor-fold>

    public Solicitud(int cedula, int diasAlquiler, int minimoPasajeros, String marca, String modelo, String anno, String extras, String estado, String catCliente) {
        this.cedula = cedula;
        this.diasAlquiler = diasAlquiler;
        this.minimoPasajeros = minimoPasajeros;
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
        this.extras = extras;
        this.estado = estado;
        this.catCliente = catCliente;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }

    public int getMinimoPasajeros() {
        return minimoPasajeros;
    }

    public void setMinimoPasajeros(int minimoPasajeros) {
        this.minimoPasajeros = minimoPasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCatCliente() {
        return catCliente;
    }

    public void setCatCliente(String catCliente) {
        this.catCliente = catCliente;
    }
    
    //<editor-fold defaultstate="collapsed" desc="Override">
    /*
    * Se crea un string que a??ade todos los parametros 
    * y un string que designa que es cada parametro.
    */    
    //</editor-fo

    @Override
    public String toString() {
        return "Solicitud{" + "cedula=" + cedula + "diasAlquiler=" + diasAlquiler + ", minimoPasajeros=" + minimoPasajeros 
                + ", marca=" + marca + ", modelo=" + modelo + ", anno=" + anno + ", extras=" + extras + ", estado=" + estado + ", categoria=" + catCliente + '}';
    }
}
