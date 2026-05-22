import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        int sumaNaturales = 0;
        int sumaPares = 0;
        int sumaCuadrados = 0;

        for (int i = 1; i <= n; i++) {

            sumaNaturales += i;
            sumaPares += (2 * i);
            sumaCuadrados += (i * i);
        }

        int formulaNaturales = n * (n + 1) / 2;
        int formulaPares = n * (n + 1);
        int formulaCuadrados = n * (n + 1) * (2 * n + 1) / 6;

        System.out.println("\nSuma naturales: " + sumaNaturales);
        System.out.println("Fórmula: " + formulaNaturales);

        System.out.println("\nSuma pares: " + sumaPares);
        System.out.println("Fórmula: " + formulaPares);

        System.out.println("\nSuma cuadrados: " + sumaCuadrados);
        System.out.println("Fórmula: " + formulaCuadrados);

        sc.close();
    }
}