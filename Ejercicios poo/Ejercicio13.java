import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        double base = sc.nextDouble();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        System.out.print("Radio: ");
        double radio = sc.nextDouble();

        double areaRect = base * altura;
        double periRect = 2 * (base + altura);

        double areaCir = Math.PI * radio * radio;
        double circ = 2 * Math.PI * radio;

        System.out.println("Area rectangulo: " + areaRect);
        System.out.println("Perimetro rectangulo: " + periRect);

        System.out.println("Area circulo: " + areaCir);
        System.out.println("Circunferencia: " + circ);

        sc.close();
    }
}
