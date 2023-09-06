package Parte_Juego;

public class Jugador {
    private String Id_jugador;
    private Palabra [] palabrita;
    private int Cantidad_palabras;
    private int Puntajes;

    public Jugador(String id_jugador) {
        Id_jugador = id_jugador;
        palabrita = new  Palabra[20];
        Cantidad_palabras = 0;
        Puntajes = 0;
    }

    public void Calcular_puntos(Palabra palabra){
        this.Puntajes = this.Puntajes + 1;
    }

    public boolean Agregar_Palabra_Valida(String nueva_palabra){
        Palabra nueva_pa  = new Palabra(nueva_palabra);
        if (!nueva_pa.Consultar()){
            System.out.println("La palabra " + nueva_palabra + " No es una palabra Valida");
            return false;
        }
        else {
            palabrita[Cantidad_palabras] = nueva_pa;
            Cantidad_palabras = Cantidad_palabras + 1;
            Calcular_puntos(nueva_pa);
            this.Puntajes =  this.Puntajes + nueva_pa.Verificar_letras();
            System.out.println("La palabra " + nueva_palabra + " Se agrego correctamente");
            System.out.println("Los puntos hasta ahora son: "+ this.Puntajes );
            return true;
        }

    }

    public void PuntajesValorTotal(Jugador j1, Jugador j2){
        if (j1.Puntajes > j2.Puntajes){
            System.out.println("EL JUGADOR : " + j1.getId_jugador() + " ES EL GANADOR!!!!");
            System.out.println("El jugador : " + j1.getId_jugador() + " Optuvo  " +j1.getPuntajes()+" Puntos");
            System.out.println("El jugador : " + j2.getId_jugador() + " Optuvo  " +j2.getPuntajes()+" Puntos");

        }else if (j2.Puntajes > j1.Puntajes){
            System.out.println("EL JUGADOR : " + j2.getId_jugador() + " ES EL GANADOR!!!!");
            System.out.println("El jugador : " + j1.getId_jugador()+ " Optuvo  " +j1.getPuntajes()+" Puntos");
            System.out.println("El jugador : " + j2.getId_jugador()+ " Optuvo  " +j2.getPuntajes()+" Puntos");
        }
        else{
            System.out.println("HUBO UN EMPATE !!!!!");
            System.out.println("El jugador : " + j1.getId_jugador()+ " Optuvo  " +j1.getPuntajes()+" Puntos");
            System.out.println("El jugador : " + j2.getId_jugador()+ " Optuvo  " +j2.getPuntajes()+" Puntos");
        }


    }

    public int getPuntajes() {
        return Puntajes;
    }

    public String getId_jugador() {
        return Id_jugador;
    }
    public void setPuntajes(int puntajes) {
        Puntajes = puntajes;
    }
}


