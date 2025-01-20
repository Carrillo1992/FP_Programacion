package Segundo_Trimestre.Recursividad;

public class Sumatoria {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println("La suma del 1 al "+numero+" es: "+ suma(numero));
    }

    public static int suma (int numero){
        if (numero <= 1) return numero;
        return numero + suma(numero -1);
    }
}
