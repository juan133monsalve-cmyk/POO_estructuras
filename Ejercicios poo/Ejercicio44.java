import java.util.Scanner;

public class Ejercicio44 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] ventas = new double[4][3];

        double mayor = 0;
        int sucursalMayor = 0;
        int productoMayor = 0;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Venta sucursal " +
                        (i + 1) + " producto " +
                        (j + 1) + ": ");

                ventas[i][j] = sc.nextDouble();

                if (ventas[i][j] > mayor) {

                    mayor = ventas[i][j];
                    sucursalMayor = i;
                    productoMayor = j;
                }
            }
        }

        System.out.println("\nVentas por sucursal");

        for (int i = 0; i < 4; i++) {

            double suma = 0;

            for (int j = 0; j < 3; j++) {
                suma += ventas[i][j];
            }

            System.out.println("Sucursal " +
                    (i + 1) + ": $" + suma);
        }

        System.out.println("\nVentas por producto");

        for (int j = 0; j < 3; j++) {

            double suma = 0;

            for (int i = 0; i < 4; i++) {
                suma += ventas[i][j];
            }

            System.out.println("Producto " +
                    (j + 1) + ": $" + suma);
        }

        System.out.println("\nVenta más alta: $" + mayor);

        System.out.println("Sucursal: " +
                (sucursalMayor + 1));

        System.out.println("Producto: " +
                (productoMayor + 1));

        sc.close();
    }
}