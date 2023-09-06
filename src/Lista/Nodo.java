package Lista;
public class Nodo {
    private Object dato;
    private Nodo proximo;
    private Nodo Anterior;

    public Nodo(Object dato, Nodo proximo, Nodo anterior) {
        this.dato = dato;
        this.proximo = proximo;
        this.Anterior = anterior;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Object getDato() {
        return dato;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public Nodo getAnterior() {
        return Anterior;
    }

    public void setAnterior(Nodo anterior) {
        Anterior = anterior;
    }
}
