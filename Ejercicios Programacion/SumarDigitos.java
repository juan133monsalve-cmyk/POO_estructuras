import java.util.Scanner;
public class SumarDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar Numero");
        int numero = sc.nextInt();
        while(numero >= 10){
            int suma = 0;
            while(numero > 0){
                suma = suma + (numero % 10);
                numero = numero / 10;
            }
            numero = suma;
        }
        
        System.out.println(numero);
        sc.close();
        
    }
}
