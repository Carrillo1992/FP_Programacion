package Segundo_Trimestre.Actividad5;

import java.util.Scanner;

public class CombinacionKEnK {
    public static void main(String[] args) {
        Scanner escaner =  new Scanner(System.in);
        int k = 0;
        int n = 0;
        // Solicitamos al usuario el valor de n
        while (true) {
            System.out.println("Ingrese el tamaño del conjunto (n):");
            if (escaner.hasNextInt()) {
                n = escaner.nextInt();
                break;
            } else {
                System.out.println("Ingresa un valor valido");
                escaner.next(); // limpiamos la entrada invalida
            }
        }
        // Solicitamos al usuario el valor de K
        while (true) {
            System.out.println("Ingrese el tamaño de los subconjuntos (K):");
            if (escaner.hasNextInt()) {
                k = escaner.nextInt();
                if(k < n){
                    break;
                }else{
                    System.out.println("El valor de K  no puede ser mayor a n");
                }
                
            } else {
                System.out.println("Ingresa un valor valido");
                escaner.next(); // limpiamos la entrada invalida
            }
        }       
        System.out.println("El numero de elementos a combinar ("+k+") en el conjunto de tamaño ("+n+") tiene un numero de combinaciones = "+combinaciones(n,k));
        escaner.close();
        }
        
        public static int combinaciones(int n, int k){
            if (k==0 || k==n){
                return 1;
            }
            return (combinaciones(n-1, k-1) + combinaciones(n-1,k));
        }
}
