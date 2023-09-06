import Calculadora.*;
import Fecha.Fecha;
import Parte_Juego.Jugador;
import Password.*;
import Pila.Pila;
import Tareas.*;
import Bibioteca.*;
import java.util.Scanner;
import java.time.LocalDate;
import Lista.*;
import Cola.*;

public class Main {
    public static void main(String[] args) {












        /*

        */




        /*

        /*

        /*

        /*




        /*

        */







        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("---- Menú Principal ----");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5 - 10 - 12 - 13");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("9. Ejercicio 9");
            System.out.println("11. Ejercicio 11");
            System.out.println("14. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea pendiente

            switch (opcion) {
                case 1:
                    //---------------------------------------------------------------------------------------
                    //       EJERCICIO 1
                          ListaEnlazadaSimple lista = new ListaEnlazadaSimple();

                            System.out.println(lista.Es_Vacia());
                           lista.agregar("5");
                            lista.agregar("10");
                            lista.agregar("15");

                           lista.agregar("20");
                           System.out.println(lista);
                            lista.insertar("101",2);
                            System.out.println(lista);
                          lista.eliminar_elemento("5");
                           lista.eliminar_elemento("10");
                           lista.eliminar_elemento("20");
                        lista.eliminar_elemento("15");


                         System.out.println(lista.recuper_elemento(1));
                          System.out.println(lista);
                         System.out.println(lista.Es_Vacia());
                          System.out.println("La longitud es : " + lista.longitud());

                    //---------------------------------------------------------------------------------------

                    break;
                case 2:
                    //       EJERCICIO 2
                    ListaEnlazadaDoble ListaD = new ListaEnlazadaDoble();

                    ListaD.agregar("30");
                    ListaD.agregar("10");
                    ListaD.agregar("55");
                    System.out.println(ListaD.esVacia());
                    ListaD.agregar("20");
                    System.out.println(ListaD);
                    ListaD.insertar("101",2);
                    System.out.println(ListaD);

                    ListaD.eliminar_elemento("30");
                    ListaD.eliminar_elemento("20");
                    System.out.println("Eliminoe el 30 y 20");
                    System.out.println(ListaD);


                    break;
                case 3:
                    //       EJERCICIO 3
                    Pila pila = new Pila();
                    pila.Apilar(4);
                    pila.Apilar(8);
                    pila.Apilar(10);
                    pila.Mostramos_pila();

                    break;
                case 4:
                    //       EJERCICIO 4
                    Cola c = new Cola();
                    c.encolar(4);
                    c.encolar(52);
                    c.encolar(28);
                    c.mostrar_la_cola();
                    c.desencolar();
                    c.mostrar_la_cola();

                    break;
                case 5:
                    //---------------------------------------------------------------------------------------
                    //       EJERCICIO 5 - 10 - 12 - 13

                    Lista_De_Tareas listaT = new Lista_De_Tareas(10);
                    listaT.agregar_tarea("Titulo1", "Ir al supermercado mañana", "Alta", "INCOMPLETA", "2023-12-23","2023-09-05" );
                    listaT.agregar_tarea("Titulo2","Consultar repuesto del auto", "Baja", "INCOMPLETA", "2023-10-04", "2023-09-04");
                    listaT.agregar_tarea("Titulo3","Ir al cine a ver la nueva película de Marve", "Alta", "INCOMPLETA", "2023-05-07", "2023-09-06");
                    listaT.agregar_tarea("Titulo4","Hacer cosas de universidad", "Baja", "INCOMPLETA", "2023-11-04", "2023-09-04");
                    listaT.agregar_tarea("Titulo5","Dar clases en la esceula", "Alta", "INCOMPLETA", "2023-12-02", "2023-09-06");
                    listaT.agregar_tarea("Titulo6","Juntarme con Aye", "Baja", "INCOMPLETA", "2023-12-03", "2023-09-06");

                    //Mostramos Por pantalla  la lista de Tareas:
                    listaT.mostrar_lista_tareas();

                    //Modificamos la descripcion, indicando cual es la descropcion y que tarias vamos a moficiar:
                    if (listaT.modificar_descripcion("ir al GYM", 1)){
                        System.out.println("Se Cargo la descripcion correctamente");
                    }
                    else {
                        System.out.println("No se ha Cargo la descripcion correctamente");
                    }


                    //Mostramos la lista de tareas.
                    listaT.mostrar_lista_tareas();

                    //Preguntamos si la tarea esta vencida.
                    listaT.es_vencida(2);

                    //Preguntamos si la tarea esta COMPLETA.
                    listaT.es_Completa(2);


                    //Damos AVISO si la Fecha de Recordatorio es mayor o igual al fecha actual dar un AVISO y Poner como Prioridad ALTA..
                    listaT.darAviso();

                    // Muestra lista de Tareas NO VENCIDAS Ordenadas por Prioridad y Fecha.
                    listaT.Lista_De_Tareas_Ordenadas_No_vencidas();

                    //Muestra Lista de Colaborares que Finalizaron Tareas.
                    listaT.Mostrar_Tareas_Realizadas_Colaborador("Luciano");

                    //Le decimos que tarea queres poner en COMPLETA, Indicamos el nombre del Colaborador y su Fecha de Finalizacion.
                    listaT.ponerTareacomoRealizada(3, "Luciano", "2023-05-06");
                    //---------------------------------------------------------------------------------------
                    break;
                case 6:
                    //---------------------------------------------------------------------------------------
                    //       EJERCICIO 6

                    Bibliotaca bibliote_libros = new Bibliotaca();
                    bibliote_libros.agregar_libro("Dr. Jekyll y Mr. Hyde", "Robert Louis Stevenson", "286-1234567899", 320, 60, 1);
                    bibliote_libros.agregar_libro("Harry Potter y la Piedra Filosofal", "J.K. Rowling", "287-9876543210", 240, 100, 25);

                    bibliote_libros.mostrar_lista_libros();
                    bibliote_libros.quienTieneMasPaginas("Dr. Jekyll y Mr. Hyde","Harry Potter y la Piedra Filosofal" );
                    bibliote_libros.calcularTotaLibrosPrestados();
                    bibliote_libros.prestar_ejemplar("Dr. Jekyll y Mr. Hyde", 10);
                    bibliote_libros.prestar_ejemplar("Harry Potter y la Piedra Filosofal", 1);
                    bibliote_libros.mostrar_lista_libros();
                    //---------------------------------------------------------------------------------------
                    break;
                case 7:
                    //---------------------------------------------------------------------------------------
                    //       EJERCICIO 7
                    Calculadora calculadora = new Calculadora(1,2,4);
                    calculadora.racices();
                    calculadora.calcularValorX(2);
                    //---------------------------------------------------------------------------------------

                    break;
                case 8:
                    //---------------------------------------------------------------------------------------
                    //       EJERCICIO 8

                    Lista_de_Password Contraseñas = new Lista_de_Password(100);
                    Contraseñas.generar_contraseña(10);
                    Contraseñas.generar_contraseña(10);
                    Contraseñas.generar_contraseña(10);
                    Contraseñas.mostrar_lista_contraseñas();
                    //Elegimos hacer fuerte la clave numero 3
                    Contraseñas.convertir_fuerte(3);
                    Contraseñas.mostrar_lista_contraseñas();
                    System.out.println("---------------------------------------------------------------------------------------");

                    break;
                case 9:
                    //---------------------------------------------------------------------------------------
                    //       EJERCICIO 9

                    Fecha fecha = new Fecha(2023, 9, 02);
                    System.out.println("FORMATO 1: "+fecha.devolver_fecha( 1));
                    System.out.println("FORMATO 2: "+fecha.devolver_fecha(2));
                    LocalDate fecha2 = LocalDate.of(2023, 9, 06);
                    LocalDate fecha1 = LocalDate.of(2023, 9, 01);
                    LocalDate fechaMedio = LocalDate.of(2023, 9, 05);
                    fecha.fechaMayorrAotra(fecha1, fecha2);
                    fecha.fechaMenorAotra(fecha1,fecha2);
                    fecha.Se_encuntra_enMedio(fecha1,fecha2, fechaMedio);
                    //---------------------------------------------------------------------------------------
                    break;
                case 11:
                    //---------------------------------------------------------------------------------------
                    //       EJERCICIO 11


                    //Cramos los Jugadores
                    Jugador J1 = new Jugador("Luciano");
                    Jugador J2 = new Jugador("Agustin");

                    //Le asignamos una palabra
                    J1.Agregar_Palabra_Valida("Viaje");
                    J2.Agregar_Palabra_Valida("Kiwi");

                    //Punteje final y Resultado del ganardo o empate.
                    J1.PuntajesValorTotal(J1,J2);


                    //---------------------------------------------------------------------------------------

                    break;
                case 14:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }
        }
    }




}