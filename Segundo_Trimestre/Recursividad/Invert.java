package Segundo_Trimestre.Recursividad;

public class Invert {
    public static void main(String[] args) {
        String cadena = "recursivo";
        System.out.println("La palabra "+cadena+" invertida es: "+ invertida(cadena));
    }

    public static String invertida(String cadena){
        if (cadena.isEmpty()) {
            return cadena;
        }
        return invertida(cadena.substring(1)) + cadena.charAt(0);
    }
}
