import java.util.Scanner;
import java.util.Random;

public class Actividad_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int fila;
        int columna;
        int intentos = 1;
        int barcos = 3;
        final String RESET = "\u001B[0m";
        final String LETRA_AZUL = "\u001B[34m";
        final String LETRA_ROJA = "\u001B[31m";
        final String LETRA_VERDE = "\u001B[32m";
        final String LETRA_AMARILLA = "\u001B[33m";
        // Tablero
        String[][] tablero = new String[5][5];

        // Rellenamos con 0
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = "0";
            }
        }
        // Pocicion de los barcos
        for (int i = 0; i < 3; i++) {
            tablero[random.nextInt(tablero.length)][random.nextInt(tablero.length)] = "1";
        }
        // Menu
        System.out.println("Bienvenidos a Batalla Naval");
        System.out.println("Intenta hundir los 3 barcos ocultos en el tablero");
        System.out.println("Tienes 10 intentos para encontrarlos");
        System.out.println("¡Buena suerte capitán!");
        while (intentos <= 10) {
            System.out.println("-----------------------------------");
            System.out.println("Turno: " + intentos);
            while (true) {
                System.out.println("Fila:\nIngresa un número entre 0 y 4");
                if (entrada.hasNextInt()) {
                    fila = entrada.nextInt();
                    break;
                } else {
                    System.out.println("Ingresa un valor valido");
                    entrada.next(); // limpiamos la entrada invalida
                }
            }
            while (true) {
                System.out.println("Columna:\nIngresa un número entre 0 y 4");
                if (entrada.hasNextInt()) {
                    columna = entrada.nextInt();
                    break;
                } else {
                    System.out.println("Ingresa un valor valido");
                    entrada.next(); // limpiamos la entrada invalida
                }
            }
            // Comprobación de que este dentro de los rangos del tablero
            if (columna >= tablero.length || fila >= tablero.length) {
                System.out.println("Ingrese una posición valida");
                continue;
            }
            // Comprobación que no sea una ubicación repetida
            if (tablero[fila][columna] != "0" && tablero[fila][columna] != "1") {
                System.out.println("Posición repetida, Ingrese una valida");
                continue;
            }
            // Evaluación del turno
            switch (tablero[fila][columna]) {
                case "1":
                    System.out.printf(LETRA_VERDE + "¡Tocado!%n" + RESET);
                    tablero[fila][columna] = "X";
                    intentos++;
                    barcos--;
                    break;
                case "0":
                    System.out.printf(LETRA_AZUL + "Agua%n" + RESET);
                    tablero[fila][columna] = "~";
                    intentos++;
                    break;
                default:
                    System.out.println("Ingrese un valor valido");
                    break;
            }
            // Tablero con las jugadas actuales
            System.out.printf(" ");
            for (int i = 0; i < tablero.length; i++) {
                System.out.printf(LETRA_AMARILLA + "%s ", (0 + i));
            }
            System.out.println();
            for (int i = 0; i < tablero.length; i++) {
                System.out.printf(LETRA_AMARILLA + "%s | " + RESET, (0 + i));
                for (int j = 0; j < tablero.length; j++) {
                    if (tablero[i][j] == "~") {
                        System.out.printf(LETRA_AZUL + "%-2s" + RESET, tablero[i][j]);
                    } else if (tablero[i][j] == "X") {
                        System.out.printf(LETRA_ROJA + "%-2s" + RESET, tablero[i][j]);
                    } else {
                        System.out.printf(LETRA_VERDE + "%-2s" + RESET, "-");
                    }
                    if (j + 1 == tablero.length) {
                        System.out.println();
                    }
                }
            }
            // Condiciones de finalizacion
            if (barcos == 0) {
                System.out.printf(LETRA_VERDE + "¡Victoria!%n" + RESET);
                break;
            }
            if (intentos > 10) {
                System.out.printf(LETRA_ROJA + "Derrota%n" + RESET + " Los barcos estaban en estas posiciones:%n");
                System.out.printf(" ");
                for (int i = 0; i < tablero.length; i++) {
                    System.out.printf(LETRA_AMARILLA + "%s ", (0 + i));
                }
                System.out.println();
                for (int i = 0; i < tablero.length; i++) {
                    System.out.printf(LETRA_AMARILLA + "%s |" + RESET, (0 + i));
                    for (int j = 0; j < tablero.length; j++) {
                        if (tablero[i][j] == "~") {
                            System.out.printf(LETRA_AZUL + "%-2s" + RESET, tablero[i][j]);
                        } else if (tablero[i][j] == "X") {
                            System.out.printf(LETRA_ROJA + "%-2s" + RESET, tablero[i][j]);
                        } else {
                            System.out.printf(LETRA_VERDE + "%-2s" + RESET, tablero[i][j]);
                        }
                        if (j + 1 == tablero.length) {
                            System.out.println("Mas suerte la próxima vez capitán");
                        }
                    }
                }
            }
        }
        entrada.close();
    }
}