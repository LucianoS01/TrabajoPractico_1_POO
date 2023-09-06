package Tareas;

import java.time.LocalDate;

public class Lista_De_Tareas {
    private Tarea[] lista_tareas;
    private int cantidadTareas;

    public Lista_De_Tareas(int capacidad) {
        lista_tareas = new Tarea[capacidad];
        cantidadTareas = 0;
    }

    public void agregar_tarea ( String Titulo, String Descripcion, String Prioridad, String Estado, String Fecha, String Fecha_Recordatorio){
        Tarea tarea = new Tarea() ;
        tarea.setTitulo(Titulo);
        tarea.setEstado(Estado);
        tarea.setDescripcion(Descripcion);
        LocalDate fecha = LocalDate.parse(Fecha);
        LocalDate fecha_recor = LocalDate.parse(Fecha_Recordatorio);
        tarea.setFecha_Limite(fecha);
        tarea.setFecha_Recordatorio(fecha_recor);
        tarea.setPrioridad(Prioridad);
        tarea.setColaborador("");
         lista_tareas[cantidadTareas] = tarea;
        cantidadTareas = cantidadTareas + 1;
    }

    //Modificamos la descripcion indicando que elemento de la lista moficiamos.
    public boolean modificar_descripcion(String nueva_descripcion, int elemento_lista){
          elemento_lista = elemento_lista - 1;
          if (elemento_lista > cantidadTareas || elemento_lista < 0) {
                return false;
          }
          else{
              lista_tareas[elemento_lista].setDescripcion(nueva_descripcion);
              return true;
          }

    }

    public boolean modificar_prioridad(String nueva_prioridad, int elemento_lista){
        elemento_lista = elemento_lista - 1;
        if (elemento_lista > cantidadTareas || elemento_lista < 0) {
            return false;
        }
        else{
            lista_tareas[elemento_lista].setPrioridad(nueva_prioridad);
            return true;
        }

    }

    //Funcion para ver si la tarea esta vencida y su estado es imcompleta.
    public boolean es_vencida(int elemento_lista ){
        elemento_lista = elemento_lista - 1;
        if (elemento_lista > cantidadTareas || elemento_lista < 0) {
            return false;
        }
        else{
            if (LocalDate.now().isAfter(lista_tareas[elemento_lista].getFecha_Limite())) {
                System.out.println("La tarea "+ (elemento_lista + 1) + " con titulo : "+ lista_tareas[elemento_lista].getTitulo()  +" Esta Vencida");
                return true;
            }
            else {
                System.out.println("La tarea "+ (elemento_lista + 1) + " con titulo : "+ lista_tareas[elemento_lista].getTitulo() + "  No se ha vencido");
            }
        }

        return false;
    }

    public void es_Completa(int elemento_lista ){
        elemento_lista = elemento_lista - 1;
        if (elemento_lista > cantidadTareas || elemento_lista < 0) {
            return ;
        }
        else{
            if (lista_tareas[elemento_lista].getEstado().equals("COMPLETA")) {
                System.out.println("La lista "+ (elemento_lista + 1) +  " Esta COMPLETA");
            }
            else if (lista_tareas[elemento_lista].getEstado().equals("INCOMPLETA")) {
                System.out.println("La lista "+ (elemento_lista + 1) + "  Esta INCOMPLETA");
            }
        }


    }

    public void ponerTareacomoRealizada(int elemento_lista, String Nombre_colaborador, String Fecha_finalizacion){
        elemento_lista = elemento_lista - 1;
        if (elemento_lista > cantidadTareas || elemento_lista < 0) {
            System.out.println("ERRO numero fuera de rango");
            return ;
        }else if(es_vencida(elemento_lista + 1)){
            System.out.println("No se Puede poner Tarea como Completa/ Realizada porque esta tarea esta VENCIDA");
            return ;
        }
        else{
            lista_tareas[elemento_lista].setEstado("COMPLETA");
            lista_tareas[elemento_lista].setColaborador(Nombre_colaborador);
            LocalDate fecha_finalizacion =LocalDate.parse(Fecha_finalizacion);
            lista_tareas[elemento_lista].setFecha_Finalizacion(fecha_finalizacion);
            System.out.println("La lista "+ (elemento_lista + 1) + " Se ha marcado como COMPLETA/REALIZADA. Se registro el colaboador, y su fecha de Finalizacion");
        }

    }

    public void darAviso(){

        for (int i = 0; i < cantidadTareas; i++) {
            Tarea tarea = lista_tareas[i];
            if (tarea.getFecha_Recordatorio() != null && tarea.getEstado().equals("INCOMPLETA")) {
                if (tarea.getFecha_Recordatorio().isAfter(LocalDate.now()) || tarea.getFecha_Recordatorio().isEqual(LocalDate.now())){
                    tarea.setPrioridad("Alta");
                    System.out.println("Tarea " + (i + 1) + ":");
                    System.out.println("Descipcion " + tarea.getDescripcion());
                    System.out.println("AVISO: POR VENCER!!!: " + tarea.getFecha_Limite());
                    System.out.println("SE SUBIO LA PRIORIDAD A LA MAS ALTA: " + tarea.getPrioridad());
                    System.out.println("Fecha del recordatorio: " + tarea.getFecha_Recordatorio());
                    System.out.println("----------------------");
                }
            }
        }

    }

    public void Lista_De_Tareas_Ordenadas_No_vencidas(){
        Tarea[] tareas = new Tarea[cantidadTareas];
        Tarea[] tareas2 = new Tarea[cantidadTareas];
        int cant= 0 ;
        int cant2= 0 ;

        for (int i = 0; i < cantidadTareas; i++){
            Tarea tarea = lista_tareas[i];
            if (!LocalDate.now().isAfter(lista_tareas[i].getFecha_Limite())){
                System.out.println("Tarea No VENCIDAS " + (i + 1) + ":");
                System.out.println(tarea.getTitulo());
                System.out.println("Descipcion" + tarea.getDescripcion());
                System.out.println("AVISO: POR VENCER EN: " + tarea.getFecha_Limite());
                if(tarea.getPrioridad().equals("Alta")){
                    tareas[cant] = tarea;
                    cant = cant + 1;

                }
                else if (tarea.getPrioridad().equals("Baja")){
                    tareas2[cant2] = tarea;
                    cant2 = cant2 + 1;
                }
            }
        }
        //Acatenemos 2 array uno de Prioridad Alta y otro de piroridad Baja ahora llamos a una funcion de burbujeo
        System.out.println("-------------------------------------------");
        tareas = ordenamiento_por_fecha(tareas, cant);
        System.out.println("Tareas No VENCIDAS Prioridad Alta: " +  ":");
        for (int i = 0; i < cant; i++) {
            System.out.println(" - Titulo :" + tareas[i].getTitulo());
            System.out.println("  Descipcion " + tareas[i].getDescripcion());
            System.out.println("  Fecha Limite " + tareas[i].getFecha_Limite());
            System.out.println("  Fecha Recordatorio " + tareas[i].getFecha_Recordatorio());
            System.out.println("  Prioridad " + tareas[i].getPrioridad());
        }
        tareas2 = ordenamiento_por_fecha(tareas2, cant2);
        System.out.println("Tareas No VENCIDAS Prioridad Baja: " +  ":");
        for (int i = 0; i < cant2; i++) {
            System.out.println(" - Titulo :" + tareas2[i].getTitulo());
            System.out.println("  Descipcion " + tareas2[i].getDescripcion());
            System.out.println("  Fecha Limite " + tareas2[i].getFecha_Limite());
            System.out.println("  Fecha Recordatorio " + tareas2[i].getFecha_Recordatorio());
            System.out.println("  Prioridad " + tareas2[i].getPrioridad());
        }

        System.out.println("-------------------------------------------");

    }

    private Tarea[] ordenamiento_por_fecha(Tarea[] tareas, int cantidad){
        boolean intercambio = true;
        int i;
        Tarea taux;
        while(intercambio){
            intercambio= false;
            i = 0;
            while ((i+1) < cantidad){
                if (tareas[i].getFecha_Limite().isAfter(tareas[i+1].getFecha_Limite())){
                    taux = tareas[i];
                    tareas[i] = tareas[i+1];
                    tareas[i+1] = taux;
                    intercambio= true;
                }
                i = i + 1;
            }

        }
        return tareas;
    }



    public void Mostrar_Tareas_Realizadas_Colaborador(String Colaborador){
        boolean existe = false;
        System.out.println("Las tareas que Finalizo "+ Colaborador + " Son: ");
        for (int i = 0; i < cantidadTareas; i++){
            Tarea tarea = lista_tareas[i];
            if (tarea.getColaborador().equals(Colaborador)){
                System.out.println("Titulo: " + tarea.getTitulo());
                System.out.println("Descripción: " + tarea.getDescripcion());
                System.out.println("Estado: " + tarea.getEstado());
                System.out.println("Fecha Límite: " + tarea.getFecha_Limite());
                System.out.println("Colabordor: " + tarea.getColaborador());
                System.out.println("Fecha de Finalizacion: " + tarea.getFecha_Finalizacion());
                existe = true;
            }
        }

        if (!existe){
            System.out.println("No se encontro' "+ Colaborador+ ". No finalizo ninguna tarea o el mismo no existe.!");
        }

    }

    public void mostrar_lista_tareas() {
        System.out.println("Lista de tareas:");

        for (int i = 0; i < cantidadTareas; i++) {
            Tarea tarea = lista_tareas[i];
            System.out.println("Tarea " + (i + 1) + ":");
            System.out.println("Titulo: " + tarea.getTitulo());
            System.out.println("Descripción: " + tarea.getDescripcion());
            System.out.println("Prioridad: " + tarea.getPrioridad());
            System.out.println("Estado: " + tarea.getEstado());
            System.out.println("Fecha Límite: " + tarea.getFecha_Limite());
            System.out.println("Fecha Recordatorio: " + tarea.getFecha_Recordatorio());
            System.out.println("----------------------");
        }
    }







}
