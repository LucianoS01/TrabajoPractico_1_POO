package Calculadora;
import static java.lang.Math.sqrt;
public class Calculadora {
    private int a;
    private int b;
    private int c;
    private String ecuacion;

    public Calculadora(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.ecuacion = "(" + a + ")x^2(" + b + ")x+(" + c + ")";
        System.out.println("La ecuacion es :   " + this.ecuacion);
    }


    public void racices(){
        int determinante  = (b*b) - (4*a*c);
        if (determinante == 0){
            double raiz = (double) (-b)/(2*a);
            System.out.println("La raiz de la ecuacion es " + raiz);
        }
        else if (determinante > 0 ){
            double raiz  = (double) (-b + sqrt(determinante)) / (2*a);
            double raiz1 = (double) (-b - sqrt(determinante)) /(2*a);
            System.out.println("La raiz de la ecuacion son  " + raiz + " y "+ raiz1);
        }
        else {
            System.out.println("La raiz son imaginarias");
        }
    }


    public void calcularValorX(int x) {
        int valor = 0;
        valor =  a * x * x + b * x + c;
        System.out.println("El valor de la ecuacion de X es: "+ valor);
    }

}
