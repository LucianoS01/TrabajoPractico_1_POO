package Password;
import Tareas.Tarea;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Lista_de_Password {
    private Password[] lista_password;
    private int cantidad_De_password;

    public Lista_de_Password(int cantidad) {
        lista_password = new Password[cantidad];
        cantidad_De_password = 0;
    }

    public void generar_contraseña(int longitud_de_contraseña){
        Password contra = new Password();
        if (longitud_de_contraseña < 8 ){
            longitud_de_contraseña = 8;
        }
        String Numeros = "0123456789";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        contra.setLongitud(longitud_de_contraseña);
        contra.setFuerte(false);
        Random random = new Random();
        StringBuilder Nueva_Contraseña = new StringBuilder();
        String convinaciones = mayusculas + minusculas + Numeros;

        for (int i = 0; i < longitud_de_contraseña; i++) {
            char letra = convinaciones.charAt(random.nextInt(convinaciones.length()));
            Nueva_Contraseña.append(letra);
        }

        contra.setContraseña(Nueva_Contraseña.toString());
        lista_password[cantidad_De_password] = contra;
        cantidad_De_password = cantidad_De_password + 1;
        Calcular_Fortaleza();

    }



    public  void convertir_fuerte(int contraseña_debil){

        contraseña_debil = contraseña_debil - 1;
        if (contraseña_debil > cantidad_De_password){
            System.out.println("el numero de clave esta fuera de rango. Ingrese otro clave que este en el rango .");
            return;
        }
        Password contra = lista_password[contraseña_debil];
        while (!contra.getFuerte()){
            String Numeros = "0123456789";
            String minusculas = "abcdefghijklmnopqrstuvwxyz";
            String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            int longitud = contra.getLongitud();
            //contra.setLongitud(contraseña_debil);
            contra.setFuerte(false);
            Random random = new Random();
            StringBuilder Nueva_Contraseña = new StringBuilder();
            String convinaciones = mayusculas + minusculas + Numeros;

            for (int i = 0; i < longitud; i++) {
                char letra = convinaciones.charAt(random.nextInt(convinaciones.length()));
                Nueva_Contraseña.append(letra);
            }

            contra.setContraseña(Nueva_Contraseña.toString());
            contra = lista_password[contraseña_debil];
            Calcular_Fortaleza();
        }
        System.out.println("Se conviertio la contraseña numero "+ (contraseña_debil +1) + "  A fuerte");
    }


    public void Calcular_Fortaleza() {
        for (int i = 0; i < cantidad_De_password; i++) {
            int contador_numero = 0;
            int contador_Mayusculas = 0;
            int contador_minusculas = 0;
            Password contra = lista_password[i];

            for (char c : contra.getContraseña().toCharArray()) {
                if ((c >= 65) && (c  <= 90)){
                    contador_Mayusculas++;
                }
                else if ((c >= 97) && (c  <= 122)){
                    contador_minusculas++;
                } else if (Character.isDigit(c)) {
                    contador_numero++;
                }
            }

            if (contador_Mayusculas > 2 && contador_minusculas > 1 && contador_numero >= 2) {
                contra.setFuerte(true);
             //   return true;
            }

          //  return false;
        }
    }
    public void mostrar_lista_contraseñas() {
        System.out.println("Lista de Contraseñas:");

        for (int i = 0; i < cantidad_De_password; i++) {
            Password contra = lista_password[i];
            System.out.println("Contraseñas " + (i + 1) + ":");
            if ((contra.getFuerte())){
                System.out.println("<: " + contra.getContraseña()+ " >  - Fuerte");
            }
            else {
                System.out.println("<: " + contra.getContraseña()+ " > - Débil ");
            }
            System.out.println("----------------------");
        }
    }

}
