/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rent_A_Car;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Cliente {
    /*
    * Se declaran todas las variables que se van a usar para identificar a los 
    * clientes en el futuro, ademas se indica el tipo de variable. 
    * 
    */
    private int cedula;
    private String nombre;
    private String nacimiento;
    private String email;
    private String categoria;
    
    
    /*
    *  Se crea el metodo cliente con los identificadoes importantes 
    *  y se le asignan las variabes creadas anteriormente 
    */
    public Cliente(int cedula, String nombre, String nacimiento, String email, 
            String categoria){
        this.cedula = cedula;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.email = email;
        this.categoria = categoria;
    }
    
    public Cliente(){}
    
    
    /*
    * Se crea un seter y geter para asignarle a todas las 
    * variables un valor desde fuera de la clase cliente
    */
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    /*
    * Se hace un override que se usara para listar lis integrante de la lista de 
    * clientes. La lista sera imprimida como un sting entonces es importante que 
    * este metodo funcione para que el codigo siga las instrucciones futuras
    */
    @Override
    public String toString(){
        return "Cliente{" + "cedula="+cedula+", nombre="+nombre+", nacimiento="+
                nacimiento+", email="+email+", categoria="+categoria+'}';
    }
}
