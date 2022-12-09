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
    private int diasAlquiler;
    private int minimoPasajeros;
    private String marca;
    private String modelo;
    private String anno;
    private String extras;
    
    public Solicitud(){}

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
    
    public Solicitud(int diasAlquiler, int minimoPasajeros, String marca, String modelo, String anno, String extras){
        this.diasAlquiler = diasAlquiler;
        this.minimoPasajeros = minimoPasajeros;
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
        this.extras = extras;
    }
    
    @Override
    public String toString(){return "Solicitud{" + "diasAlquiler="+diasAlquiler+", minimoPasajeros="+minimoPasajeros+"," +
            " marca="+marca+" modelo="+modelo+" anno="+anno+" extras="+extras+'}';
    }
}
