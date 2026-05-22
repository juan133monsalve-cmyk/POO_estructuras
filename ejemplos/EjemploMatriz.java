package ejemplos;
public class EjemploMatriz {

    public static void main(String[] args) {

        int filas    = 4;
        int columnas = 4;

        // Crear y llenar la matriz
        int[][] tabla = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tabla[i][j] = (i + 1) * (j + 1);
            }
        }

        // Imprimir la matriz
        System.out.println("Tabla de multiplicar (1 al 4):");
        System.out.println();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%4d", tabla[i][j]);
            }
            System.out.println();
        }
    }
}