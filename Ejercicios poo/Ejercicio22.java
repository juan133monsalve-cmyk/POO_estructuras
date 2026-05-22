import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double peso = sc.nextDouble();
        double estatura = sc.nextDouble();

        double imc = peso / (estatura * estatura);

        System.out.println(imc);

        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc < 25) {
            System.out.println("Normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }

        sc.close();
    }
}