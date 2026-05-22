import java.util.Scanner;

public class Ejercicio35 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número inicial: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el número final: ");
        int b = sc.nextInt();
        int cantidad = 0;
        int suma = 0;
        System.out.print("Primos: ");

        for (int num = a; num <= b; num++) {

            if (num < 2) {
                continue;
            }
            boolean primo = true;
            int divisor = 2;

            while (divisor <= Math.sqrt(num)) {
                if (num % divisor == 0) {
                    primo = false;
                    break;
                }
                divisor++;
            }
            if (primo) {

                System.out.print(num + " ");

                cantidad++;
                suma += num;
            }
        }

        System.out.println("\nCantidad: " + cantidad);
        System.out.println("Suma: " + suma);

        sc.close();
    }
}