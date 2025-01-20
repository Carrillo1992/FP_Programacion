package Segundo_Trimestre.Recursividad;

public class N_inverso {
    public static void main(String[] args) {
        int numero = 5;
        inverso(numero);
    }
    public static void inverso (int numero){
        if(numero >= 1 ){
            System.out.print(numero);
            inverso(numero-1);
        }
    }
}