import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();

        System.out.print("Final: ");
        double nf = sc.nextDouble();

        double definitiva = n1 * 0.3 + n2 * 0.3 + nf * 0.4;

        System.out.println("Definitiva: " + definitiva);

        String r = definitiva >= 3 ? "Aprueba" : "Reprueba";

        System.out.println(r);

        sc.close();
    }
}