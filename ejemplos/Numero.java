package ejemplos;
import java.util.Scanner;
public class Numero {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Dame un numero de dos cifras y te lo separo we");
        int num = sc.nextInt();
        while(num <= 9 || num >= 100){
            System.out.println("pero deme uno de dos cifras.-.");
            num = sc.nextInt();
        }
        int Sep = num%10;
        int SWP = num/10;
        System.out.println("Tu numero separado es we " + SWP + " " + Sep);

        sc.close();
    }
}
