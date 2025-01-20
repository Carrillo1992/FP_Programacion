package Segundo_Trimestre.Recursividad;

public class SumaDigitos {
    public static void main(String[] args) {
        System.out.println("la suma de los numero 123 es: "+sumaDigitos(123));
    }
    public static int sumaDigitos(int n){
        if (n==0)return 0;
        return ((n%10) + sumaDigitos(n/10));
    }
}
