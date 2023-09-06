package Parte_Juego;

public class Palabra {
    private String palabra;
    private Diccionario diccionario = new Diccionario();


    public Palabra(String pala){
        palabra = pala;
    }
    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public boolean Consultar(){
        return diccionario.existe(palabra);
    }


    public int Verificar_letras(){
        int puntos_extras = 0;
        for (char L:  palabra.toCharArray()){
            if ((L >= 119 && L <= 122) || (L == 113 )||(L == 107)){
                puntos_extras = puntos_extras + 1;
            }
        }
        return puntos_extras;
    }


}
