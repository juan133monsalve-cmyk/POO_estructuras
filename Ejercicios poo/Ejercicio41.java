import java.util.Scanner;

public class Ejercicio41 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[10];

        double suma = 0;
        double mayor = -1;
        double menor = 6;

        int posMayor = 0;
        int posMenor = 0;

        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            suma += notas[i];

            if (notas[i] > mayor) {
                mayor = notas[i];
                posMayor = i;
            }

            if (notas[i] < menor) {
                menor = notas[i];
                posMenor = i;
            }

            if (notas[i] >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        double promedio = suma / notas.length;

        System.out.printf("Promedio: %.2f\n", promedio);

        System.out.println("Mayor: " + mayor +
                " posición: " + posMayor);

        System.out.println("Menor: " + menor +
                " posición: " + posMenor);

        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);

        sc.close();
    }
}