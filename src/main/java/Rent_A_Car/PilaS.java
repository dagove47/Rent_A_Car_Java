package Rent_A_Car;
public class PilaS {
    private NodoS topNodo;
    public boolean vacia(){
        return this.topNodo==null;
    }
    private int largo;
    public void push(Solicitud solicitud){
        NodoS newNodo=new NodoS(solicitud);
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
            NodoS aux= this.topNodo;
            while(aux != null){
                listaalquileres += n+"-"+ aux.getAlquileres()+"\n";
                n++;
                aux=aux.getNodoanterior();
            }
        }return listaalquileres;
    }
}
