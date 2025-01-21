package Segundo_Trimestre.Actividad5;

import java.util.Arrays;

public class Estadistica {
    public static void main(String[] args) {
        System.out.println("La media de {1, 2 , 3} = "+ calcular(new int[]{1,2,3}));
        System.out.println("La moda de {1.5 , 2.8 , 1.5 , 2.8 , 3.5} = "+ Arrays.toString(calcular(new double[]{1.5,2.8,1.5,2.8,3.5})));
        System.out.println("La mediana de {'Python' , 'C' , 'Java' , 'C++' , 'R' , 'JavaScript'} = "+ calcular(new String[]{"Python" , "C","Java" , "C++" , "R","Javascript"}));
    }
    
    // Calculo de la media
    public static int calcular(int[] media){
        int resultado = 0;
        // Sumamos todos los numeros de la lista 
        for (int numero:media){
            resultado+=numero;
        }
        // Devolvemos la suma entre la longitud
        return resultado/media.length;
    }
    // Calculo de la moda
    public static double [] calcular(double[] moda) {
        double[] resultado = new double[1];
        int cantidadModas = 0;
        int maxFrecuencia = 0;

        for (int i = 0; i < moda.length; i++) {
            int frecuencia = 0;
            // Contamos la frecuencia del numero 
            for (int j = 0; j < moda.length; j++) {
                if (moda[j] == moda[i]) {
                    frecuencia++;
                }
            }
            // Evaluamos la frecuencia
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                resultado = new double[1];
                resultado[0] = moda[i];
                cantidadModas = 1;
            } else if (frecuencia == maxFrecuencia) { // Si las frecuencias son iguales verificamos que no esta repetida en resultado
                boolean existe = false;
                for (int k = 0; k < cantidadModas; k++) {
                    if (resultado[k] == moda[i]) {
                        existe = true;
                        break;
                    }
                }
                // Si no esta repetida la añadimos a la lista 
                if (!existe) {
                    double[] nuevasModas = Arrays.copyOf(resultado, cantidadModas + 1);
                    nuevasModas[cantidadModas] = moda[i];
                    resultado = nuevasModas;
                    cantidadModas++;
                }
            }
        }
        //Devolvemos la lista con la moda
        return resultado;
    }
    //Calculo de la mediana
    public static String calcular(String [] mediana){
        // Verificamos si la longitud es par
        if(mediana.length %2 == 0){
            // Si es par devolvemos los dos valores centrales
            return mediana[(mediana.length/2)-1]+", "+mediana[(mediana.length/2)];
        }
        // Si es impar devolvemos el valor central
        return mediana[mediana.length/2];
    }
}
