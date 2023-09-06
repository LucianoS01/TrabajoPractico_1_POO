package Fecha;

import java.time.LocalDate;

public class Fecha {
    private LocalDate fecha;

    public Fecha(int anio, int mes, int dia) {
        this.fecha = LocalDate.of(anio, mes, dia);
    }

    public String devolver_fecha( int tipo_fomato){
        String Devolver = "";
        if (tipo_fomato == 1){
            Devolver = fecha.getDayOfMonth() + "-" + fecha.getMonthValue() + "-" + fecha.getYear();


        }else if (tipo_fomato == 2){
            Devolver = fecha.getMonthValue() + "-" + fecha.getDayOfMonth() + "-" + fecha.getYear();
        }
        else {
            Devolver = "Errro: Los formatos tiene que ser 1 o 2 ";
        }
        return Devolver;
    }

    public boolean fechaMayorrAotra(LocalDate fecha1, LocalDate fecha2){
        if (fecha1.isAfter(fecha2)){
            System.out.println("La fecha ingresada 1 : " + fecha1 + " Es mayor a la fecha : "+ fecha2);
            return true;
        }
        else{
            System.out.println("La fecha ingresada 2 : " + fecha2 + " Es mayor a la fecha : "+ fecha1);
            return false;
        }


    }
    public boolean fechaMenorAotra(LocalDate fecha1, LocalDate fecha2){
        if (fecha1.isBefore(fecha2)){
            System.out.println("La fecha ingresada 1 : " + fecha1 + " Es menor a la fecha : "+ fecha2);
            return true;
        }
        else{
            System.out.println("La fecha ingresada  2 : " + fecha2 + " Es menor a la fecha : "+ fecha1);
            return false;
        }

    }

    public void Se_encuntra_enMedio(LocalDate fecha1, LocalDate fecha2, LocalDate fecha_en_medio) {
        if ((fechaMayorrAotra(fecha_en_medio, fecha1) && fechaMenorAotra(fecha_en_medio, fecha2)) ||
                (fechaMayorrAotra(fecha1, fecha_en_medio) && fechaMenorAotra(fecha2, fecha_en_medio))) {
            System.out.println("La fecha " + fecha_en_medio + " se encuentra en medio de las fechas " + fecha1 + " y " + fecha2);
        } else {
            System.out.println("No se encuentra en el medio de las 2 fechas");
        }
    }

    public LocalDate getFecha() {
        return fecha;
    }
}

