import java.util.Scanner;

public class Ejercicio34 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edad;

        do {

            System.out.print("Ingrese su edad: ");
            edad = sc.nextInt();

            if (edad < 1 || edad > 120) {
                System.out.println("Edad inválida");
            }

        } while (edad < 1 || edad > 120);

        if (edad >= 1 && edad <= 12) {
            System.out.println("Etapa: Niñez");
        } else if (edad <= 17) {
            System.out.println("Etapa: Adolescencia");
        } else if (edad <= 25) {
            System.out.println("Etapa: Juventud");
        } else if (edad <= 59) {
            System.out.println("Etapa: Adultez");
        } else {
            System.out.println("Etapa: Tercera edad");
        }

        sc.close();
    }
}