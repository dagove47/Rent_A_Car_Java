package Rent_A_Car;

public class PilaAsignar {
    private NodoA topNodo;
    
    public boolean vacia(){
        return this.topNodo==null;
    }
    
    private int largo;
    public void push(Asignar solicitud){
        NodoA newNodo=new NodoA(solicitud);
        if(this.topNodo==null){
            this.topNodo=newNodo;
        }else {
            newNodo.setNodoanterior(this.topNodo);
            this.topNodo=newNodo;
        }
        this.largo++;
    }
    
    public String listarPila(){
        String listaalquileres="";
        int n=1;
        if (!vacia()) {
            NodoA aux= this.topNodo;
            while(aux != null){
                listaalquileres += n+"-"+ aux.getAlquileres()+"\n";
                n++;
                aux=aux.getNodoanterior();
            }
        }return listaalquileres;
    }
}
