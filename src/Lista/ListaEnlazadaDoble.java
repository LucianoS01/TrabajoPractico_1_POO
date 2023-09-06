package Lista;

public class ListaEnlazadaDoble {
    private Nodo Primero;
    private Nodo Ultimo;
    private int Cantidad;

    public ListaEnlazadaDoble() {
        Primero = null;
        Ultimo = null;
        Cantidad = 0;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public void agregar(Object dato) {
        Nodo nuevoNodo = new Nodo(dato, null, null);

        if (Primero == null) {
            Primero = nuevoNodo;
            Ultimo = nuevoNodo;
        } else {
            Ultimo.setProximo(nuevoNodo);
            nuevoNodo.setAnterior(Ultimo);
            Ultimo = nuevoNodo;
        }

        Cantidad++;
    }





    public boolean esVacia(){
        return (Cantidad == 0);
    }

    public int longitud(){
        int i = 0;
        Nodo NodoAux = Primero;
        while (NodoAux != null){

            i = i+1;
            NodoAux = NodoAux.getProximo();
        }
        return i;
    }
    public void eliminar_elemento(Object dato) {
        Nodo nodo = Primero;
        while (nodo != null) {
            if (nodo.getDato().equals(dato)) {
                if (nodo == Primero) {
                    if (Primero == Ultimo) {
                        Ultimo = null;
                    }
                    Primero = nodo.getProximo();
                    if (Primero != null) {
                        Primero.setAnterior(null);
                    }
                } else if (nodo == Ultimo) {
                    Ultimo = nodo.getAnterior();
                    if (Ultimo != null) {
                        Ultimo.setProximo(null);
                    }
                } else {
                    Nodo nodoProx = nodo.getProximo();
                    Nodo nodoAnt = nodo.getAnterior();
                    nodoAnt.setProximo(nodoProx);
                    nodoProx.setAnterior(nodoAnt);
                }
                Cantidad = Cantidad - 1;
            }
            nodo = nodo.getProximo();
        }
    }




    public void insertar(Object dato, int posicion) {
        posicion = posicion - 1;
        if (posicion < 0 || posicion > Cantidad) {
            return;
        } else {
            int i = 1;
            Nodo nodo = new Nodo(dato,null,null);
            Nodo naux = Primero;
            boolean insertado = false;
            while (!insertado){
                if (posicion == i){
                    nodo.setProximo(Primero);
                    Primero.setAnterior(nodo);
                    Primero = nodo;
                }
                else {
                    Nodo nodoAnt = naux.getAnterior();
                    nodoAnt.setProximo(nodo);
                    nodo.setProximo(naux);
                    naux.setAnterior(nodo);
                    nodo.setAnterior(nodoAnt);
                }
                Cantidad = Cantidad + 1;
                insertado = true;
            }
            naux = naux.getProximo();
            i=i+1;
        }

    }

    public String toString(){
        String acumulador = "";
        Integer i = 1;
        Nodo NodoAux = Primero;
        if (Primero == null){
            acumulador = "Lista Vacia";
        }
        else   {
            while (NodoAux != null){
                acumulador += "Nodo " + i + " " + NodoAux.getDato() + "\n";
                i ++;
                NodoAux = NodoAux.getProximo();
            }
            // return acumulador;
        }


        return acumulador;
    }


}

