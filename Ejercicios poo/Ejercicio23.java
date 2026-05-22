import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota = sc.nextDouble();

        if (nota >= 4.6) {
            System.out.println("A");
        } else if (nota >= 4.0) {
            System.out.println("B");
        } else if (nota >= 3.5) {
            System.out.println("C");
        } else if (nota >= 3.0) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        sc.close();
    }
}