package Segundo_Trimestre.Recursividad;

public class Fibonacci {
    public static void main(String[] args) {
        int numero = 14;
        System.out.println("el numero de fibonacci("+numero+") es: "+fibonacci(numero));
    }

    public static int fibonacci(int numero){
        if (numero == 0 || numero ==1){return (numero);}
        return (fibonacci(numero-1) + fibonacci(numero-2));
    }
}
