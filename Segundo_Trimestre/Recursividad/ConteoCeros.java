package Segundo_Trimestre.Recursividad;

public class ConteoCeros {
    public static void main(String[] args) {
        System.out.println("en el numero 102030 hay "+ sumaCeros(102030)+" ceros");
    }
    public static int sumaCeros(int n){
        if (n < 10) return (n==0)? 1:0;
        return ((n%10==0)? 1:0)+sumaCeros(n/10);
    }
}
