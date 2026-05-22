import java.util.Scanner;

public class Ejercicio32 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int intento = 0;
        int contador = 0;

        System.out.println("Adivina el número entre 1 y 100");

        while (intento != numeroSecreto) {

            System.out.print("Ingresa un número: ");
            intento = sc.nextInt();

            contador++;

            if (intento < numeroSecreto) {

                System.out.println("El número es mayor");

            } else if (intento > numeroSecreto) {

                System.out.println("El número es menor");

            } else {

                System.out.println("¡Correcto!");
            }
        }

        System.out.println("Intentos realizados: " + contador);

        sc.close();
    }
}