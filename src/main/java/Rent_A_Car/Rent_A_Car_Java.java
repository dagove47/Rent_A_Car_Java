package Rent_A_Car;

import Interfaces.MenuPrincipal;
import javax.swing.JOptionPane;
import java.nio.channels.Pipe;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */

public class Rent_A_Car_Java {

    public static void main(String[] args) {
        
        MenuPrincipal menu = new MenuPrincipal();
        
        // Se crea menu de tipo Menu principal llamado "menu"
        
        menu.setVisible(true);
        
<<<<<<< Updated upstream
        // El menu se vuelve visible
        
        ListaVehiculo listaVehiculo = new ListaVehiculo();
        
        // Se crea una lista para vehiculo llamada "listavehiculo"
        
        ListaCliente listaCliente = new ListaCliente();
        
        // Se crea una lista de clientes llamada "listacliente"
        
        PilaAsignar listaSolicitudes= new PilaAsignar();
        
        /* Se crea una pila tipo PilaAsignar llamada 
        *"lista solicitudes"
        */
            
        ColaSolicitud colaSolicitud = new ColaSolicitud();
        
        /* Se crea una cola de solicitudes llamada 
        * "coladesolicitudes"
        */
        
        int loop = 0;
        
        // Se crea un entero llamado loop que es igual a 0 
        
        while(loop == 0) {
            
            // Mientras loop sea igual a cero este while no se acaba
            
            int addCasa = JOptionPane.showConfirmDialog(null,
                    "Lista de Vehiculos:\n" + listaVehiculo + "\n\n" +
                    "Lista de Clientes:\n" + listaCliente + "\n" +
                    "Lista de Solicitudes:\n" + colaSolicitud.toString() + "\n" +
                    "Lista de Asignar:\n" + listaSolicitudes.listarPila() + "\n" +
                            "Desea agregar mas a la fila?",
                    "Question",JOptionPane.YES_NO_OPTION);
            
            /* Se enseña un confirm dialog que muestra las listas que hemos creado
            * y pregunta si se desea crear más filas y presenta una opcion si y una 
            * opcion no
            */
            
            switch(addCasa) {
            
            /*
            * Se crea un switch case para poder controlar 
            * el output basado en la respuesta del usuario
            * (SI o NO)
            */        
                case 0:
                    
// En el caso que el usuario selecione SI : 
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
                    
                    listaVehiculo.elimina("ABC123");
                    
                    //**************SOLICITUDALQUILER*******************
                    
                    int diasAlquiler = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite cantidad dias Alquiler:"));
                    int minimoPasajeros = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite minimo de Pasajeros:"));
                    String marcaS = JOptionPane.showInputDialog(
                            "Digite preferencia marca:");
                    String modeloS = JOptionPane.showInputDialog(
                            "Digite preferencia modelo:");
                    String annoS = JOptionPane.showInputDialog(
                            "Digite preferencia anno:");
                    String extrasS = JOptionPane.showInputDialog(
                            "Digite extras en particular:");
                    colaSolicitud.encola(new Solicitud(diasAlquiler, minimoPasajeros, marcaS, modeloS, annoS, extrasS));
                    
                    //**************Asignar ALQUILER*******************
                    String placaA= JOptionPane.showInputDialog(
                            "Digite placa:");
                    String cedulaA = JOptionPane.showInputDialog(
                            "Digite cedula:");
                    String estadoA = JOptionPane.showInputDialog(
                            "Digite estado:");
                    listaSolicitudes.push(new Asignar(placaA,cedulaA, estadoA));
                    
                                       
                    break;
                    
                    //<editor-fold defaultstate="collapsed" desc="SI">
                    /*
                    * Se le pide al usuario que digite los datos relevantes
                    * para los vehiculos, el cliente la solicitud de alquiler
                    * y lo necesario para asignar dicho alquiler, finalmente se 
                    * utiliza break para indicar que el caso 0 finalizo
                    */
                    //</editor-fold>
                    
                default:
                    
                    // En caso de presionar NO
                    
                    /* 
                    * Se cambia el valor de loop a uno y se utiliza break
                    * para indicar que se finalizo el caso "default"
                    */
                    
                    loop = 1;
                    break;
            }
        }
        System.exit(0);
=======
//        ListaVehiculo listaVehiculo = new ListaVehiculo();
//        ListaCliente listaCliente = new ListaCliente();
//        PilaAsignar listaSolicitudes= new PilaAsignar();
//        ColaSolicitud colaSolicitud = new ColaSolicitud();
//        
//        int loop = 0;
//        while(loop == 0) {
//            int addCasa = JOptionPane.showConfirmDialog(null,
//                    "Lista de Vehiculos:\n" + listaVehiculo + "\n\n" +
//                    "Lista de Clientes:\n" + listaCliente + "\n" +
//                    "Lista de Solicitudes:\n" + colaSolicitud.toString() + "\n" +
//                    "Lista de Asignar:\n" + listaSolicitudes.listarPila() + "\n" +
//                            "Desea agregar mas a la fila?",
//                    "Question",JOptionPane.YES_NO_OPTION);
//            switch(addCasa) {
//                case 0:
////  ********************** VEHICULO ***********************
//                    String placa = JOptionPane.showInputDialog(
//                            "Digite placa:");
//                    String marca = JOptionPane.showInputDialog(
//                            "Digite marca:");
//                    String modelo = JOptionPane.showInputDialog(
//                            "Digite modelo:");
//                    int anno = Integer.parseInt(JOptionPane.showInputDialog(
//                            "Digite anno:"));
//                    String color = JOptionPane.showInputDialog(
//                            "Digite color:");
//                    String cilindrada = JOptionPane.showInputDialog(
//                            "Digite cilindrada:");
//                    String combustible = JOptionPane.showInputDialog(
//                            "Digite combustible:");
//                    int pasajeros = Integer.parseInt(JOptionPane.showInputDialog(
//                            "Digite cantidad pasajeros:"));
//                    int precioDia = Integer.parseInt(JOptionPane.showInputDialog(
//                            "Digite precio por Dia:"));
//                    String extras = JOptionPane.showInputDialog(
//                            "Digite extras:");
//                    String estado = JOptionPane.showInputDialog(
//                            "Digite estado vehiculo:");
//                    
////  ********************** CLIENTE ***********************
////                    
//                    int cedula = Integer.parseInt(JOptionPane.showInputDialog(
//                            "Digite cedula del cliente:"));
//                    String nombre = JOptionPane.showInputDialog(
//                            "Digite el Nombre del cliente:");
//                    String nacimiento = JOptionPane.showInputDialog(
//                            "Digite nacimiento cliente:");
//                    String email = JOptionPane.showInputDialog(
//                            "Digite email del cliente:");
//                    String categoria = JOptionPane.showInputDialog(
//                            "Digite categoria del cliente:");
//                    
//                    listaVehiculo.inserta(new Vehiculo(placa, marca, modelo, 
//                            anno, color, cilindrada, combustible, pasajeros, 
//                            precioDia, extras, estado));
//                    listaCliente.inserta(new Cliente(cedula, nombre, nacimiento, 
//                            email, categoria));
//                    
//                    listaVehiculo.elimina("ABC123");
//                    
//                    //**************SOLICITUDALQUILER*******************
//                    
//                    int diasAlquiler = Integer.parseInt(JOptionPane.showInputDialog(
//                            "Digite cantidad dias Alquiler:"));
//                    int minimoPasajeros = Integer.parseInt(JOptionPane.showInputDialog(
//                            "Digite minimo de Pasajeros:"));
//                    String marcaS = JOptionPane.showInputDialog(
//                            "Digite preferencia marca:");
//                    String modeloS = JOptionPane.showInputDialog(
//                            "Digite preferencia modelo:");
//                    String annoS = JOptionPane.showInputDialog(
//                            "Digite preferencia anno:");
//                    String extrasS = JOptionPane.showInputDialog(
//                            "Digite extras en particular:");
//                    colaSolicitud.encola(new Solicitud(diasAlquiler, minimoPasajeros, marcaS, modeloS, annoS, extrasS));
//                    
//                    //**************Asignar ALQUILER*******************
//                    String placaA= JOptionPane.showInputDialog(
//                            "Digite placa:");
//                    String cedulaA = JOptionPane.showInputDialog(
//                            "Digite cedula:");
//                    String estadoA = JOptionPane.showInputDialog(
//                            "Digite estado:");
//                    listaSolicitudes.push(new Asignar(placaA,cedulaA, estadoA));
//                    
//                                       
//                    break;
//                default:
//                    loop = 1;
//                    break;
//            }
//        }
//        System.exit(0);
>>>>>>> Stashed changes
    }
}
