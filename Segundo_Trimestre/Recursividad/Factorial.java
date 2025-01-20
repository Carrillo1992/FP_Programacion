package Segundo_Trimestre.Recursividad;

public class Factorial {
    public static void main(String[] args) {
        int numero = 5;
        // int i = 5;
        // i*=i-1;
        // System.out.println(i);
        System.out.println("El factorial de "+numero+" es: "+ factorial(numero));
    }
    public static int factorial( int n){
        if( n==0 || n == 1) return 1;
        return n*factorial(n-1);
    }
}


