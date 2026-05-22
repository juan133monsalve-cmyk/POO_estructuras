package ejemplos;
import java.util.Scanner;
public class Sumas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numero = sc.nextInt();
        long sumaDigitos = 0;

    while (numero >= 1) {

        sumaDigitos = 0;
    
        while(numero > 0){
            sumaDigitos += numero%10;
            numero /= 10;
        }
        numero = sumaDigitos;
    }
    System.out.println("La suma de los dígitos es: " + sumaDigitos);

    sc.close();
}
}
