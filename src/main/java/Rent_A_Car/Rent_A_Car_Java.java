/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Rent_A_Car;

import javax.swing.JOptionPane;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Rent_A_Car_Java {

    public static void main(String[] args) {
        
        ListaVehiculo listaVehiculo = new ListaVehiculo();
        ListaCliente listaCliente = new ListaCliente();
        
        int loop = 0;
        while(loop == 0) {
            int addCasa = JOptionPane.showConfirmDialog(null,
                    "Lista de Vehiculos:\n" + listaVehiculo + "\n\n" +
                    "Lista de Clientes:\n" + listaCliente + "\n" +
                            "Desea agregar mas a la fila?",
                    "Question",JOptionPane.YES_NO_OPTION);
            switch(addCasa) {
                case 0:
//  ********************** VEHICULO ***********************
                    
                    String placa = JOptionPane.showInputDialog(
                            "Digite placa:");
                    String marca = JOptionPane.showInputDialog(
                            "Digite marca:");
                    String modelo = JOptionPane.showInputDialog(
                            "Digite modelo:");
                    int anno = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite anno:"));
                    String color = JOptionPane.showInputDialog(
                            "Digite color:");
                    String cilindrada = JOptionPane.showInputDialog(
                            "Digite cilindrada:");
                    String combustible = JOptionPane.showInputDialog(
                            "Digite combustible:");
                    int pasajeros = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite cantidad pasajeros:"));
                    int precioDia = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite precio por Dia:"));
                    String extras = JOptionPane.showInputDialog(
                            "Digite extras:");
                    String estado = JOptionPane.showInputDialog(
                            "Digite estado vehiculo:");
                    
//  ********************** CLIENTE ***********************
                    
                    int cedula = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite cedula del cliente:"));
                    String nombre = JOptionPane.showInputDialog(
                            "Digite el Nombre del cliente:");
                    String nacimiento = JOptionPane.showInputDialog(
                            "Digite nacimiento cliente:");
                    String email = JOptionPane.showInputDialog(
                            "Digite email del cliente:");
                    String categoria = JOptionPane.showInputDialog(
                            "Digite categoria del cliente:");
                    
                    listaVehiculo.inserta(new Vehiculo(placa, marca, modelo, 
                            anno, color, cilindrada, combustible, pasajeros, 
                            precioDia, extras, estado));
                    listaCliente.inserta(new Cliente(cedula, nombre, nacimiento, 
                            email, categoria));
                    break;
                default:
                    loop = 1;
                    break;
            }
        }
        System.exit(0);
    }
}
