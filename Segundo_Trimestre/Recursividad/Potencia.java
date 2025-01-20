package Segundo_Trimestre.Recursividad;

public class Potencia {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(a+"^"+b+" es: "+ potencia(a,b));
    }
    
    public static int potencia (int a , int b){
        if (b >1){
            return a * potencia(a ,b-1);
        }
        return a;
    }
}
