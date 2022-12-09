/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rent_A_Car;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class ColaSolicitud {
    private NodoS frente;
    private NodoS ultimo;

    public ColaSolicitud() {
    }
    
    public void encola(Solicitud solicitud){
        NodoS newNodo=new NodoS(solicitud);
        if(frente == null){
            frente = newNodo;
            ultimo = newNodo;
        } else{
            ultimo.setNodoAnterior(newNodo);
            ultimo=newNodo;
        }
    }
    
    public void preferencial(Solicitud solicitud) {
        NodoS newNodo=new NodoS(solicitud);
        if(frente == null){
            frente = newNodo;
            ultimo = newNodo;
        } else{
            newNodo.setNodoAnterior(frente);
            frente = newNodo;
        }
    }
    
//    public boolean buscar(int num) {
//        boolean result = false;
//        NodoS aux = frente;
//        while(aux != null){
//            if(num == aux.getCedula()){
//                result = true;
//            }
//            aux=aux.getNodoAnterior();
//        }
//        return result;
//    }
    
    public NodoS atiende(){
        NodoS aux = frente;
        if(frente!=null){
            frente=frente.getNodoAnterior();
            aux.setNodoAnterior(null);
        }
        return aux;
    }
    
    @Override
    public String toString(){
        String s="";
        NodoS aux=frente;
        while(aux!=null){
            s+=aux+"\n";
            aux=aux.getNodoAnterior();
        }
        return s;
    }
}
