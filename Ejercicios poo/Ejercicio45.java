import java.util.Scanner;

public class Ejercicio45 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] tablero = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        char jugador = 'X';
        boolean ganador = false;
        int movimientos = 0;

        while (!ganador && movimientos < 9) {

            for (int i = 0; i < 3; i++) {

                System.out.println();

                for (int j = 0; j < 3; j++) {

                    System.out.print(" " +
                            tablero[i][j] + " ");

                    if (j < 2) {
                        System.out.print("|");
                    }
                }

                System.out.println();

                if (i < 2) {
                    System.out.println("-----------");
                }
            }

            System.out.println("\nTurno de: " + jugador);

            System.out.print("Fila: ");
            int fila = sc.nextInt();

            System.out.print("Columna: ");
            int columna = sc.nextInt();

            if (tablero[fila][columna] == ' ') {

                tablero[fila][columna] = jugador;
                movimientos++;

                for (int i = 0; i < 3; i++) {

                    if (tablero[i][0] == jugador &&
                        tablero[i][1] == jugador &&
                        tablero[i][2] == jugador) {

                        ganador = true;
                    }

                    if (tablero[0][i] == jugador &&
                        tablero[1][i] == jugador &&
                        tablero[2][i] == jugador) {

                        ganador = true;
                    }
                }

                if (tablero[0][0] == jugador &&
                    tablero[1][1] == jugador &&
                    tablero[2][2] == jugador) {

                    ganador = true;
                }

                if (tablero[0][2] == jugador &&
                    tablero[1][1] == jugador &&
                    tablero[2][0] == jugador) {

                    ganador = true;
                }

                if (!ganador) {

                    if (jugador == 'X') {
                        jugador = 'O';
                    } else {
                        jugador = 'X';
                    }
                }

            } else {
                System.out.println("Celda ocupada");
            }
        }

        if (ganador) {
            System.out.println("Ganó: " + jugador);
        } else {
            System.out.println("Empate");
        }

        sc.close();
    }
}