package tiendaVideojuegos;

import java.util.Scanner;

public class tienda {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        String[][] tabla = {{"Videojuego 1", "Videojuego 2", "Videojuego 3"},
                            {"Callof","Halo", "Battelfield"},
                            {"FIFA", "NBA2k","NFL"},
                            {"Final Fantasy", "Zelda","Skyrim"},
        };
        int opcion;
        do{    
            System.out.println("Bienvenido al la tienda CaCa");
                    
            System.out.println("-----Menu-----");
            System.out.println("Elige una de estas opciones:");
            System.out.println("1- Mostrar inventario");
            System.out.println("2- Añadir o actualizar un videojuego");
            System.out.println("3- Salir del programa");
            opcion = escaner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("----Inventario----");
                    for( int i = 0 ; i < tabla.length-1; i++){
                        for( int j= 0 ; j < tabla.length-1; j++){
                            System.out.print(tabla[i][j]+"\t");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("--- Añadir o actualizar videojuego");   
                    System.out.println("Elige la categoria (1-3):");
                    int categoria = escaner.nextInt()-1;
                    System.out.println("Elige el indice del videojuego (1-3)");
                    int indice = escaner.nextInt()-1;
                    escaner.nextLine();
                    System.out.println("introduce el nombre del nuevo juego");
                    String juego = escaner.nextLine();
                    tabla[categoria][indice] = juego;

                    System.out.println("----Inventario----");
                    for( int i = 0 ; i < tabla.length-1; i++){
                        for( int j= 0 ; j < tabla.length-1; j++){
                            System.out.print(tabla[i][j]+"\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("cerrando menu");
                    break;
                default:
                    System.out.println("introduce una opcion correcta");
                    break;
            }
        }while(opcion!=3);

    }
    }

