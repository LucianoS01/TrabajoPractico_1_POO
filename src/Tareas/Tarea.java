package Tareas;
import java.time.LocalDate;

public class Tarea {
    private String Titulo;
    private String Estado ;
    private String Descripcion;
    private String Prioridad;
    private LocalDate Fecha_Limite ;
    //Ejercicio 10
    private LocalDate Fecha_Recordatorio;

    private String Colaborador;
    private LocalDate Fecha_Finalizacion;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(String prioridad) {
        Prioridad = prioridad;
    }

    public LocalDate getFecha_Limite() {
        return Fecha_Limite;
    }

    public void setFecha_Limite(LocalDate fecha_Limite) {
        this.Fecha_Limite = fecha_Limite;
    }


    public LocalDate getFecha_Recordatorio() {
        return Fecha_Recordatorio;
    }

    public void setFecha_Recordatorio(LocalDate fecha_Recordatorio) {
        Fecha_Recordatorio = fecha_Recordatorio;
    }

    public String getColaborador() {
        return Colaborador;
    }

    public void setColaborador(String colaborador) {
        Colaborador = colaborador;
    }

    public LocalDate getFecha_Finalizacion() {
        return Fecha_Finalizacion;
    }

    public void setFecha_Finalizacion(LocalDate fecha_Finalizacion) {
        Fecha_Finalizacion = fecha_Finalizacion;
    }
}


