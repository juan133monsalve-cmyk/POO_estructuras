import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Celsius: ");
        double c = sc.nextDouble();
        double f = (c * 9 / 5) + 32;
        double k = c + 273.15;
        System.out.println("Fahrenheit: " + f);
        System.out.println("Kelvin: " + k);

        sc.close();
    }
}