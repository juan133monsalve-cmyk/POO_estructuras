import java.util.Scanner;

public class Ejercicio43 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[8];

        for (int i = 0; i < nombres.length; i++) {

            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }

        System.out.print("Nombre a buscar: ");
        String buscar = sc.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < nombres.length; i++) {

            if (nombres[i].equalsIgnoreCase(buscar)) {

                System.out.println("Encontrado en posición: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No encontrado");
        }

        sc.close();
    }
}