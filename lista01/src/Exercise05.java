import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, num1, num2;
        double price1, price2, result;

        System.out.println("Digite o codigo, numero de peças e valor unitário da peça 01: ");

        cod1 = sc.nextInt();
        num1 = sc.nextInt();
        price1 = sc.nextDouble();

        System.out.println("Digite o codigo, numero de peças e valor unitário da peça 02: ");

        cod2 = sc.nextInt();
        num2 = sc.nextInt();
        price2 = sc.nextDouble();

        result = (num1 * price1) + (num2 * price2);

        System.out.printf("VALOR A PAGAR: R$%.2f", result);


    }
}
