package Rent_A_Car;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class ColaSolicitud {
    /*
    * Se declaran las variables que se van a usar en la
    * clase.
    */
    
    ListaCliente listaCliente = new ListaCliente();
    private NodoS frente;
    private NodoS ultimo;

    public ColaSolicitud() {
    }
    
    //<editor-fold defaultstate="collapsed" desc="Encola">
    /* 
    * Se declara un nodo nuevo llamado newNodo
    * si el nodo frente no existe se crea un  nuevo nodo llamado
    * frente y otro llamado ultimo. Si el nodo llamado frente ya
    * existe entonces newNodo se pone detras de ultimo y ultimo 
    * se iguala a Newnodo
    */    
    //</editor-fold>
    
    
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
    //<editor-fold defaultstate="collapsed" desc="Preferencial">
    /*
    * se crea un nodo nuevo llamado NewNodo, si frente no existe 
    * se crean dos nodos nuevos uno llamado frente y uno llamado 
    * ultimo, si frente ya existe entonces newNodo se crea antes que frente
    * y frente se iguala a newNodo.
    */    
    //</editor-fold>
    
    
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

    public void categoria(int num) {
        listaCliente.categoria(num);
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
    
    
    //<editor-fold defaultstate="collapsed" desc="Atiende">
    /* 
    * Se crea un nuevo Nodo lamado aux que es
    * exactamente igual que frente, si frente 
    * existe entonces frente se convierte en 
    * el nodo que esta antes, aux pierde su
    * valor y el valor de aux se regresa
    * como el resultado de atiende.
    */    
    //</editor-fold>
    
    
    
    public NodoS atiende(){
        NodoS aux = frente;
        if(frente!=null){
            frente=frente.getNodoAnterior();
            aux.setNodoAnterior(null);
        }
        return aux;
    }
    //<editor-fold defaultstate="collapsed" desc="Override">
    /*
    * El override convierte la lista en un string 
    * entonces se crea un sting llamado "s" y un nodo
    * llamado aux que es igual a frente, luego si aux 
    * existe el contenido de aux se agrega al vacio
    * que es "s" y se crea una nueva linea de texto. 
    * Luego aux se convierte en el nodo que existe 
    * detras del frente y luego se da como resultado
    * "s"
    */    
    //</editor-fold>
    
    
    
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
