import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Horas: ");
        int horas = sc.nextInt();

        System.out.print("Valor hora: ");
        double valor = sc.nextDouble();

        double bruto = horas * valor;
        double ss = bruto * 0.08;
        double ret = bruto * 0.05;
        double neto = bruto - ss - ret;

        System.out.println("Empleado: " + nombre);
        System.out.println("salario bruto: " + bruto);
        System.out.println("descuento 8%: " + ss);
        System.out.println("retencion 5%: " + ret);
        System.out.println("Salario neto: " + neto);
        


        sc.close();
    }
}
