package Parte_Juego;

public class Diccionario {
    String[] Palabra = new String[25];


    public Diccionario() {
       Palabra[0] = "Viaje";
       Palabra[1] = "Amigos";
       Palabra[2] = "Teclado";
       Palabra[3] = "Mouse";
       Palabra[4] = "Microprocesador";
       Palabra[5] = "Telefono";
       Palabra[6] = "Cuadernillo";
       Palabra[7] = "Gabinete";
       Palabra[8] = "Kilo";
       Palabra[9] = "Zorro";
       Palabra[10] = "Boxeador";
       Palabra[11] = "Kiwi";
       Palabra[12] = "Yoyo";
       Palabra[13] = "Mayonesa";
       Palabra[14] = "Queso";
       Palabra[15] = "Auto";
       Palabra[16] = "Casa";
       Palabra[17] = "Perro";
       Palabra[18] = "Gato";
       Palabra[19] = "Quiero";
       Palabra[20] = "Quierofano";
       Palabra[21] = "Monitor";
       Palabra[22] = "Herencia";
       Palabra[23] = "Objeto";
       Palabra[24] = "Pato";

    }

    public boolean existe(String palabra){
         for (int i = 0; i < Palabra.length; i++){
             if (Palabra[i].equals(palabra)){
                 return true;
             }
         }
         return false;
    }

}


