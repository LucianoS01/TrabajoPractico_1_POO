package Pila;

public class Pila {
    private Nodo Tope;
    private int cantidad;

    public Pila(){
        Tope=null;
        cantidad = 0;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Nodo getTope() {
        return Tope;
    }


    public void Apilar(Object dato){
        Nodo nodo = new Nodo(dato, null);
        if (Tope != null){
            nodo.setProximo(this.Tope);
        }
        Tope = nodo;
        cantidad = cantidad + 1;
    }


    public Object Desapilar(Object dato){

        if (Tope == null){
            return null;
        }else{
            Object valor = Tope.getDato();
            Tope = Tope.getProximo();
            cantidad = cantidad - 1;
            return valor;
        }

    }

    public void Mostramos_pila() {
        Nodo actual = Tope;
        System.out.print("Pila: ");
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getProximo();
        }
    }


}


