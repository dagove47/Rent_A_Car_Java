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
    
    @Override
    public String toString(){
        return "Vehiculo{" + "placa="+placa+", marca="+marca+", modelo="+modelo+
                ", anno="+anno+", color="+color+", cilindrada="+cilindrada+
                ", combustible="+combustible+", pasajeros="+pasajeros+
                ", precio="+precioDia+", extras="+extras+", estado="+estado+'}';
    }
}
