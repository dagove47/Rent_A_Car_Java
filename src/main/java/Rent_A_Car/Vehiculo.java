/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rent_A_Car;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Vehiculo {
    
    //<editor-fold defaultstate="collapsed" desc="Variables">
    /*
    * Se declaran todas las variables que seran utilizados 
    * en la clase.
    */    
    //</editor-fold>
    
    private String placa;
    private String marca;
    private String modelo;
    private int anno;
    private String color;
    private String cilindrada;
    private String combustible;
    private int pasajeros;
    private int precioDia;
    private String extras;
    private String estado;
    
    //<editor-fold defaultstate="collapsed" desc="Vehiculo(Parametros)">
    /*
    * Se le asignan a Vehiculos todos los parametros
    * que los usuario del sistema usaran para deiferenciar 
    * un vehiculo de otro con velocidad y facilidad.
    */    
    //</editor-fold>
    
    public Vehiculo(String placa, String marca, String modelo, int anno, 
            String color, String cilindrada, String combustible, int pasajeros, 
            int precioDia, String extras, String estado){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
        this.color = color;
        this.cilindrada = cilindrada;
        this.combustible = combustible;
        this.pasajeros = pasajeros;
        this.precioDia = precioDia;
        this.extras = extras;
        this.estado = estado;
    }
    
    public Vehiculo(){}

    //<editor-fold defaultstate="collapsed" desc="Getter and Setter">
    /*
    * Se crea un setter y un getter para 
    * todas las variables que seran utilizados 
    * en otras clases
    */    
    //</editor-fold>
    
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(int precioDia) {
        this.precioDia = precioDia;
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
    
    //<editor-fold defaultstate="collapsed" desc="Override">
    /*
    * En el to string se añaden las variables y las 
    * denotan anteriormente con strings.
    */    
    //</editor-fold>
    
    @Override
    public String toString(){
        return "Vehiculo{" + "placa="+placa+", marca="+marca+", modelo="+modelo+
                ", año="+anno+", color="+color+", cilindrada="+cilindrada+
                ", combustible="+combustible+", pasajeros="+pasajeros+
                ", precio="+precioDia+", extras="+extras+", estado="+estado+'}';
    }
}
