package Bibioteca;

public class Bibliotaca {

    private Libro[] lista_de_libros;
    private int cantidad_libros;

    public Bibliotaca() {
        lista_de_libros = new Libro[10];
        cantidad_libros = 0;
    }

    public void agregar_libro (String Titulo, String Autor, String ISBN, int numero_paginas, int cantidad_ejemplares, int cantidad_prestados){
        Libro libro;
        libro = new Libro();
        libro.setTitulo(Titulo);
        libro.setAutor(Autor);
        libro.setISBN(ISBN);
        libro.setNumero_paginas(numero_paginas);
        libro.setCantidad_ejemplares(cantidad_ejemplares);
        libro.setCantidad_prestados(cantidad_prestados);
        lista_de_libros[cantidad_libros] = libro;
        cantidad_libros = cantidad_libros + 1;
    }


    public boolean buscar_libro(String Titulo){
        for (int i = 0; i <cantidad_libros; i++){
            if (lista_de_libros[i].getTitulo().equals(Titulo)){
                return true;
            }

        }
        return  false;
    }



    public void  quienTieneMasPaginas(String L_Titulo1, String L_Titulo2 ){
        int cantidad_paginas_libro_1 = 0;
        int cantidad_paginas_libro_2 = 0;

        boolean existe_Libro_1 = false;
        boolean existe_libro_2 = false;

        existe_Libro_1 = buscar_libro(L_Titulo1);
        existe_libro_2 = buscar_libro(L_Titulo2);

        if (!existe_Libro_1 && !existe_libro_2){
            System.out.println("No existe ninguno de los 2 libros");
            return ;
        }
        else if (!existe_Libro_1){
            System.out.println("No existe el libro: "+ L_Titulo1 );
            return ;
        }
        else if (!existe_libro_2){
            System.out.println("No existe el libro: "+ L_Titulo2 );
            return;
        }

        for (int i = 0; i <cantidad_libros; i++){
            if (lista_de_libros[i].getTitulo().equals(L_Titulo1)){
                cantidad_paginas_libro_1 = lista_de_libros[i].getNumero_paginas();
            }
            if (lista_de_libros[i].getTitulo().equals(L_Titulo2)){
                cantidad_paginas_libro_2 = lista_de_libros[i].getNumero_paginas();
            }


        }
        if (cantidad_paginas_libro_1 > cantidad_paginas_libro_2){
            System.out.println("El libro "+ L_Titulo1 + " tiene mas paginas con respecto al libro "+ L_Titulo2 );
        }
        else if(cantidad_paginas_libro_2 > cantidad_paginas_libro_1){
            System.out.println("El libro "+ L_Titulo2 + " tiene mas paginas con respecto al libro "+ L_Titulo1 );
        }
        else{
            System.out.println("Los libros tienen las mismas cantidad de paginas" );
        }

    }

    public void  calcularTotaLibrosPrestados(){
        int total_libros_prestados = 0;
        for (int i = 0; i <cantidad_libros; i++){
            total_libros_prestados = total_libros_prestados + lista_de_libros[i].getCantidad_prestados();
        }

        System.out.println("La cantidad total de los libros prestados en esta bibliote son: "+ total_libros_prestados);

    }

    public void prestar_ejemplar(String Titulo, int cantidad_a_prestar){
        int cantidad_ejemplares_actualizar = 0;
        int cantidad_prestados_actualizar = 0;
        boolean existe_Libro_1 = false;
        existe_Libro_1 = buscar_libro(Titulo);

        if (!existe_Libro_1){
            System.out.println("No existe ninguno libro con su titulo : "+ Titulo);
            return ;
        }else{
            for (int i = 0; i <cantidad_libros; i++){
                if (lista_de_libros[i].getTitulo().equals(Titulo)){
                    cantidad_ejemplares_actualizar  = lista_de_libros[i].getCantidad_ejemplares();
                    lista_de_libros[i].setCantidad_ejemplares(cantidad_ejemplares_actualizar - cantidad_a_prestar);
                    cantidad_prestados_actualizar = lista_de_libros[i].getCantidad_prestados();
                    lista_de_libros[i].setCantidad_prestados(cantidad_prestados_actualizar + cantidad_a_prestar);
                    System.out.println("Se actualizo la cantidad de ejemplares y cantidad de prestamos del libro : " + Titulo + " Corretamente!! ");
                }

            }
        }

    }


    public void mostrar_lista_libros() {
        System.out.println("Lista de Libros:");

        for (int i = 0; i < cantidad_libros; i++) {
            Libro libro = lista_de_libros[i];
            System.out.println("Libro " + (i + 1) + ":");
            System.out.println("El libro: " + libro.getTitulo() + " ");
            System.out.println("Creado por el autor: " + libro.getAutor()+ " ");
            System.out.println("tiene " + libro.getNumero_paginas()+ " paginas"+ " ");
            System.out.println("quedan  " + libro.getCantidad_ejemplares()+ " disponibles"+ " ");
            System.out.println("y se prestaron " + libro.getCantidad_prestados()+ " ");
            System.out.println("-----------------------");
        }
    }

}

