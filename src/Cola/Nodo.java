package Cola;
public class Nodo {
    private Object dato;
    private Nodo proximo;

    public Nodo(Object dato, Nodo proximo) {
        this.dato = dato;
        this.proximo = proximo;
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
}
