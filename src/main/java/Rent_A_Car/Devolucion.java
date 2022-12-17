/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rent_A_Car;

/**
 *
 * @author gblan
 */
public class Devolucion {
    private String placa;
    private String estado;
    private int id; 

    public Devolucion(String placa, String estado, int id) {
        this.placa = placa;
        this.estado = estado;
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Devolucion{" + "placa=" + placa + ", estado=" + estado + ", id=" + id + '}';
    }
    
    
}
