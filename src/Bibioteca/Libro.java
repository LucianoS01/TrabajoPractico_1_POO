package Bibioteca;

public class Libro {

    private String Titulo;
    private String Autor;
    private String ISBN;
    private int numero_paginas;
    private int cantidad_ejemplares;
    private int cantidad_prestados;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }


    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public int getCantidad_ejemplares() {
        return cantidad_ejemplares;
    }

    public void setCantidad_ejemplares(int cantidad_ejemplares) {
        this.cantidad_ejemplares = cantidad_ejemplares;
    }

    public int getCantidad_prestados() {
        return cantidad_prestados;
    }

    public void setCantidad_prestados(int cantidad_prestados) {
        this.cantidad_prestados = cantidad_prestados;
    }
}
