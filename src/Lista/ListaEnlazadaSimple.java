package Lista;

public class ListaEnlazadaSimple {
    private Nodo Primero;
    private int Cantidad;

    //Tenemos la funcion Agregar
    public void agregar(Object dato){
        Nodo NuevoNodo = new Nodo(dato, null, null);
        NuevoNodo.setDato(dato);
        if (Primero == null){
            Primero = NuevoNodo;
        }
        else{
            Nodo NodoAux = Primero;
            while (NodoAux.getProximo() != null) {
                NodoAux = NodoAux.getProximo();
            }
            NodoAux.setProximo(NuevoNodo);
        }

    }

    public void insertar(Object dato, int posicion) {
        posicion = posicion - 1;
        if (posicion < 0 || posicion > longitud()) {
            return;
        } else {
            Nodo nodo = new Nodo(dato, null, null);

            if (posicion == 0) {
                nodo.setProximo(Primero);
                Primero = nodo;
            } else {

                int i = 0;
                Nodo actual = Primero;
                Nodo anterior = null;

                while (i < posicion) {
                    anterior = actual;
                    actual = actual.getProximo();
                    i++;
                }

                nodo.setProximo(actual);
                anterior.setProximo(nodo);
            }

            Cantidad = Cantidad + 1;
        }
    }





    //Funciona Eliminar.
    public void   eliminar_elemento(Object dato){

        if (Primero == null){
            //La lista esta vacia.
            return;
        }

        //Si es el primer elemento lo borramos.
        if (Primero.getDato().equals(dato)){
            Primero = Primero.getProximo();
            return;
        }

        Nodo NodoAux = Primero;
        while (NodoAux != null  )
        {
            if (NodoAux.getProximo().getDato().equals(dato)){
                NodoAux.setProximo(NodoAux.getProximo().getProximo());
                return;
            }

            NodoAux = NodoAux.getProximo();
        }



    }


    public Object recuper_elemento(int posicion){
        if (posicion > longitud() && (posicion < 0)){
            return  null;
        }
        else {
            int  i = 1;
            Nodo Nodoo = Primero;
            while (Nodoo != null){
                if (i == posicion){
                    return Nodoo.getDato();
                }
                i = i + 1;
                Nodoo = Nodoo.getProximo();
            }

            return null;
        }

    }

    //Funcion Longitud devuelve un entero.
    public int longitud(){
        int i = 0;
        Nodo NodoAux = Primero;
        while (NodoAux != null){

            i = i+1;
            NodoAux = NodoAux.getProximo();
        }
        return i;
    }

    //Funcion Es vacia que retona un string.
    public String Es_Vacia(){
        String mostrar= "";
        if (Primero == null){
            mostrar = "Es Vacia";
        }
        else mostrar = "No Es Vacia";;

        return mostrar;
    }




    //Funcion Muestra el objeto.
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