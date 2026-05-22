import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Minutos: ");
        int min = sc.nextInt();

        int horas = min / 60;
        int resto = min % 60;
        int segundos = min * 60;

        System.out.println(horas + " horas");
        System.out.println(resto + " minutos");
        System.out.println(segundos + " segundos");

        sc.close();
    }
}