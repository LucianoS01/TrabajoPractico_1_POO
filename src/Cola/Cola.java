package Cola;

public class Cola {
    private Nodo primero;
    private int cantidad;

    public Cola(){
        primero = null;
        cantidad = 0;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void encolar(Object dato){
        Nodo nodo  = new Nodo(dato, null);
        Nodo nodoAux = primero;
        if (primero == null){
            primero = nodo;
        }else {
            while (nodoAux.getProximo() != null){
                nodoAux = nodoAux.getProximo();
            }
            nodoAux.setProximo(nodo);
        }
        cantidad = cantidad +1;
    }

    public Object desencolar(){

        if (primero == null){
            return  null;
        }else{
            Object valor = primero.getDato();
            primero = primero.getProximo();
            cantidad = cantidad -1;
            return valor;

        }


    }

    public void mostrar_la_cola() {
        Nodo actual = primero;
        System.out.print("Cola: ");

        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getProximo();
        }

    }


}
