import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tipo = sc.nextInt();
        int horas = sc.nextInt();

        int total = 0;

        switch (tipo) {

            case 1:
                total = 2000 + (horas - 1) * 1500;
                break;

            case 2:
                total = 4000 + (horas - 1) * 3000;
                break;

            case 3:
                total = 5000 + (horas - 1) * 4000;
                break;

            default:
                System.out.println("Error");
        }

        System.out.println(total);

        sc.close();
    }
}