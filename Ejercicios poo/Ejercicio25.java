import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anio = sc.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0)
                || anio % 400 == 0) {

            System.out.println("Bisiesto");

        } else {

            System.out.println("No bisiesto");
        }

        sc.close();
    }
}